class Solution {
    public static String oneComplement(String bits) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '0')
                res.append('1');
            else
                res.append('0');
        }
        return res.toString();
    }

    public static String twosComplement(String bits) {
        bits = oneComplement(bits);
        boolean isCarry = true;
        int n = bits.length() - 1;
        StringBuilder res = new StringBuilder();

        while (n >= 0) {
            if (bits.charAt(n) == '1' && (isCarry)) {
                res.insert(0, '0');
                isCarry = true;
            } else if ((bits.charAt(n) == '1' && (!isCarry)) || (bits.charAt(n) == '0' && (isCarry))) {
                res.insert(0, '1');
                isCarry = false;
            } else {
                res.insert(0, '0');
                isCarry = false;
            }
            n--;
        }

        return isCarry ? "1" + res.toString() : res.toString();
    }

    public static void main(String[] args) {
        System.out.println("twosComplement(\"00000000\") --> " + twosComplement("00000000"));
        System.out.println("twosComplement(\"00000010\") --> " + twosComplement("00000010"));
        System.out.println("twosComplement(\"11111111\") --> " + twosComplement("11111111"));
        System.out.println("twosComplement(\"01110101\") --> " + twosComplement("01110101"));
        System.out.println("twosComplement(\"00000001\") --> " + twosComplement("00000001"));
        System.out.println("twosComplement(\"10000000\") --> " + twosComplement("10000000"));
        System.out.println("twosComplement(\"10101010\") --> " + twosComplement("10101010"));
        System.out.println("twosComplement(\"11111110\") --> " + twosComplement("11111110"));
    }
}
