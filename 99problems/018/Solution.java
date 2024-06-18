class Solution {
    public static String leetify(String stringInput) {
        String[][] replacements = {
                { "(?i)a", "4" },
                { "(?i)b", "8" },
                { "(?i)e", "3" },
                { "(?i)l", "1" },
                { "(?i)o", "0" },
                { "(?i)s", "5" },
                { "(?i)t", "7" },
                { "(?i)z", "2" }
        };

        for (String[] replacement : replacements) {
            stringInput = stringInput.replaceAll(replacement[0], replacement[1]);
        }
        return stringInput;
    }

    public static void main(String[] args) {
        System.out.println(leetify("leetcode")); // 1337c0d3
        System.out.println(leetify("LEETCODE")); // 1337C0D3
        System.out.println(leetify("LeeTCoDE")); // 1337C0D3
        System.out.println(leetify("apple")); // 4pp13
        System.out.println(leetify("APPLE")); // 4PP13
        System.out.println(leetify("ApPlE")); // 4pP13
    }
}
