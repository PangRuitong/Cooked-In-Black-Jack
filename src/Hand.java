import java.util.ArrayList;

public class Hand{
	
	private String nameOfParticipant;
    private ArrayList<Card> receivedCards= new ArrayList<Card>();
    
    public String getNameOfParticipant() {
    	return this.nameOfParticipant;
    }
    
    public String setNameOfParticipant(String nameOfParticipant){
        return this.nameOfParticipant;
    }
    
    public ArrayList<Card> getAllReceivedCards(){
        return this.receivedCards;
    }
    
    
    public void setAllReceivedCards(ArrayList<Card> receivedCards){
        this.receivedCards = receivedCards;
    }
    
    public int handTotal() {
    	int sumOfAllCards = 0;
    	int aceTotal = 0;
    	int num = 0;
    	String str = "";
    	
    for(int i = 0; i < receivedCards.size(); i++) {
    	try { str = receivedCards.get(i).getCardValue().strip();
    	      num = Integer.parseInt(str);
    	      sumOfAllCards += num;
	} 
    	catch (NumberFormatException e) {
			
			if(str.equalsIgnoreCase("Jack")
			|| str.equalsIgnoreCase("Queen")
			|| str.equalsIgnoreCase("King")) {
				sumOfAllCards += 10;
			}
			else{
				aceTotal++;
			}
		}
    }
    
     for(int i = 0; i < aceTotal; i++) {
    	if(sumOfAllCards + 11 <= 21) {
    		sumOfAllCards += 11;
    	}
    	else {
    		sumOfAllCards += 1;
    	}
     }
    return sumOfAllCards;    	
}  
    
    public Card returnACardFromParticipant(int cardIndex){
        return receivedCards.remove(cardIndex);
    }
    
    public void addACardToHand(Card singleCard){
    	receivedCards.add(singleCard);
    } 
    
    public void showAllCards(){  
    	for (int i = 0; i< receivedCards.size(); i++){
    		 System.out.print(receivedCards.get(i).getCardValue());
         	 System.out.print(receivedCards.get(i).getCardSuit());
             System.out.println();
        }
        System.out.println("You have " + handTotal());
    }

	public ArrayList<Card> getCards() {
		return receivedCards;
	}
}