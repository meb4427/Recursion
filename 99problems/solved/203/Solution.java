class Solution {
    public static int sumOfAllPrimes(int n) {
        if (n < 2)
            return 0;

        int sum = 0;
        for (int j = 2; j <= n; j++) {
            if (isPrime(j))
                sum += j;
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("sumOfAllPrimes(1) --> " + sumOfAllPrimes(1));
        System.out.println("sumOfAllPrimes(2) --> " + sumOfAllPrimes(2));
        System.out.println("sumOfAllPrimes(3) --> " + sumOfAllPrimes(3));
        System.out.println("sumOfAllPrimes(100) --> " + sumOfAllPrimes(100));
        System.out.println("sumOfAllPrimes(1000) --> " + sumOfAllPrimes(1000));
    }
}
