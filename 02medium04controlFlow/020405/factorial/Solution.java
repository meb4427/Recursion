class Solution {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(2)); // Expected: 2
        System.out.println(factorial(3)); // Expected: 6
        System.out.println(factorial(5)); // Expected: 120
        System.out.println(factorial(10)); // Expected: 3628800
        System.out.println(factorial(15)); // Expected: 1307674368000
    }
}
