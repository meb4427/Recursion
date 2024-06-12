class Solution {
    public static char divideEmployees(int num) {
        String s = "ABCDEEDCBA";
        if (num % 10 == 0)
            return 'A';
        else
            return (char) s.charAt(num % 10 - 1);
    }
}