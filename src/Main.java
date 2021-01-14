import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static int randInt(int min, int max) {
        // +1 to make inclusive.
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private static Point getRandomPnt() {
        return new Point(randInt(0, Consts.WIDTH), randInt(0, Consts.HEIGHT));
    }

    public static void main(String[] args) {
        Point[] pnts = new Point[100];

        // TODO: switch to map func
        for (int i = 0; i < pnts.length; i++) {
            pnts[i] = getRandomPnt();
        }

        new Drawing(pnts);
    }
}
