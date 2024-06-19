class Solution {
    public static int recursiveDigitsAdded(long digits) {
        int splited = splitAndAdd(digits);
        int sum = splited;

        while (splited > 9) {
            splited = splitAndAdd(splited);
            sum += splited;
        }
        return sum;
    }

    public static int splitAndAdd(long digits) {
        int sum = 0;
        while (true) {
            if (digits < 1) return sum;
            sum += digits % 10;
            digits /= 10;
        }
    }

    public static void main(String[] args) {
        System.out.println("recursiveDigitsAdded(5) --> " + recursiveDigitsAdded(5));
        System.out.println("recursiveDigitsAdded(8) --> " + recursiveDigitsAdded(8));
        System.out.println("recursiveDigitsAdded(12) --> " + recursiveDigitsAdded(12));
        System.out.println("recursiveDigitsAdded(98) --> " + recursiveDigitsAdded(98));
        System.out.println("recursiveDigitsAdded(3528) --> " + recursiveDigitsAdded(3528));
        System.out.println("recursiveDigitsAdded(99999999999884) --> " + recursiveDigitsAdded(99999999999884L));
        System.out.println("recursiveDigitsAdded(5462) --> " + recursiveDigitsAdded(5462));
        System.out.println("recursiveDigitsAdded(45622943) --> " + recursiveDigitsAdded(45622943));
        System.out.println("recursiveDigitsAdded(9514599) --> " + recursiveDigitsAdded(9514599));
    }
}
