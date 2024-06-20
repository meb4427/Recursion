class Solution {
    public static String notDivisibleNumbers(int x, int y) {
        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (int i = 1; i <= x; i++) {
            if (i % y != 0) {
                if (!first)
                    result.append("-");
                result.append(i);
                first = false;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(notDivisibleNumbers(20, 3));
        System.out.println(notDivisibleNumbers(50, 4));
        System.out.println(notDivisibleNumbers(100, 2));
    }
}
