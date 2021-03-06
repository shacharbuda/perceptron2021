import java.io.IOException;

public class Main {

    private static Point getRandomPnt() {
        return new Point(Utils.randInt(0, Consts.WIDTH), Utils.randInt(0, Consts.HEIGHT));
    }

    private static void guessPnt(Perceptron brain, Point pnt) {
        int guess = brain.feedForward(pnt);
        pnt.setGuess(guess);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Point[] pnts = new Point[100];

        // TODO: switch to map func
        for (int i = 0; i < pnts.length; i++) {
            pnts[i] = getRandomPnt();
        }

        Perceptron brain = new Perceptron();
        for (Point pnt: pnts) {
            guessPnt(brain, pnt);
        }

        // Draw once
        Drawing myDraw = new Drawing(pnts);

        for (int i = 0; i < 1000; i++) {
            System.out.println("training iteration " + i);
            Point p = getRandomPnt();
            int target = p.getTarget();

            brain.train(p, target);

            // guess again after training iteration!
            for (Point pnt: pnts) {
                guessPnt(brain, pnt);
            }
            // Draw again
            Thread.sleep(200);
            myDraw.repaint();
        }

    }
}
