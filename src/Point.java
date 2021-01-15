import java.awt.*;

public class Point {
    public int x;
    public int y;
    private int guess;
    private int target;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

        this.target = this.calcTarget();
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    private int calcTarget() {
        if (this.x >= this.y) return -1;
        else return 1;
    }

    public boolean isCorrect() {
        return (this.target == this.guess);
    }

    public Color color() {
        if (this.isCorrect()) return Color.green;
        return Color.red;
    }
}
