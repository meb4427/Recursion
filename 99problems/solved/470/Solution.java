import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(primeArray(97)));
        System.out.println(Arrays.toString(primeArray(1)));
        System.out.println(Arrays.toString(primeArray(2)));
    }

    public static int[] primeArray(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n)
                .filter(x -> isPrime(x))
                .toArray();
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
