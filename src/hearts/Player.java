package hearts;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private ArrayList<Deck> hand = new ArrayList<Deck>();

    /*
        ********* SET NAME TIN CONSTRUCTOR TO FORCE USER TO SET NAME ********

           *******   CREATE JUNIT TEST FILE TO STREAMLINE/ORGANIZE    *********
    */

    /**
     * Set player name.
     * @param name
     */
    public void setName(String name) {
        this.playerName = name;
    }

    /**
     * Return the name of this player.
     * @return playername
     */
    public String getName() {
        return this.playerName;
    }

    /**
     * Set player's card hand.
     * @param dealtHand cards dealt to player
     */
    public void setHand(Deck dealtHand) {
        hand.add(dealtHand);
    }
    
    /**
     * @return this player's cards.
     */
    public ArrayList<Deck> getHand(){
        return hand;
    }

    /**
     *  Ensure players have correct # of cards in hand.
     * @return player hand size
     */
    public int playerHandSize() {
        return this.hand.size();
    }
}