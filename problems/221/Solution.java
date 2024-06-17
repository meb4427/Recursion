class Solution {
    public static String mergeString(String s1, String s2) {
        return mergeStringHelper(s1, s2, "");
    }

    public static String mergeStringHelper(String s1, String s2, String result) {
        if (s1.length() == 0) {
            return result;
        } else {
            return mergeStringHelper(s1.substring(1), s2.substring(1), result + s1.charAt(0) + s2.charAt(0));
        }
    }

    public static void main(String[] args) {
        System.out.println(mergeString("abc", "def")); // --> adbecf
        System.out.println(mergeString("hello", "world")); // --> hweolrllod
        System.out.println(mergeString("a", "b")); // --> ab
    }
}
