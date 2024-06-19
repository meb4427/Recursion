class Main02040503 {
    public static int fibonacciNumberTail(int n) {
        return fibonacciNumberTailHelper(0, 1, n);
    }

    public static int fibonacciNumberTailHelper(int fn1, int fn2, int n) {
        if (n < 1)
            return fn1;
        return fibonacciNumberTailHelper(fn2, fn1 + fn2, n - 1);
    }

    public static int fibonacciNumberForLoopIteration(int n) {
        int fn1 = 0;
        int fn2 = 1;

        for (int i = 0; i < n; i++) {
            int prevFn1 = fn1;
            fn1 = fn2;
            fn2 = prevFn1 + fn2;
        }

        return fn1;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNumberTail(20));
        System.out.println(fibonacciNumberForLoopIteration(20));
    }
}
