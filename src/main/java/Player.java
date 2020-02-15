import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addToHand(Card card){
        hand.add(card);
    }

    public int getCardValueTotal(){
        int total = 0;
        for (Card card : hand){
            total += Score.getValue(card);
        }
        return total;
    }

    public String displayCurrentHand(){
        String cardsInHand = "";
        for (Card card : this.hand){
            cardsInHand += card.getSuit();
            cardsInHand += " ";
            cardsInHand += card.getRank();
            cardsInHand += ", ";
        }
        return cardsInHand;
    }
}
