package hearts;
/**
 * 
 *  @author BProw
 *	@version 1
 */
public class Deck {
	private Cards rank;
	private Suits suit;


	/**
	 * 	
	 * Create deck of cards and suits.
	 * @param rank - rank of card
	 * @param suit - suit of card
	 */
	Deck(Cards rank, Suits suit) {
		this.rank = rank;
		this.suit = suit;
	
	}
	
	/**
	 * 
	 * @return value of this card
	 */
	public int getCardValue() {
		return rank.getRank();
	}

	/**
	 * @return rank and suit of this card.
	 */
	@Override
	public String toString() {
		String values = this.rank + " " + this.suit;
		return values;
	}
}
