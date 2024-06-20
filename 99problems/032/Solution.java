class Solution {
    public static String hideAddress(String address) {
        int atPosition = address.indexOf('@');

        if (atPosition <= 4) {
            return address;
        } else {
            String result = address.substring(0, 3) + "..." + address.substring(atPosition);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println((Solution.hideAddress("recursion@info.com")));
        System.out.println((Solution.hideAddress("bird@gmail.com")));
        System.out.println((Solution.hideAddress("apple@example.com")));
    }
}
