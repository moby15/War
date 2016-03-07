/**
 * Created by terribee on 3/6/16.
 */
public class Rule {

    private static String ace = "Ace";
    private static String jack = "Jack";
    private static String queen = "Queen";
    private static String king = "King";
    private static String computer = "Computer";
    private static String player = "Player";

    public static String winnerIs(String p, String c) {
        String tie = "Tie";
        String winner = null;

        //Check for tie first
        if (p.equals(c)) {
            winner = tie;
            return winner;
        }

        //Check for ace card next, since it beats all other cards
        else if (p.equals(ace) || c.equals(ace)) {
            if (p.equals(ace)) {
                winner = player;
                return winner;
            } else {
                winner = computer;
                return winner;
            }
        }

        //Check for king next, because the only card that beats it is an ace
        else if (p.equals(king) || c.equals(king)) {
            if (p.equals(king) && c.equals(ace)) {
                winner = computer;
                return winner;
            } else if (c.equals(king) && p.equals(ace)) {
                winner = player;
                return winner;
            } else if (c.equals(king)) {
                winner = computer;
                return winner;
            } else if (p.equals(king)) {
                winner = player;
                return winner;
            }
        }
        //Check for queen. Only cards that can beat queen is king or ace
        else if (p.equals(queen) || c.equals(queen)) {
            if (p.equals(queen) && (c.equals(king) || c.equals(ace))) {
                winner = computer;
                return winner;
            } else if (c.equals(queen) && (p.equals(king) || p.equals(ace))) {
                winner = player;
                return winner;
            } else if (p.equals(queen)) {
                winner = player;
                return winner;
            } else if (c.equals(queen)) {
                winner = computer;
                return winner;
            }
        } else if (p.equals(jack) || c.equals(jack)) {
            if (p.equals(jack) && (c.equals(queen) || c.equals(king) || c.equals(ace))) {
                winner = computer;
                return winner;
            } else if (c.equals(jack) && (p.equals(queen) || p.equals(king) || p.equals(ace))) {
                winner = player;
                return winner;
            } else if (p.equals(jack)) {
                winner = player;
                return winner;
            } else if (c.equals(jack)) {
                winner = computer;
                return winner;
            }
        } else {
            int pNum = Integer.parseInt(p);
            int cNum = Integer.parseInt(c);

            if (pNum > cNum) {
                winner = player;
                return winner;
            } else {
                winner = computer;
                return winner;
            }
        }


        return winner;
    }
}
