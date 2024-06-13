class Solution {
    public static String swapPosition(String s) {
        return swapPositionHelper(s, "");
    }

    public static String swapPositionHelper(String s, String result) {
        if (s.length() <= 1) {
            return result + s;
        } else {
            return swapPositionHelper(s.substring(2), result + s.charAt(1) + s.charAt(0));
        }
    }

    public static void main(String[] args) {
        System.out.println(swapPosition("abcd")); // --> badc
        System.out.println(swapPosition("abcdefgh")); // --> badcfehg
        System.out.println(swapPosition("ab")); // --> ba
        System.out.println(swapPosition("abcde")); // --> badce
    }
}
