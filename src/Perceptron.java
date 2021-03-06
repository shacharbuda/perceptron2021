public class Perceptron {

    private final double[] weights = new double[]{ Utils.randDouble(-1, 1), Utils.randDouble(-1, 1)};
    // Learning rate
    private final double LR = 0.005;
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

    public void train(Point pntInput, int target) {
        int guess = this.feedForward(pntInput);
        int error = this.getError(guess, target);

        if (error == 0) {
            System.out.println("no error - weights are same");
            return;
        }

        // adjust weights based on gradient descent.
//        for (int i = 0; i < this.weights.length; i++) {
        // TODO: deploy pntInput and weights (weights * pntInput) instead of two lines.
        this.weights[0] += error * pntInput.x * this.LR;
        this.weights[1] += error * pntInput.y * this.LR;
//        }

        System.out.println(weights[0]);
        System.out.println(weights[1]);
    }

    private int activationFunc(double sum) {
        if (sum > 0) return 1;
        return -1;
    }
}
