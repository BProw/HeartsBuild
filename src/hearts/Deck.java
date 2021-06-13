package hearts;
/**
 * 
 *  @author BProw
 *	@version 2
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
	 *  Return card rank & suit as String.
	 * @return rank and suit of this card
	 */
	public String getCardValue() {
		
		return rank.getRank() + " " + suit.getSuit();
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
