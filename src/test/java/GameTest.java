import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Player player;
    private Dealer dealer;

    @Before
    public void before(){
        player = new Player("Dave");
        dealer = new Dealer();
        game = new Game(player, dealer);
    }

    @Test
    public void bothPlayerAndDealerGetCards(){
        game.startNewGame();
        assertEquals(2, player.getHand().size());
        assertEquals(2, dealer.getHand().size());
    }

    @Test
    public void canGetTallyOfEachPlayer(){
        game.startNewGame();
        assertEquals(13, player.getCardValueTotal());
        assertEquals(7, dealer.getCardValueTotal());
    }


}
