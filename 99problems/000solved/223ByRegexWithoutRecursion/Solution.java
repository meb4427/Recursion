import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public static String firstUppercase(String s) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return "No upper";
        }
    }

    public static void main(String[] args) {
        System.out.println(firstUppercase("aBcdE")); // --> B
        System.out.println(firstUppercase("abcde")); // --> No upper
        System.out.println(firstUppercase(" A")); // --> A
        System.out.println(firstUppercase("hello WorLD")); // --> W
        System.out.println(firstUppercase("ABCDE")); // --> A
    }
}