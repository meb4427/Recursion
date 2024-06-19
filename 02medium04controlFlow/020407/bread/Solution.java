class Solution {
    public static int maxBread(int money, int price, int sticker) {
        int bread = money / price;
        int currentSticker = bread;

        while (currentSticker >= sticker) {
            int newBread = currentSticker / sticker;
            bread += newBread;
            currentSticker = currentSticker % sticker + newBread;
        }
        return bread;
    }

    public static void main(String[] args) {
        System.out.println("maxBread(10,2,3) --> " + maxBread(10,2,3));
        System.out.println("maxBread(15,1,3) --> " + maxBread(15,1,3));
        System.out.println("maxBread(20,2,10) --> " + maxBread(20,2,10));
        System.out.println("maxBread(50,3,2) --> " + maxBread(50,3,2));
        System.out.println("maxBread(100,4,5) --> " + maxBread(100,4,5));
        System.out.println("maxBread(5,1,2) --> " + maxBread(5,1,2));
    }
}
