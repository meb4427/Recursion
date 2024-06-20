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

    public static void main(String[] args) {
        System.out.println("oneComplement(\"00011100\") --> " + oneComplement("00011100"));
        System.out.println("oneComplement(\"10010\") --> " + oneComplement("10010"));
        System.out.println("oneComplement(\"001001\") --> " + oneComplement("001001"));
        System.out.println("oneComplement(\"0111010\") --> " + oneComplement("0111010"));
        System.out.println("oneComplement(\"1\") --> " + oneComplement("1"));
    }
}
