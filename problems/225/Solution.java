class Solution {
    public static int lenString(String string) {
        return lenStringHelper(string, 0);
    }

    public static int lenStringHelper(String string, int sum) {
        if (string.length() == 0) {
            return sum;
        } else {
            return lenStringHelper(string.substring(1), sum + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(lenString("hello world")); // --> 11
        System.out.println(lenString("hello")); // --> 5
        System.out.println(lenString("a")); // --> 1
        System.out.println(lenString("Recursion")); // --> 9
    }
}
