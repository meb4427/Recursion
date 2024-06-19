class Solution {
    public static boolean isSquareRootCloseEnough(double a, double b) {
        return 100 * Math.abs((a - b) / b) < 0.01;
    }

    public static double squareRootHelper(double x, double guess) {
        double newGuess = (guess + x/guess) / 2;

        System.out.println("guess : " + String.valueOf(guess));
        System.out.println("newGuess : " + String.valueOf(newGuess));

        if (isSquareRootCloseEnough(newGuess, guess)) return newGuess;

        return squareRootHelper(x, newGuess);
    }

    public static double squareRoot(double x) {
        return squareRootHelper(x, 1);
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(65));}
}
