import java.util.Scanner;
import java.util.Stack;

/**
 * Created by terribee on 3/6/16.
 */
public class Play {

    private static Player player = new Player();
    private static Player computer = new Player();

    public static void deal() {
        Cards cards = new Cards();
        Stack<String> deck = cards.createDeck(cards.createCards());
        Stack<String> playersHand = new Stack<>();
        Stack<String> computersHand = new Stack<>();

        for (int i = 0; i < 26; i++) {
            playersHand.push(deck.pop());
            computersHand.push(deck.pop());
        }
        player.setHand(playersHand);

        computer.setHand(computersHand);
    }

    public static void play() {

        deal();

        Stack<String> playersHand = player.getHand();
        Stack<String> computersHand = computer.getHand();
        String winner = "";
        int computerScore = 0;
        int playerScore = 0;

        while (playersHand.size() > 0 || computersHand.size() > 0) {
            winner = Rule.winnerIs(playersHand.pop(), computersHand.pop());
            if (winner.equals("Computer")) {
                computerScore += 1;
            } else if (winner.equals("Player")) {
                playerScore += 1;
            }
        }
        if (computerScore > playerScore) {
            System.out.println("Computer: " + computerScore + " Player: " + playerScore);
            System.out.println("COMPUTER WINS");
        } else {
            System.out.println("Player: " + playerScore + " Computer: " + computerScore);
            System.out.println("PLAYER WINS");
        }

    }

    public static void main(String args[]) {

        System.out.println("Welcome to War!");

        for (int i = 0; i < 20; i++) {
            play();
        }

    }
}
