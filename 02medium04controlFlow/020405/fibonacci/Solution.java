class Solution {
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int f1 = 0;
        int f2 = 1;
        int prevF1;
        for (int i = 2; i <= n; i++) {
            prevF1 = f1;
            f1 = f2;
            f2 = prevF1 + f2;
        }
        return f2;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5)); // Expected: 5
        System.out.println(fibonacci(9)); // Expected: 34
        System.out.println(fibonacci(10)); // Expected: 55
        System.out.println(fibonacci(19)); // Expected: 4181
    }
}
