class Solution {
    public static boolean isSquareRootCloseEnough(double a, double b) {
        return Math.abs(a - b) / b < b * 0.0001;
    }

    public static double squareRootWhile(double x) {
        double guess = 1;
        while (!isSquareRootCloseEnough(x / guess, guess)) {
            guess = (guess + x / guess) / 2;
        }
        return guess;
    }

    public static void main(String[] args) {
        System.out.println(squareRootWhile(65));}
}
