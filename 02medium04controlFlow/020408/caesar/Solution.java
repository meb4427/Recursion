class Solution {
    public static String caesarCipher(String message, int n) {
        message = message.replaceAll(" ", "");
        StringBuilder result = new StringBuilder();
        int shift = n % 26;

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int originalAscii = (int) currentChar;
            int shiftedAscii = originalAscii + shift;

            if (shiftedAscii > 'z') {
                shiftedAscii -= 26;
            }
            result.append((char) shiftedAscii);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("i love you", 0));
        System.out.println(caesarCipher("i love you", 1));
        System.out.println(caesarCipher("i love you", 2));
        System.out.println(caesarCipher("the future belongs to those who believe in the beauty of their dreams", 2));
        System.out.println(caesarCipher("it is during our darkest moments that we must focus to see the light", 5));
        System.out.println(caesarCipher(
                "do not go where the path may lead go instead where there is no path and leave a trail", 10));
    }
}
