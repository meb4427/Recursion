class Solution {
    public static int countSubstring(String string) {
        return countSubstringHelper(string, 0, 0, 0);
    }

    public static int countSubstringHelper(String string, int start, int end, int count) {
        if (start == string.length()) {
            return count;
        }

        if (end == string.length()) {
            return countSubstringHelper(string, start + 1, start + 1, count);
        }

        if (string.charAt(start) == string.charAt(end)) {
            return countSubstringHelper(string, start, end + 1, count + 1);
        } else {
            return countSubstringHelper(string, start, end + 1, count);
        }
    }

    public static void main(String[] args) {
        System.out.println(countSubstring("a"));
        System.out.println(countSubstring("aa"));
        System.out.println(countSubstring("aaa"));
        System.out.println(countSubstring("abc"));
        System.out.println(countSubstring("aba"));
        System.out.println(countSubstring("abcab"));
        System.out.println(countSubstring("abcaba"));
        System.out.println(countSubstring("helloworld"));
    }
}
