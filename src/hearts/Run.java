package hearts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.io.PrintWriter;

/**
 * 
 * TEST CLASS WITH MAIN TO TEST ENUMS AND CARD CLASSES.
 * 
 * @author BProw
 * @version 1
 */
public class Run {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		String aa = "\uD83C\uDCDD";
		// pw.println("aa= " + aa);

		// Object[] possibleValues = Cards.getDeclaringClass().getEnumConstants();

		// Cards.class.getEnumConstants();

		// List of Rank enum, TWO through ACE.
		// ArrayList<Rank> cardRanks =
		// new ArrayList<Rank>(EnumSet.allOf(Rank.class));

		// List of Suits enum, HEART, DIAMOND, SPADE, and CLUB
		// ArrayList<Suits> suits = new ArrayList<Suits>(EnumSet.allOf(Suits.class));

		// Card Deck, from Deck class.
		ArrayList<Deck> cards = new ArrayList<Deck>();
		ArrayList<Suits> suits = new ArrayList<Suits>();

		for (Cards ra : Cards.values()) {
			for (Suits s : Suits.values()) {
				cards.add(new Deck(ra, s));
			}
		}

		// 4 players
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player();

		player1.setName("BProw"); // Set Player name
		player2.setName("Seaner");
		player3.setName("Tanner");
		player4.setName("Adoree");

		// Player p1 = new Player();

		for (int i = 0; i < cards.size(); i++) { // Take 13 cards from Deck, shuffle each pass.
			// player1.add(cards.get(i));
			if (i < 13) {
				player1.setHand(cards.get(i));
			} else if (i >= 13 && i < 26) {
				player2.setHand(cards.get(i));
			} else if (i >= 26 && i < 39) {
				player3.setHand((cards.get(i)));
			} else {
				player4.setHand((cards.get(i)));
			}
			Collections.shuffle(cards);
		}

		Iterator it = player2.getHand().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("p1: " + player1.getHand().size() + "\np2: " + player2.getHand().size());
		System.out.println("p3: " + player3.getHand().size() + "\np4: " + player4.getHand().size());
		// TEST EQUALITY OF player card hands.
		// System.out.println(player1.getHand().equals(player2.getHand()));

		System.out.println("\nPlayer1 Name: " + player1.getName() + "\n\tRandom CARD RANK: "
				+ player1.getHand().get(3).getCardValue() + "\n\t\tHand size: " + player1.playerHandSize());

		System.out.println("\nPlayer2 NAME: " + player2.getName() + "\n\tRandom CARD RANK: "
				+ player2.getHand().get(3).getCardValue() + "\n\t\tHand size: " + player2.playerHandSize());

		// System.out.println(cards.get(44) + " Card value: " +
		// cards.get(44).getRank());

		int count = 0; // # of cards in deck.

		for (Deck c : cards) {
			if (c.getSuit() == Suits.HEARTS) {

				count++;
			}
		}

		// System.out.println("# of HEARTS in card deck: " + count);

		Random rand = new Random();

		// System.out.println("\nRandom card: " + cards.get(rand.nextInt(52)));
	}

}
