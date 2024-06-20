import java.util.StringJoiner;

class Solution {
    public static String divisor(int number) {
        StringJoiner res = new StringJoiner("-");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                res.add(Integer.toString(i));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println("divisor(28) --> " + divisor(28));
        System.out.println("divisor(29) --> " + divisor(29));
        System.out.println("divisor(720) --> " + divisor(720));
    }
}
