class Solution {
    public static long factorial(int n) {
        long result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("factorial(2) --> " + factorial(2));
        System.out.println("factorial(3) --> " + factorial(3));
        System.out.println("factorial(5) --> " + factorial(5));
        System.out.println("factorial(10) --> " + factorial(10));
        System.out.println("factorial(15) --> " + factorial(15));
    }
}
