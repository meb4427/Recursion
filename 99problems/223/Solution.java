class Solution {
    public static String firstUppercase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                return Character.toString(s.charAt(i));
        }
        return "No upper";
    }

    public static void main(String[] args) {
        System.out.println("firstUppercase(\"aBcdE\") --> " +
                firstUppercase("aBcdE"));
        System.out.println("firstUppercase(\"abcde\") --> " +
                firstUppercase("abcde"));
        System.out.println("firstUppercase(\" A\") --> " + firstUppercase(" A"));
        System.out.println("firstUppercase(\"hello WorLD\") --> " +
                firstUppercase("hello WorLD"));
        System.out.println("firstUppercase(\"ABCDE\") --> " +
                firstUppercase("ABCDE"));
    }
}
