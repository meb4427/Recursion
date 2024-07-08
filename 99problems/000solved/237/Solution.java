import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static String[] validEmailList(String[] emailList) {
        ArrayList<String> validEmails = new ArrayList<String>();
        for (String email : emailList) {
            if (isValidEmail(email)) {
                validEmails.add(email);
            }
        }
        return validEmails.stream().toArray(String[]::new);
    }

    public static boolean isValidEmail(String email) {
        if (email.indexOf(" ") != -1) {
            return false;
        }
        if (countAtMark(email) != 1) {
            return false;
        }
        if (email.indexOf("@") == 0) {
            return false;
        }
        if (email.indexOf("@") < email.lastIndexOf(".")) {
            return true;
        } else {
            return false;
        }
    }

    public static int countAtMark(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                validEmailList(new String[] { "ccc@aaa.com", "c@cc@aaa.com", "cc c@aaa.com", "cc.c@aaa.com" })));
        System.out.println(
                Arrays.toString(validEmailList(new String[] { "c@cc@aaa.com", "cc c@aaa.com", "cc.c@aaacom" })));
        System.out.println(Arrays
                .toString(validEmailList(new String[] { "ccc@aaa.com", "cvsd@a.com", "tele@bb.aa", "cc.c@aaa.com" })));
        System.out
                .println(Arrays.toString(
                        validEmailList(new String[] { "c@cc@aaa.com", "tele@bb.aa", "cc.c@aaa.com", "ccc@aaa.com" })));
    }
}
