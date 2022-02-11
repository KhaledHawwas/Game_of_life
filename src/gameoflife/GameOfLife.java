package gameoflife;

import java.util.ArrayList;

public class GameOfLife {

    public static final float refreshTime = 0.2f;

    public static boolean run;
    /**all game rules*/
    public static ArrayList<Rule> rules = new ArrayList<>();

    public static Board gameBoard;
    public static GameFrame gameFrame;

    private static Thread gameThread;

    public static void main(String[] args) {
        initRules();
        
        gameBoard = new Board(40, 50);
        gameBoard.setRule(rules.get(0));
        gameBoard.random(6);
        
        gameFrame = new GameFrame();
        gameFrame.setVisible(true);
        
        gameThread = new Thread(new GameRunner());
        gameThread.start();

    }

    private static void initRules() {
        rules.add(new NormalRule("life", "23/3"));
        rules.add(new NormalRule("High Life", "23/36"));
        rules.add(new NormalRule("Sponge cells", "01234567/456"));
        rules.add(new NormalRule("Drills", "24567/3"));
        rules.add(new NormalRule("Condensation", "125678/367"));
        rules.add(new NormalRule("Custome", " / "));
    }

}
