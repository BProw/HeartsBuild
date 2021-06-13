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
 * CLASS WITH MAIN TO TEST ENUMS AND CARD CLASSES.
 * 
 * @author BProw
 * @version 2
 */
public class Run {
	// Card Deck, from Deck class.
	public static ArrayList<Deck> cards = new ArrayList<Deck>();

	public static Player player1 = new Player();
	public static Player player2 = new Player();
	public static Player player3 = new Player();
	public static Player player4 = new Player();

	public static void main(String[] args) {

		// Create card deck of 52 cards, 13 of each suit.
		for (Cards ra : Cards.values()) {
			for (Suits s : Suits.values()) {
				cards.add(new Deck(ra, s));

			}
		}

		player1.setName("BProw");
		player2.setName("Seaner");
		player3.setName("Tanner");
		player4.setName("Adoree");

		// Number of cards per player (always = 13) testing***
		// int cardsPerPlayer = cards.size() / 4;

		dealCards();

		// Display Player cards (testing).
		iteratePlayerHand(player1);
		iteratePlayerHand(player2);
		iteratePlayerHand(player3);
		iteratePlayerHand(player4);

		// Determine which player leadsoff the game round..
		findTwoClubs(player1);
		findTwoClubs(player2);
		findTwoClubs(player3);
		findTwoClubs(player4);

	}

	/**
	 * Deal 13 cards to each player, remove dealt card from deck, shuffle --- SLOPPY
	 * implementation, needs additional testing 06.13.21 ******
	 */
	static void dealCards() {
		ArrayList<Deck> cards1 = cards;

		for (int i = 0; i < cards.size(); i++) {
			Collections.shuffle(cards);
			if (i < 13) {
				player1.setHand(cards1.get(i));
				cards1.remove(cards.get(i));
			} else if (i > 13 && i <= 26) {
				player2.setHand(cards1.get(i));
				cards1.remove(cards.get(i));
			}
			Collections.shuffle(cards);
		}

		for (int i = 0; i < cards1.size(); i++) {
			Collections.shuffle(cards);
			player3.setHand(cards1.get(i));
			cards1.remove(cards.get(i));

		}

		for (int i = 0; i < cards1.size(); i++) {
			player4.setHand(cards.get(i));
			// cards1.remove(cards.get(i));
		}
	}

	/**
	 * Display the 13 Player cards.
	 * 
	 * @param player
	 */
	static void iteratePlayerHand(Player player) {
		Iterator it = player.getHand().iterator();
		System.out.println(player.getName());

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

	/**
	 * // Compare rank and suit in each player hand to find TWO CLUBS
	 * 
	 * @param playerCards
	 * @param cards
	 * @return
	 */
	public static int findTwoClubs(Player playerCards) {
		Deck twoClubs = new Deck(Cards.TWO, Suits.CLUBS);
		// System.out.println(cards.get(1).toString().equals(twoClubs.toString()));

		for (int i = 0; i < playerCards.getHand().size(); i++) {

			if (playerCards.getHand().get(i).toString().equals(twoClubs.toString())) {
				System.out.println("2 CLUBS ---> " + playerCards.getName());
			}
		}
		System.out.println("");
		return 0;
	}

}
