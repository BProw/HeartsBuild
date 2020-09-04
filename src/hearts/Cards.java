package hearts;
/**
 * 
 * @author BProw
 * @version 1
 */
public enum Cards {
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);

	private int rank;	// Card rank associated with enumeration.
	
	/**
	 * Construct 13 cards with specified values.
	 * Set card values.
	 * @param rank
	 */
	Cards(int rank) {
		this.rank = rank;
		
	}
	
	/**
	 * 
	 * @return rank of this card
	 */
	public int getRank() {
		return rank;
	}
}
