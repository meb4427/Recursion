class Solution {
    public static String caesarCipher(String message, int n) {
        message = message.replaceAll(" ", "");
        n = n % 26;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            int ascii = ((int) message.charAt(i)) + n;
            if (ascii > 122)
                res.append((char) (ascii - 26));
            else
                res.append((char) ascii);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println("caesarCipher(\"i love you\",0) --> " + caesarCipher("i love you", 0));
        System.out.println("caesarCipher(\"i love you\",1) --> " + caesarCipher("i love you", 1));
        System.out.println("caesarCipher(\"i love you\",2) --> " + caesarCipher("i love you", 2));
        System.out.println(
                "caesarCipher(\"the future belongs to those who believe in the beauty of their dreams\",2) --> "
                        + caesarCipher("the future belongs to those who believe in the beauty of their dreams", 2));
        System.out
                .println("caesarCipher(\"it is during our darkest moments that we must focus to see the light\",5) --> "
                        + caesarCipher("it is during our darkest moments that we must focus to see the light", 5));
        System.out.println(
                "caesarCipher(\"do not go where the path may lead go instead where there is no path and leave a trail\",10) --> "
                        + caesarCipher(
                                "do not go where the path may lead go instead where there is no path and leave a trail",
                                10));
    }
}
