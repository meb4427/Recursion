class Solution {
    public static String commonPrefix(String s1, String s2) {
        int targetLength = Math.min(s1.length(), s2.length());
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < targetLength; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                res.append(s1.charAt(i));
            } else {
                break;
            }
        }
        if (res.length() == 0) {
            return "";
        } else {
            return res.toString();
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
