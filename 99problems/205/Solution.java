class Solution {
    public static String decimalToHexadecimal(int decNumber) {
        StringBuilder hex = new StringBuilder();
        String convertString = "0123456789ABCDEF";

        while (decNumber > 0) {
            hex.insert(0, convertString.charAt(decNumber % 16));
            decNumber /= 16;
        }
        return hex.toString();
    }

    public static void main(String[] args) {
        System.out.println("decimalToHexadecimal(532454) --> " + decimalToHexadecimal(532454));
        System.out.println("decimalToHexadecimal(90304) --> " + decimalToHexadecimal(90304));
        System.out.println("decimalToHexadecimal(28394) --> " + decimalToHexadecimal(28394));
        System.out.println("decimalToHexadecimal(15) --> " + decimalToHexadecimal(15));
        System.out.println("decimalToHexadecimal(74) --> " + decimalToHexadecimal(74));
    }
}
