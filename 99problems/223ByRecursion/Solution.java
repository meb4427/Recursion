class Solution {
    public static String firstUppercase(String s) {
        return firstUppercaseHelper(s, 0);
    }

    public static String firstUppercaseHelper(String s, int i) {
        if (i >= s.length()) {
            return "No upper";
        } else {
            if ((int) s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                return Character.toString(s.charAt(i));
            } else {
                return firstUppercaseHelper(s, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(firstUppercase("aBcdE")); // --> B
        System.out.println(firstUppercase("abcde")); // --> No upper
        System.out.println(firstUppercase(" A")); // --> A
        System.out.println(firstUppercase("hello WorLD")); // --> W
        System.out.println(firstUppercase("ABCDE")); // --> A
    }
}
