import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

import java.io.File;

public class DeckOfCards {


	private ArrayList<Card> allCards = new ArrayList<Card>();
	
	DeckOfCards() throws Exception {
		addCardsToDeck();
		shuffleDeckofCards();
	}
	
	public ArrayList<Card> getAllCards() {
		return this.allCards;
	}

	public void setAllCards(ArrayList<Card> allCards) {
		this.allCards = allCards;
	}

	public void addCardsToDeck() throws Exception {
		File file = new File("CardType.txt");
		Scanner extractFromFile = new Scanner(file);
		Card createCard;
		String strCardInfo = "";
		String[] tempStringArray;
		
		while (extractFromFile.hasNext()) {
			strCardInfo = extractFromFile.nextLine();
			tempStringArray = strCardInfo.split(",");
			createCard = new Card(tempStringArray[0], tempStringArray[1]);
			allCards.add(createCard);
		}

	}

	public Card getAndRemoveACardFromDeck() {
		return allCards.remove(0);
	}

	public void setCardToDeck(Card singleCard) {
		allCards.add(singleCard);
	}

	public void shuffleDeckofCards() {
		Collections.shuffle(allCards);
	}

	public Card dealCard() {
		return allCards.remove(0);
	}
}

