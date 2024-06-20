class Solution {
    public static double interestsPaid(int initialLoan, boolean didPayOnTime) {
        double interest;
        interest = (didPayOnTime) ? 0.02 : 0.15;

        return initialLoan * (1.0 + interest) + 2.5;
    }

    public static void main(String[] args) {
        System.out.println(interestsPaid(100, true)); // Expected: 104.5
        System.out.println(interestsPaid(830, false)); // Expected: 957
        System.out.println(interestsPaid(100, false)); // Expected: 117.5
        System.out.println(interestsPaid(225, true)); // Expected: 232
        System.out.println(interestsPaid(225, false)); // Expected: 261.25
    }
}
