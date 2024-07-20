import java.util.ArrayList;

public class Player {
	
	private String name;
	private Hand hand;
	
	public Player(String name, Hand hand) {
		this.name = name;
		this.hand = hand;
		hand.setNameOfParticipant(name);
	}
	
	public Hand getHand() {
		return hand;
	}
	
	public void giveCard(Card card) {
		hand.addACardToHand(card);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotalHand() {
		return hand.handTotal();
	}

	public ArrayList<String> getSuit(){

		ArrayList<Card> cards = hand.getCards();
		ArrayList<String> suits = new ArrayList<>();
		String suit = "";

		for (int i=0; i< cards.size(); i++){
			suit = cards.get(i).getCardSuit();
			suits.add(suit);
		}
		return suits;
	}


}
