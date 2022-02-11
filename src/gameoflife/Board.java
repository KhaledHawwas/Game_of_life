package gameoflife;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * this class contain main function of the game.
 */
public class Board  {

    private Scales scales;
    private Rule rule;

    public Board(int w, int h) {
        scales = new Scales(w, h);
    }

    /**
     * run all make next generation for all cells. 
     */
    public void run() {
        int height = scales.getHeight(), width = scales.getWidth();
        Scales nextGeneration = new Scales(width, height);
        nextGeneration.setEdged(scales.isEdged());
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                    nextGeneration.setAt(x, y, rule.isLive(x, y, scales));              
            }
        }
        scales = nextGeneration;
    }

    public void random(int cellPresent) {
        int height = scales.getHeight(), width = scales.getWidth();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                scales.setAt(x, y, new Random().nextInt() % cellPresent == 0);
            }
        }
    }

    /**
     *remove all cells.
     */
    public void clear() {
        int height = scales.getHeight(), width = scales.getWidth();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                scales.setAt(x, y, false);
            }
        }
    }
//next are get and set
    public Scales getScales() {
        return scales;
    }

    public void setScales(Scales scales) {
        this.scales = scales;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

}
