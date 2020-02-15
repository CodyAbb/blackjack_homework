import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private String name;
    private ArrayList<Card> hand;

    public Dealer() {
        this.name = "Dealer";
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

    public String displayHiddenHand(){
        String cardsInHand = "[Hidden], ";
        List<Card> hiddenList = this.hand.subList(1, (this.hand.size()));
        for (Card card : hiddenList){
            cardsInHand += card.getSuit();
            cardsInHand += " ";
            cardsInHand += card.getRank();
            cardsInHand += ", ";
        }
        return cardsInHand;
    }

    public String displayFullHand(){
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
