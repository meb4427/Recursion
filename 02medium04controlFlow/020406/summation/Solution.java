class Solution {
    public static int summationOfSummation(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                total += j;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(summationOfSummation(1)); // Expected: 1
        System.out.println(summationOfSummation(2)); // Expected: 4
        System.out.println(summationOfSummation(3)); // Expected: 10
        System.out.println(summationOfSummation(4)); // Expected: 20
        System.out.println(summationOfSummation(10)); // Expected: 220
    }
}
