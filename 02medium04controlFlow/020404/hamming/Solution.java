class Solution {
    public static int hammingDistanceInString(String string1, String string2) {
        int count = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistanceInString("toned", "roses")); // Expected: 3
        System.out.println(hammingDistanceInString("toned", "toned")); // Expected: 0
        System.out.println(hammingDistanceInString("cats", "dogs")); // Expected: 3
        System.out.println(hammingDistanceInString("dogandcat", "catanddog"));// Expected: 6
        System.out.println(hammingDistanceInString("AABBCCDD", "AAAACCCC")); // Expected: 4
    }
}
