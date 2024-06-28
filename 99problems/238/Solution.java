import java.util.Arrays;

class Solution {
    public static char[] generateAlphabet(char start, char end) {
        start = Character.toLowerCase(start);
        end = Character.toLowerCase(end);

        if (start > end) {
            char temp = start;
            start = end;
            end = temp;
        }

        char[] alphabet = new char[end - start + 1];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (start + i);
        }

        return alphabet;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateAlphabet('a', 'z')));
        System.out.println(Arrays.toString(generateAlphabet('b', 'b')));
        System.out.println(Arrays.toString(generateAlphabet('C', 'Z')));
        System.out.println(Arrays.toString(generateAlphabet('M', 'z')));
        System.out.println(Arrays.toString(generateAlphabet('z', 'a')));
    }
}
