package hearts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Random;


/**
 *  
 * 				TEST CLASS WITH MAIN TO TEST ENUMS AND CARD CLASSES.
 * 
 * @author BProw
 * @version 1
 */
public class Run {

	public static void main(String[] args) {
		Suits heart = Suits.HEARTS;
		Suits spade = Suits.SPADES;
		Cards jack = Cards.JACK;
		Cards ace = Cards.JACK;
		
		
		//Object[] possibleValues = Cards.getDeclaringClass().getEnumConstants();
	
		//Cards.class.getEnumConstants();
		
		// List of Rank enum, TWO through ACE.
		//ArrayList<Rank> cardRanks =
       //         new ArrayList<Rank>(EnumSet.allOf(Rank.class));
		
		// List of Suits enum, HEART, DIAMOND, SPADE, and CLUB
		ArrayList<Suits> suits = 
				new ArrayList<Suits>(EnumSet.allOf(Suits.class));
	
		// Card Deck, from Deck class.
		ArrayList<Deck> cards = new ArrayList<Deck>();
		
		for(Cards ra : Cards.values()) {
			for(Suits s : Suits.values()) {
				cards.add(new Deck(ra,s));
			}
		}
		
	//System.out.println(cards.get(44) + " Card value: " + 
	//				  cards.get(44).getRank());
		
		
		int count = 0; 		// # of cards in deck.
		
		for(Deck c : cards) {
			if(c.getSuit() == Suits.HEARTS) {
				
				count++;
			}
		}
		
		System.out.println("# of HEARTS in card deck: " + count);
		
		Random rand = new Random();
		
		System.out.println("\nRandom card: " + 
				cards.get(rand.nextInt(52)));
	}
	
	
}

