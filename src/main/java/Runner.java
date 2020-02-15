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

        Scanner userChoiceInput = new Scanner(System.in);
        System.out.println("Would you like to stick or twist?");
        String stickOrTwist = userChoiceInput.nextLine();

//        if (stickOrTwist == "twist") {
//           game.playerTakeCard();
//        } else {
//            game.dealerRound();
//            System.out.println("The " + game.checkScoresForWinner() + " won!");
//            System.out.println("Your hand was " + player.displayCurrentHand());
//            System.out.println("The dealer's hand was " + dealer.displayFullHand());
//        }

        while (stickOrTwist != "stick") {
            if (player.getCardValueTotal() > 21){
                game.playerTakeCard();
                System.out.println("Your hand is " + player.displayCurrentHand());
            } else {
                break;
            }
        }

        game.dealerRound();
        System.out.println("The " + game.checkScoresForWinner() + " won!");
        System.out.println("Your hand was " + player.displayCurrentHand());
        System.out.println("The dealer's hand was " + dealer.displayFullHand());

//        while (stickOrTwist != "stick") {
//            if (stickOrTwist == "twist") {
//                game.playerTakeCard();
//                continue;
//            }
//            game.dealerRound();
//            System.out.println("The " + game.checkScoresForWinner() + " won!");
//            System.out.println("Your hand was " + player.displayCurrentHand());
//            System.out.println("The dealer's hand was " + dealer.displayFullHand());
//            break;
//        }


//        while (stickOrTwist != "stick"){
//            game.playerTakeCard();
//            if (game.checkScoresForWinner() == "Dealer") {
//                System.out.println("Your hand was " + player.displayCurrentHand());
//                System.out.println("The dealer's hand was " + dealer.displayFullHand());
//                System.out.println("Sorry bud, you lost!");
//            } else {
//                System.out.println("Your hand is " + player.displayCurrentHand());
//                Scanner newInput = new Scanner(System.in);
//                System.out.println("Would you like to stick or twist?");
//                stickOrTwist = newInput.nextLine();
//            }
//
////            game.dealerRound();
////            System.out.println(game.checkScoresForWinner());
////            System.out.println("Your hand was " + player.displayCurrentHand());
////            System.out.println("The dealer's hand was " + dealer.displayFullHand());
//        }

//        game.dealerRound();
//        System.out.println(game.checkScoresForWinner());
//        System.out.println("Your hand was " + player.displayCurrentHand());
//        System.out.println("The dealer's hand was " + dealer.displayFullHand());

//        if (stickOrTwist == "stick"){
//            game.dealerRound();
//            System.out.println(game.checkScoresForWinner() + " won!");
//            System.out.println("Your hand was " + player.displayCurrentHand());
//            System.out.println("The dealer's hand was " + dealer.displayFullHand());
//        } else {
//            return null;
//            }
//


    }
}
