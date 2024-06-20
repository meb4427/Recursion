class Solution {
    public static boolean isPalindrome(String stringInput) {
        stringInput = stringInput.toLowerCase().replaceAll(" ", "");
        int left = 0;
        int right = stringInput.length() - 1;

        while (left < right) {
            if (stringInput.charAt(left) != stringInput.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("isPalindrome(\"kayak\") --> " + isPalindrome("kayak"));
        System.out.println("isPalindrome(\"recursion\") --> " + isPalindrome("recursion"));
        System.out.println("isPalindrome(\"Top spot\") --> " + isPalindrome("Top spot"));
        System.out.println("isPalindrome(\"Was it a cat I saw\") --> " + isPalindrome("Was it a cat I saw"));
        System.out.println("isPalindrome(\"ad\") --> " + isPalindrome("ad"));
    }
}
