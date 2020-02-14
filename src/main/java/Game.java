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
        deck.shuffleDeck();
        Card firstCardForPlayer = deck.dealCard();
        Card secondCardForPlayer = deck.dealCard();
        Card firstCardForDealer = deck.dealCard();
        Card secondCardForDealer = deck.dealCard();
        player.addToHand(firstCardForPlayer);
        player.addToHand(secondCardForPlayer);
        dealer.addToHand(firstCardForDealer);
        dealer.addToHand(secondCardForDealer);
    }

    public void playerTakeCard() {
        Card newCard = new Card(SuitType.SPADE, RankType.ACE);
        int currentCardTotal = player.getCardValueTotal();
        if ((newCard.getRank() == RankType.ACE) && ((currentCardTotal += Score.getValue(newCard)) > 21)) {
            Card alternateAceCard = new Card(SuitType.SPADE, RankType.LOWACE);
            player.addToHand(alternateAceCard);
        } else {
            player.addToHand(newCard);
        }


    }

    public void dealerRound() {
        while (dealer.getCardValueTotal() < 16){
            Card newCard = deck.dealCard();
            dealer.addToHand(newCard);
        }
    }

    public String checkScoresForWinner() {
        if (player.getCardValueTotal() >21 || dealer.getCardValueTotal() > 21){
            if (player.getCardValueTotal() < 21){
                return player.getName();
            } else {
                return dealer.getName();
            }
        } else if (player.getCardValueTotal() == 21 || dealer.getCardValueTotal() == 21){
            if (player.getCardValueTotal() == 21) {
                return player.getName();
            } else {
                return dealer.getName();
            }
        } else {
            if (player.getCardValueTotal() > dealer.getCardValueTotal()){
                return player.getName();
            } else {
                return dealer.getName();
            }
        }
    }
}
