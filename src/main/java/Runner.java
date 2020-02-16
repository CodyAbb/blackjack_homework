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
        System.out.println("Your hand is " + player.displayCurrentHand());

        String stickOrTwist;
        Scanner userChoiceInput = new Scanner(System.in);
        System.out.println("Would you like to stick or twist?");
        stickOrTwist = userChoiceInput.next();

        while (!stickOrTwist.equals("stick")) {
            game.playerTakeCard();
            if (player.getCardValueTotal() > 21) {
                System.out.println("Your hand is " + player.displayCurrentHand());
                break;
            }
            System.out.println(player.displayCurrentHand());
            Scanner newChoiceInput = new Scanner(System.in);
            System.out.println("Would you like to stick or twist?");
            stickOrTwist = newChoiceInput.next();
        }

        game.dealerRound();
        System.out.println("The " + game.checkScoresForWinner() + " won!");
        System.out.println("Your hand was " + player.displayCurrentHand());
        System.out.println("The dealer's hand was " + dealer.displayFullHand());

    }
}
