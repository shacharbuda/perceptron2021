import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static int randInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static void main(String[] args) {
        Point[] pnts = new Point[100];
        for (int i = 0; i < pnts.length; i++) {
            pnts[i] = new Point(randInt(0, Consts.WIDTH), randInt(0, Consts.HEIGHT));

        }
        new Drawing(pnts);
    }
}
