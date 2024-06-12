class Solution {
    public static boolean isSwapBigger(int n) {
        int onesPlace = n % 10;
        int tensPlace = n / 10;
        return n <= onesPlace * 10 + tensPlace;
    }
}
