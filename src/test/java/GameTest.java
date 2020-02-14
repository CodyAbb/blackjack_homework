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

//    @Test
//    public void canGetTallyOfEachPlayer(){
//        game.startNewGame();
//        assertEquals(13, player.getCardValueTotal());
//        assertEquals(7, dealer.getCardValueTotal());
//    }

    @Test
    public void canNewCardToPlayerHand(){
        game.startNewGame();
        game.playerTakeCard();
        assertEquals(3, player.getHand().size());
    }

    @Test
    public void dealerTakesCardWhenScoreUnder16(){
        game.startNewGame();
        game.dealerRound();
        assertEquals(3, dealer.getHand().size());
    }

    @Test
    public void gameDecidesWinnerBasedOnScore(){
        game.startNewGame();
        game.dealerRound();
        String winner = game.checkScoresForWinner();
        assertEquals("Dave", winner);
    }

    @Test
    public void allowPlayerToTakeCard(){
        game.startNewGame();
        game.playerTakeCard();
        String winner = game.checkScoresForWinner();
        assertEquals("Dave", winner);
    }


}
