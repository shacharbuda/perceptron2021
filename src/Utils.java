import java.util.concurrent.ThreadLocalRandom;

public class Utils {
    public static int randInt(int min, int max) {
        // +1 to make inclusive.
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static double randDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }
}
