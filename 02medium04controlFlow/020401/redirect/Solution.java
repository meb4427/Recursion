class Solution {
    public static String redirectionUrl(String language) {
        String url = "www.example.org/";

        // switch文
        switch (language) {
            case "English":
                url += "en";
                break;
            case "Japanese":
                url += "ja";
                break;
            case "Spanish":
                url += "es";
                break;
            case "Russian":
                url += "ru";
                break;
            default:
        }
        return url;
    }

    public static void main(String[] args) {
        System.out.println(redirectionUrl("English")); // Expected: www.example.org/en
        System.out.println(redirectionUrl("Japanese")); // Expected: www.example.org/ja
        System.out.println(redirectionUrl("Spanish")); // Expected: www.example.org/es
        System.out.println(redirectionUrl("Russian")); // Expected: www.example.org/ru
        System.out.println(redirectionUrl("German")); // Expected: www.example.org/de
    }
}
