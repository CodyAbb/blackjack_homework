public class Game {

    private Player player;
    private Dealer dealer;
    private Deck deck;

    public Game(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
        this.deck = new Deck();
    }

    public void startNewGame() {
        deck.populateDeck();
//        deck.shuffleDeck();
        Card firstCardForPlayer = deck.dealCard();
        Card secondCardForPlayer = deck.dealCard();
        Card firstCardForDealer = deck.dealCard();
        Card secondCardForDealer = deck.dealCard();
        player.addToHand(firstCardForPlayer);
        player.addToHand(secondCardForPlayer);
        dealer.addToHand(firstCardForDealer);
        dealer.addToHand(secondCardForDealer);
    }
}
