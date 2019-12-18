public class Main implements Runnable {

    long xTime = System.nanoTime();
    public static boolean terminator = false;
    public static int pWins = 0;
    public static int dWins = 0;

    //screen refresh rate
    public int Hz = 100;

    GUI gui = new GUI();

    public static void main(String[] args) {
        new Thread(new Main()).start();
    }

    @Override
    public void run() {
        while(terminator == false) {
            if (System.nanoTime() - xTime >= 1000000000/Hz) {
                gui.refresher();
                gui.repaint();
                xTime = System.nanoTime();
            }
        }
    }
}
