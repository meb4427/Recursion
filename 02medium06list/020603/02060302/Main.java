class Main {
    public static int totalFoundInSentence(String[] sentences, char c) {
        int count = 0;
        for (int i = 0; i < sentences.length; i++) {
            String currentSentence = sentences[i];
            for (int j = 0; j < currentSentence.length(); j++) {
                if (Character.toLowerCase(currentSentence.charAt(j)) == Character.toLowerCase(c)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] list2 = new String[] { "The wood", "Pecked peckers", "At the inn", "Tomorrowland" };
        System.out.println(totalFoundInSentence(list2, 'a'));
    }
}
