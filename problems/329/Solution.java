class Solution {
    public static boolean isCommentOutValid(String s) {
        // int i = 0;
        while (s.length() > 0) {
            // System.out.println("i" + i + ":" + s);
            if (s.length() >= 4 && s.substring(0, 4).equals("/**/")) {
                s = s.substring(4);
                // i++;
            } else if (s.length() >= 2 && s.substring(0, 2).equals("//")) {
                s = s.substring(2);
                // i++;
            } else if (s.length() > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isCommentOutValid("//")); // true
        System.out.println(isCommentOutValid("///")); // false
        System.out.println(isCommentOutValid("////")); // true
        System.out.println(isCommentOutValid("/**/")); // true
        System.out.println(isCommentOutValid("/*/*/")); // false
        System.out.println(isCommentOutValid("/*//*/")); // false
        System.out.println(isCommentOutValid("/**//////**/")); // true
        System.out.println(isCommentOutValid("//////////////**")); // false
        System.out.println(isCommentOutValid("//**////**/")); // false
    }
}