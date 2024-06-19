class Solution {
    public static int divideBy3Count(int n) {
        int count = 0;
        while (n % 3 == 0) {
            count++;
            n /= 3;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(divideBy3Count(1));
        System.out.println(divideBy3Count(3));
        System.out.println(divideBy3Count(27));
        System.out.println(divideBy3Count(729));
        System.out.println(divideBy3Count(6561));
    }
}
