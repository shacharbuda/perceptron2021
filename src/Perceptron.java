import java.util.concurrent.ThreadLocalRandom;

public class Perceptron {

    private static double randDouble(double min, double max) {
        // +1 to make inclusive.
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }

    private double[] weights = new double[]{ randDouble(-1, 1), randDouble(-1, 1)};
    // TODO:  bias

    // x and y of point is the "2" inputs of the perceptron
    public int feedForward(Point pntInput) {
        // Formula: Sum of inputs * weight passed through activation func.
        return activationFunc(pntInput.x * weights[0] + pntInput.y * weights[1]);
    }

    private int activationFunc(double sum) {
        if (sum > 0) return 1;
        return -1;
    }
}
