import java.util.*;


/**
 * Created by terribee on 3/6/16.
 */
public class Cards {


    /*
    Create cards: 1-10 plus specials Ace, Jack, Queen, and King
     */
    public static String[] createCards() {
        String[] cards = new String[13];

        for (int j = 0; j < 13; j++) {
            if (j == 0) {
                cards[j] = "Ace";
            } else if (j == 10) {
                cards[j] = "Jack";
            } else if (j == 11) {
                cards[j] = "Queen";
            } else if (j == 12) {
                cards[j] = "King";
            } else {
                cards[j] = Integer.toString(j + 1);
            }

        }
        Collections.shuffle(Arrays.asList(cards));
        return cards;
    }

    public static Stack<String> createDeck(String[] cards) {
        Stack<String> deck = new Stack<>();
        int r;

        for (int k = 0; k < 4; k++) {

            for (int i = 0; i < cards.length; i++) {
                deck.push(cards[i]);
            }
        }
        return deck;
    }


}
