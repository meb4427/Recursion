import java.util.ArrayList;

class Solution {
    public static String addBinaryNumber(String bits1, String bits2) {
        ArrayList<String> b1 = stringToList(bits1);
        ArrayList<String> b2 = stringToList(bits2);

        String ans = "";
        int carry = 0;

        while (b1.size() > 0 || b2.size() > 0 || carry > 0) {
            if (b1.size() > 0)
                carry += Integer.parseInt(b1.remove(b1.size() - 1));
            if (b2.size() > 0)
                carry += Integer.parseInt(b2.remove(b2.size() - 1));

            ans = carry % 2 + ans;
            carry = (int) Math.floor(carry / 2);
        }

        return Integer.parseInt(ans) + "";
    }

    public static ArrayList<String> stringToList(String str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i) + "");
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("addBinaryNumber(\"100\",\"0\") --> " +
                addBinaryNumber("100", "0"));
        System.out.println("addBinaryNumber(\"100\",\"1\") --> " +
                addBinaryNumber("100", "1"));
        System.out.println("addBinaryNumber(\"100\",\"10\") --> " +
                addBinaryNumber("100", "10"));
        System.out.println("addBinaryNumber(\"100\",\"101\") --> " +
                addBinaryNumber("100", "101"));
        System.out.println("addBinaryNumber(\"1111\",\"110\") --> " +
                addBinaryNumber("1111", "110"));
        System.out.println("addBinaryNumber(\"101\",\"111\") --> " +
                addBinaryNumber("101", "111"));
        System.out.println("addBinaryNumber(\"1\",\"1\") --> " + addBinaryNumber("1",
                "1"));
        System.out.println("addBinaryNumber(\"1011\",\"110\") --> " +
                addBinaryNumber("1011", "110"));
        System.out.println("addBinaryNumber(\"1011\",\"11011\") --> " +
                addBinaryNumber("1011", "11011"));
        System.out.println("addBinaryNumber(\"000011\",\"0\") --> " +
                addBinaryNumber("000011", "0"));
        System.out.println("addBinaryNumber(\"000010\",\"1\") --> " +
                addBinaryNumber("000010", "1"));
        System.out.println("addBinaryNumber(\"00000\",\"0\") --> " +
                addBinaryNumber("00000", "0"));
    }
}
