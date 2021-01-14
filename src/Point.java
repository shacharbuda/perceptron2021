import java.awt.*;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int target() {
        if (x >= y) return -1;
        else return 1;
    }

    public boolean isCorrect(int guess) {
        return (this.target() == guess);
    }

    public Color color() {
        // TODO: change with actual guess
        if (this.isCorrect(1)) return Color.green;
        return Color.red;
    }
}
