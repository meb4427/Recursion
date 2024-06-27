import java.util.ArrayList;

class Card{
    private String suit;
    private String value;
    private String intValue;

    public Card(String suit, String value, String intValue) {
        this.suit = suit;
        this.value = value;
        this.intValue = intValue;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public String getIntValue() {
        return intValue;
    }
}

class MyClass {   
    public static void printCardArray(ArrayList<Card> cards) {
        for (Card card : cards) {
            System.out.println(String.format("%s%s(%s)", card.getSuit(), card.getValue(), card.getIntValue()));
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card("♣", "A", "1"));
        cards.add(new Card("♦", "K", "13"));
        cards.add(new Card("♥", "Q", "12"));
        cards.add(new Card("♠", "J", "11"));
    
        printCardArray(cards);
    }
}