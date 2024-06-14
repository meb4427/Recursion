import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Solution {
    public static double powerXOfN(double x, int n) {
        if (n < 0) {
            return powerXOfNHelper(1 / x, -n, 1.0);
        }
        return powerXOfNHelper(x, n, 1.0);
    }

    public static double powerXOfNHelper(double x, int n, double ans) {
        if (n == 0) {
            return roundingDown(ans, 1);
        } else {
            return powerXOfNHelper(x, n - 1, ans * x);
        }
    }

    public static double roundingDown(double number, int m) {
        return Math.floor(number * Math.pow(10, m)) / Math.pow(10, m);
    }

    public static void main(String[] args) {
        System.out.println(powerXOfN(2, 5)); // --> 32
        System.out.println(powerXOfN(2.1, 3)); // --> 9.2
        System.out.println(powerXOfN(2, -2)); // --> 0.2
        System.out.println(powerXOfN(2, -10)); // --> 0
        System.out.println(powerXOfN(3, -7)); // --> 0
        System.out.println(powerXOfN(3.3, 6)); // --> 1291.4
        System.out.println(powerXOfN(8.1, 9)); // --> 150094635.2
        System.out.println(powerXOfN(8.96, 10)); // --> 3334879120.2
    }
}
