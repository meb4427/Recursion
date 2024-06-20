class Solution {
    public static String decimalToBinary(int decNumber) {
        StringBuilder binary = new StringBuilder();

        while (decNumber > 0) {
            binary.insert(0, decNumber % 2);
            decNumber /= 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println("decimalToBinary(60) --> " + decimalToBinary(60));
        System.out.println("decimalToBinary(26) --> " + decimalToBinary(26));
        System.out.println("decimalToBinary(35) --> " + decimalToBinary(35));
        System.out.println("decimalToBinary(100) --> " + decimalToBinary(100));
        System.out.println("decimalToBinary(505) --> " + decimalToBinary(505));
    }
}
