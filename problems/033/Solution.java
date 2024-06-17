class Solution {
    public static String toUpperHeadLowerTail(String word, char alphabet) {
        // return word.lastIndexOf(alphabet);
        int position = word.lastIndexOf(alphabet);
        if (position != -1) {
            return word.substring(0, position).toUpperCase() + word.substring(position).toLowerCase();
        } else {
            return word.toUpperCase();
        }
    }

    public static void main(String[] args) {
        System.out.println(toUpperHeadLowerTail("difficULty", 'i')); // DIFFiculty
        System.out.println(toUpperHeadLowerTail("liBrarY", 'r')); // LIBRAry
        System.out.println(toUpperHeadLowerTail("EcoNomIcs", 'u')); // ECONOMICS
        System.out.println(toUpperHeadLowerTail("AAAAAAAAA", 'A')); // AAAAAAAAa
        System.out.println(toUpperHeadLowerTail("ABABABA", 'A')); // ABABABa
        System.out.println(toUpperHeadLowerTail("ABABABA", 'B')); // ABABAba
        System.out.println(toUpperHeadLowerTail("A", 'A')); // a
        System.out.println(toUpperHeadLowerTail("a", 'A')); // A
    }
}
