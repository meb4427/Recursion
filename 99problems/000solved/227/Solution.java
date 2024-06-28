class Solution {
    public static String stringCompression(String s) {
        return stringCompressionHelper(s, 0, 1, 1, new StringBuilder());
    }

    public static String stringCompressionHelper(String s, int start, int end, int count, StringBuilder ans) {
        if (end == s.length()) {
            ans.append(s.charAt(start));
            if (count > 1) {
                ans.append(count);
            }
            return ans.toString();
        } else if (s.charAt(start) == s.charAt(end)) {
            return stringCompressionHelper(s, start, end + 1, count + 1, ans);
        } else {
            ans.append(s.charAt(start));
            if (count > 1) {
                ans.append(count);
            }
            return stringCompressionHelper(s, end, end + 1, 1, ans);
        }
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("aaabbb")); // --> a3b3
        System.out.println(stringCompression("aaabbbc")); // --> a3b3c
        System.out.println(stringCompression("aaabbbCCL")); // --> a3b3C2L
        System.out.println(stringCompression("aaabbbCCLL")); // --> a3b3C2L2
        System.out.println(stringCompression("abceeaaaddbbb")); // --> abce2a3d2b3
        System.out.println(stringCompression("aaabbbaaaaccaaaaba")); // --> a3b3a4c2a4ba
        System.out.println(stringCompression("a")); // --> a
    }
}
