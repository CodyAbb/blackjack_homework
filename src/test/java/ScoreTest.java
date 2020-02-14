import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canGetScoreOfEleven(){
        deck.populateDeck();
        Card card = deck.dealCard();
        assertEquals(11, Score.getValue(card));
    }
}
