package calcActions;

public class Subtraction {
    public static double sub(double minuend, double... subtrahend) {
        for (int i = 0; i < subtrahend.length; i++) {
            minuend -= subtrahend[i];
        }

        return minuend;
    }
}
