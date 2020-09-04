package hearts;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private ArrayList<Deck> hand = new ArrayList<Deck>();

    /*
        ********* SET NAME TIN CONSTRUCTOR TO FORCE USER TO SET NAME ********

           *******   CREATE JUNIT TEST FILE TO STREAMLINE/ORGANIZE    *********
    */
    public void setName(String name) {
        this.playerName = name;
    }
    public String getName() {
        return this.playerName;
    }
    public void setHand(Deck hand1) {
        hand.add(hand1);
    }
    public ArrayList<Deck> getHand(){
        return hand;
    }
    public int playerHandSize() {
        return this.hand.size();
    }
}