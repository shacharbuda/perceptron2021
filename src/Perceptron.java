import java.util.concurrent.ThreadLocalRandom;

public class Perceptron {

    private static double randDouble(double min, double max) {
        // +1 to make inclusive.
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }

    private double[] weights = new double[]{ randDouble(-1, 1), randDouble(-1, 1)};
    // Learning rate
    private double LR = 0.1;
    // TODO:  bias

    // x and y of point is the "2" inputs of the perceptron
    public int feedForward(Point pntInput) {
        // Formula: Sum of inputs * weight passed through activation func.
        return activationFunc(pntInput.x * weights[0] + pntInput.y * weights[1]);
    }

    // Desired output - actual output
    private int getError(int guess, int target) {
        return target - guess;
    }

    private void train(Point pntInput, int target) {
        int guess = this.feedForward(pntInput);
        int error = this.getError(guess, target);

        // adjust weights based on gradient descent.
        for (int i = 0; i < this.weights.length; i++) {
            this.weights[i] = this.weights[i] + error * this.LR;
        }
    }

    private int activationFunc(double sum) {
        if (sum > 0) return 1;
        return -1;
    }
}
