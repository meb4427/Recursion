class Solution {
    public static int squareSummation(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(squareSummation(2)); // Expected: 5
        System.out.println(squareSummation(3)); // Expected: 14
        System.out.println(squareSummation(4)); // Expected: 30
        System.out.println(squareSummation(10)); // Expected: 385
        System.out.println(squareSummation(15)); // Expected: 1240
        System.out.println(squareSummation(100)); // Expected: 338350
        System.out.println(squareSummation(208)); // Expected: 3021304
    }
}
