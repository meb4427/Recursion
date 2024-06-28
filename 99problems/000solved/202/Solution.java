class Solution {
    public static boolean isPalindromeInteger(int n) {
        String intStr = String.valueOf(n);
        int left = 0;
        int right = intStr.length() - 1;

        while (left < right) {
            if (intStr.charAt(left) != intStr.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("isPalindromeInteger(12222) --> " + isPalindromeInteger(12222));
        System.out.println("isPalindromeInteger(12321) --> " + isPalindromeInteger(12321));
        System.out.println("isPalindromeInteger(22782) --> " + isPalindromeInteger(22782));
        System.out.println("isPalindromeInteger(189981) --> " + isPalindromeInteger(189981));
        System.out.println("isPalindromeInteger(1) --> " + isPalindromeInteger(1));
        System.out.println("isPalindromeInteger(987823) --> " + isPalindromeInteger(987823));
    }
}
