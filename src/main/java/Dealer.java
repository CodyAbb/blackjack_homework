import java.util.ArrayList;

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
}
