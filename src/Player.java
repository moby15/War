/**
 * Created by terribee on 3/6/16.
 */

import java.util.Stack;

public class Player {

    private Stack<String> hand;

    public Player(Stack <String> h){
        hand=h;
    }
    public Player(){

    }

    public Stack<String> getHand(){
        return hand;
    }
    public void setHand(Stack<String> h){
        hand = h;
    }
}
