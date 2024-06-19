class Solution {
    public static int countBetweenNumbers(int digit, int idStart, int idEnd) {
        int count = 0;
        char target = Integer.toString(digit).charAt(0);
        for (int i = idStart; i <= idEnd; i++) {
            String s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == target)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBetweenNumbers(1, 1, 20)); // Expected: 12
        System.out.println(countBetweenNumbers(5, 1, 100)); // Expected: 20
        System.out.println(countBetweenNumbers(3, 100, 250)); // Expected: 35
        System.out.println(countBetweenNumbers(3, 1, 1000)); // Expected: 300
        System.out.println(countBetweenNumbers(1, 1, 300)); // Expected: 160
        System.out.println(countBetweenNumbers(9, 899, 1000)); // Expected: 122
    }
}
