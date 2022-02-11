package gameoflife;

public class Scales {

    private final int width, height;
    private final boolean[][] scales;
    private boolean edged = false;

    public Scales(int w, int h) {
        scales = new boolean[h][w];
        this.height = h;
        this.width = w;
    }

    /**
     *
     * @param x of selected cell
     * @param y of selected cell
     * @return return cells around around selected cell at x and y
     */
    public boolean[] getNeighbour(int x, int y) {
        int index = x + (y * width);
        int scalesNum = width * height;
        boolean[] n = new boolean[8];
        /**those variable if the scales not edged*/
        int tl/*top left*/, t/*top*/, tr/*top right*/,
            l/*left*/, r/*right*/,
            bl/*bottom left*/, b/*bottom*/, br/*right bottom*/;

        tl = (index - (width) - 1);
        tl = (tl < 0 ? tl + scalesNum : tl);
        n[0] = (edged ? (y > 0 && x > 0 && scales[y - 1][x - 1])
                : (scales[tl / width][tl % width]));
        t = (index - width);
        t = (t < 0 ? t + scalesNum : t);
        n[1] = (edged ? (y > 0 && scales[y - 1][x])
                : (scales[t / width][t % width]));
        tr = (index - width + 1);
        tr = (tr < 0 ? tr + scalesNum : tr);
        n[2] = (edged ? (y > 0 && x + 1 < width && scales[y - 1][x + 1])
                : (scales[tr / width][tr % width]));
        l = (index - 1);
        l = (l < 0 ? l + scalesNum : l);
        n[3] = (edged ? (x > 0 && scales[y][x - 1])
                : (scales[l / width][l % width]));
        r = (index + 1) % scalesNum;
        n[4] = (edged ? (x + 1 < width && scales[y][x + 1])
                : (scales[r / width][r % width]));
        bl = (index + width - 1) % scalesNum;
        n[5] = (edged ? (x > 0 && y + 1 < height && scales[y + 1][x - 1])
                : (scales[bl / width][bl % width]));
        b = (index + width) % scalesNum;
        n[6] = (edged ? (y + 1 < height && scales[y + 1][x])
                : (scales[b / width][b % width]));
        br = (index + width + 1) % scalesNum;
        n[7] = (edged ? (y + 1 < height && x + 1 < width && scales[y + 1][x + 1])
                : (scales[br / width][br % width]));
        return n;
    }
//next are set and get
    public void setEdged(boolean edged) {
        this.edged = edged;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean getAt(int x, int y) {
        return scales[y][x];
    }

    public boolean setAt(int x, int y, boolean val) {
        return scales[y][x] = val;
    }

    public boolean isEdged() {
        return edged;
    }

}
