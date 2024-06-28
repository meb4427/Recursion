class Solution {
    public static int charInBagOfWordsCount(String[] words, char ch) {
        int count = 0;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (c == ch) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(charInBagOfWordsCount(new String[] { "hello", "world" }, 'o'));
        System.out.println(charInBagOfWordsCount(new String[] { "hello", "world" }, 'p'));
        System.out.println(
                charInBagOfWordsCount(new String[] { "The", "tech", "giant", "is in the", "city center" }, 'p'));
        System.out.println(
                charInBagOfWordsCount(new String[] { "The", "tech", "giant", "is in the", "city center" }, 'e'));
    }
}
