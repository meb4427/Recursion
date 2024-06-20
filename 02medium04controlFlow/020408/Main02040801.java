class Main02040801 {
    public static String findLetter(String sentence, char letter) {
        boolean found = false;
        String message = "Will we find [" + letter + "] in our message? ";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                found = true;
                break;
            }
        }

        return found ? message + "It looks like we found it!" : message + "Sadly, we didn't find it.";
    }

    public static void main(String[] args) {
        System.out.println(findLetter("It is a sunny day.", 'a'));
        System.out.println(findLetter("It is a sunny day.", 'o'));
    }
}
