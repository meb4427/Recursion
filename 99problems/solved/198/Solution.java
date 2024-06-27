class Solution {
    private static final int MAX_ABSENCES = 3;

    public static String doYouFail(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A') {
                count++;
                if (count >= MAX_ABSENCES) {
                    return "fail";
                }
            }
        }
        return "pass";
    }

    public static void main(String[] args) {
        System.out.println(doYouFail("AAPPAP"));
        System.out.println(doYouFail("AAPPAA"));
        System.out.println(doYouFail("PAPPA"));
    }
}
