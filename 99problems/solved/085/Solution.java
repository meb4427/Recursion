class Solution {
    public static int hammingDistance(String bits1, String bits2) {
        int targetLength = Math.min(bits1.length(), bits2.length());
        int count = 0;

        for (int i = 0; i < targetLength; i++) {
            if (bits1.charAt(i) != bits2.charAt(i))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("hammingDistance(\"1111111\",\"1111101\") --> " + hammingDistance("1111111", "1111101"));
        System.out.println("hammingDistance(\"1001\",\"1001\") --> " + hammingDistance("1001", "1001"));
        System.out.println("hammingDistance(\"1001\",\"1110\") --> " + hammingDistance("1001", "1110"));
        System.out.println("hammingDistance(\"10001\",\"001100\") --> " + hammingDistance("10001", "001100"));
    }
}
