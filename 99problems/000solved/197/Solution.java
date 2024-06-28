class Solution {
    public static boolean isPrime(int number) {
        if (number == 1)
            return false;
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;
        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(25));
        System.out.println(isPrime(29));
        System.out.println(isPrime(36));
        System.out.println(isPrime(45));
        System.out.println(isPrime(85));
        System.out.println(isPrime(455));
    }
}
