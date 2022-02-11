package gameoflife;

import static gameoflife.GameOfLife.gameBoard;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *this class draw the game.
 */
public class GamePanel extends JPanel {

    public static Color backgroundColor = new Color(220, 200, 220),
            aliveCellColor = new Color(30, 185, 140);
    private int ScaleSize;

    @Override
    public void paint(Graphics g) {
        if (GameOfLife.gameBoard != null) {
            int scalesWidth = GameOfLife.gameBoard.getScales().getWidth();
            int scalesHieght = GameOfLife.gameBoard.getScales().getHeight();
            ScaleSize = Math.min(this.getWidth() / scalesWidth, this.getHeight() / scalesHieght);
            //print background
            g.setColor(backgroundColor);
            g.fillRect(0, 0, ScaleSize * scalesWidth, ScaleSize * scalesHieght);
            //print cells
            g.setColor(aliveCellColor);
            for (int y = 0; y < scalesHieght; y++) {
                for (int x = 0; x < scalesWidth; x++) {
                    if (GameOfLife.gameBoard.getScales().getAt(x, y)) {
                        g.fillRect(ScaleSize * x, ScaleSize * y, ScaleSize, ScaleSize);
                    }
                }
            }
        }
    }

    public int getScaleSize() {
        return ScaleSize;
    }

    /**     
     * kill or revival cell when user click.
     * @param mx mouse x position 
     * @param my mouse y position
     */
    public void click(int mx, int my) {
        int fx, fy;
        fx = mx / ScaleSize;
        fy = my / ScaleSize;
        if (fx>=0&&fy>=0&&fx <= gameBoard.getScales().getWidth() && fy <= gameBoard.getScales().getHeight()) {
            gameBoard.getScales().setAt(fx, fy, !gameBoard.getScales().getAt(fx, fy));
        }
    }

}
