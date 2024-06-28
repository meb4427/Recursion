class Solution {
    public static int countCharactersAfterN(String[] arr) {
        int count = 0;
        for (String s : arr) {
            for (char c: s.toCharArray()) {
                if (c >= 'n') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCharactersAfterN(new String[]{"the wood","pecked peckers","at the inn","tomorrowland"}));
        System.out.println(countCharactersAfterN(new String[]{"he","fumbled","in","the","darkness","looking","for","the","light","switch"}));
        System.out.println(countCharactersAfterN(new String[]{"he","is","never","at","home","on","weekends"}));
    }
}
