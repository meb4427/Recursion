class Solution {
    public static String commonPrefix(String s1, String s2) {
        return commonPrefixHelper(s1, s2, "");
    }

    public static String commonPrefixHelper(String s1, String s2, String prefix) {
        if (s1.isEmpty() || s2.isEmpty()) {
            return prefix;
        } else if (s1.charAt(0) == s2.charAt(0)) {
            return commonPrefixHelper(s1.substring(1), s2.substring(1), prefix + s1.charAt(0));
        } else {
            return prefix;
        }
    }

    public static void main(String[] args) {
        System.out.println(commonPrefix("abcdefg", "abcxyz")); // --> abc
        System.out.println(commonPrefix("people", "people")); // --> people
        System.out.println(commonPrefix("autopilot", "autobiography")); // --> auto
        System.out.println(commonPrefix("aaa", "a")); // --> a
        System.out.println(commonPrefix("disappear", "dissect")); // --> dis
        System.out.println(commonPrefix("extracurricular", "extravagant")); // --> extra
        System.out.println(commonPrefix("submarine", "subsidiary")); // --> sub
        System.out.println(commonPrefix("unskilled", "unfinished")); // --> un
        System.out.println(commonPrefix("p", "p")); // --> p
    }
}
