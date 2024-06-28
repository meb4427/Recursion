class Solution {
    public static boolean isFirstStringLarger(String s1, String s2) {
        return sumAsciiNumbers(s1) > sumAsciiNumbers(s2);
    }

    public static int sumAsciiNumbers(String s) {
        int total = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            total += s.charAt(i);
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(isFirstStringLarger("Fantastic", "Bridge"));
        System.out.println(isFirstStringLarger("Bridge", "Fantastic"));
        System.out.println(isFirstStringLarger("hello", "HelLo"));
        System.out.println(isFirstStringLarger("Appearances may deceive", "I think so too"));
        System.out.println(isFirstStringLarger("pool", "pooling"));
        System.out.println(isFirstStringLarger("magni", "est"));
    }
}
