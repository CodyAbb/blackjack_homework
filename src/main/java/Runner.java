import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner userNameInput = new Scanner(System.in);
        System.out.println("Welcome to Blackjack, Please enter your name:");
        String userName = userNameInput.nextLine();

        Dealer dealer = new Dealer();
        Player player = new Player("userName");
        Game game = new Game(player, dealer);

        game.startNewGame();
        ArrayList<Card> dealerHand = dealer.getHand();



        System.out.println("Hey " + userName + ", the deck has been shuffled");
        System.out.println("The dealer's hand is " + dealer.displayHiddenHand());
//        System.out.println("The dealer's hand is [hidden], " + dealerHand.get(0).getSuit() + " " + dealerHand.get(0).getRank());
        System.out.println("Your hand is " + player.displayCurrentHand());
    }
}
