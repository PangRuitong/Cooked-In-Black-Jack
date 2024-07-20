public class Card {

	private String cardValue;
	private String cardSuit;
	
	Card(String cardValue, String cardSuit) {
		this.cardSuit = cardSuit;
		this.cardValue = cardValue;
	}
	
	public String getCardValue() {
		return cardValue;
	}

	public void setCardValue(String cardValue) {
		this.cardValue = cardValue;
	}

	public String getCardSuit() {
		return cardSuit;
	}

	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}
}



