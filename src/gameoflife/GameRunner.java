package gameoflife;

class GameRunner implements Runnable {
    
    @Override
    public void run() {
        try {
            for (;;) {
                long time = System.currentTimeMillis();
                if (GameOfLife.run) {
                    GameOfLife.gameBoard.run();
                    GameOfLife.gameFrame.refreshGamePanel();
                }
                Thread.sleep((long) Math.max(5, (GameOfLife.refreshTime * 1000) - (System.currentTimeMillis() - time)));
            }
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
    
}
