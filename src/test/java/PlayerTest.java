import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card1;
    private Card card2;

    @Before
    public void before(){
        card1 = new Card(SuitType.CLUB, RankType.FIVE);
        card2 = new Card(SuitType.HEART, RankType.QUEEN);
        player = new Player("Dave");
        player.addToHand(card1);
        player.addToHand(card2);
    }

    @Test
    public void checkPlayerCanTallyTotal(){
        assertEquals(15, player.getCardValueTotal());
    }
}
