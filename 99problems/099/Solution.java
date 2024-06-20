import java.util.StringJoiner;

class Solution {
    public static String reverseWords(String sentence) {
        StringBuilder word = new StringBuilder();
        StringJoiner res = new StringJoiner(" ");

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                res.add(word.reverse().toString());
                word.setLength(0);
            } else {
                word.append(sentence.charAt(i));
            }
        }
        return res.add(word.reverse()).toString();
    }

    public static void main(String[] args) {
        System.out.println("reverseWords(\"olleh dlrow\") --> " + reverseWords("olleh dlrow"));
        System.out.println("reverseWords(\"hello world\") --> " + reverseWords("hello world"));
        System.out.println("reverseWords(\"Please wait outside of the house\") --> "
                + reverseWords("Please wait outside of the house"));
        System.out.println("reverseWords(\"He started to believe in ghosts\") --> "
                + reverseWords("He started to believe in ghosts"));
        System.out.println(
                "reverseWords(\"Red is greener than purple\") --> " + reverseWords("Red is greener than purple"));
    }
}
