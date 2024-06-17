class Solution {
    public static int maxBread(int money, int price, int sticker) {
        return maxBreadHelper(sticker, money / price, money / price);
    }

    public static int maxBreadHelper(int sticker, int currentBread, int currentSticker) {
        if (currentSticker < sticker) {
            return currentBread;
        } else if (sticker <= currentSticker) {
            return maxBreadHelper(sticker, currentBread + 1, currentSticker - sticker + 1);
        } else {
            return currentBread;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxBread(10, 2, 3)); // --> 7
        System.out.println(maxBread(15, 1, 3)); // --> 22
        System.out.println(maxBread(20, 2, 10)); // --> 11
        System.out.println(maxBread(50, 3, 2)); // --> 31
        System.out.println(maxBread(100, 4, 5)); // --> 31
        System.out.println(maxBread(5, 1, 2)); // --> 9
    }
}
