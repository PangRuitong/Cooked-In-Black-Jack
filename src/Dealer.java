import java.util.ArrayList;

public class Dealer {

	private Hand hand;
	
	public Dealer (Hand hand) {
		this.hand = hand;
	}
	
	public void giveCard(Card card) {
		hand.addACardToHand(card);
	}
	
	public Hand getHand() {
		return hand;
	}
	
	public int getTotalHand() {
		return hand.handTotal();
	}
}

