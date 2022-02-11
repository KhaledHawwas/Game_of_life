package gameoflife;

public abstract class Rule {

    public abstract String getName();

    /**
     *
     * @param x cell x position
     * @param y cell y position
     * @param scales current scales
     * @return <code>true</code> if cell will be alive
     */
    public abstract boolean isLive(int x, int y, Scales scales);

    @Override
    public String toString() {
        return getName();
    }

}
