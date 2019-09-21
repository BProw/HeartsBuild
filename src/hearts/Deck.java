package hearts;

/**
 * 
 *  @author BProw
 *	@version 1
 */
public class Deck {
	private Cards rank;
	private Suits suit;
	private int cardValue;
	//	private Cards value;			// DONT NEED? SEE getRank() ***************

	// private final int ZERO		// GIT PRACTICE!!!!!!!!!!


	/*
	 * Constructor
	 * @rank - rank of card
	 * @suit - suit of card
	 */
	Deck(Cards rank, Suits suit) {
		this.rank = rank;
		this.suit = suit;
		//this.cardValue = cardValue;
	}
	
	/**
	 *  					********* DONT NEED? ************************
	 * @return
	 */
	public int getRank() {
		return cardValue;
	}
	/**
	 * 
	 * @return
	 */
	public Suits getSuit() {
		return suit;
	}
	/**
	 * Return value of card from Rank.
	 * @return
	 */
	public int getCardValue() {
		return rank.getRank();
	}
	/**
	 * String representation of current Rank and Suit.
	 */
	@Override
	public String toString() {
		String values = this.rank + " " + this.suit;
		return values;
	}
}
