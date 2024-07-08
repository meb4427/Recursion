import java.util.Arrays;

class Solution {
    public static boolean winnerBlackjack(String[] playerCards, String[] houseCards) {
        int playerPower = sumCardsPower(playerCards);
        int dealerPower = sumCardsPower(houseCards);

        if (playerPower > 21) {
            return false;
        } else if (dealerPower < 22 && dealerPower >= playerPower) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumCardsPower(String[] cards) {
        int total = 0;

        String[] arr = { "", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        for (String card : cards) {
            card = card.substring(1);
            total += Arrays.asList(arr).indexOf(card);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(winnerBlackjack(new String[] { "♣4", "♥7", "♥7" }, new String[] { "♠Q", "♣J" }));
        System.out.println(winnerBlackjack(new String[] { "♥10", "♥6", "♣K" }, new String[] { "♠Q", "♦2", "♥K" }));
        System.out.println(winnerBlackjack(new String[] { "♠3", "♠J", "♣5" }, new String[] { "♣A", "♥Q", "♣5" }));
        System.out.println(winnerBlackjack(new String[] { "♥2", "♣A", "♣8", "♥7", "♥3" },
                new String[] { "♥6", "♥K", "♣5", "♥K" }));
        System.out.println(winnerBlackjack(new String[] { "♥2", "♣A", "♣8", "♥7", "♥3" },
                new String[] { "♥2", "♣A", "♣8", "♥7", "♥3" }));
    }
}
