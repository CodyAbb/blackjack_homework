import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return cards.size();
    }

    public void populateDeck(){
        for (int i = 0; i < SuitType.values().length; i++){
            for (int j = 0; j < (RankType.values().length - 1); j++){
                this.cards.add(new Card(SuitType.values()[i], RankType.values()[j]));
            }
        }
//        for (Card card : this.cards) {
//            if (card.getRank() == RankType.LOWACE){
//                this.cards.remove(card);
//            }
//        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.cards);
    }


    public Card dealCard() {
        return this.cards.remove(0);
    }
}
