import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		// prompt for number of user
		System.out.println("Enter the number of player: ");
		int numOfPlayer = scanner.nextInt();

		// Deck init
		DeckOfCards deck = new DeckOfCards();

		// Initialize the hand base on the number of input
		ArrayList<Hand> hands = new ArrayList<>();
		for (int i = 0; i < numOfPlayer; i++){
			Hand tempHand = new Hand();
			tempHand.addACardToHand(deck.dealCard());
			tempHand.addACardToHand(deck.dealCard());
			hands.add(tempHand);
		}

		// Initialize the player base on the number of input
		ArrayList<Player> players = new ArrayList<>();
		String name;
		Scanner scanName = new Scanner(System.in);
		for (int i = 0; i < numOfPlayer; i++){
			System.out.println("Enter Player Name: ");
			name = scanName.nextLine();
			players.add(new Player(name, hands.get(i)));	
		}

		//hand < 17, give a card from deak of card from player from hand








		boolean flag = false;
		boolean	lowerThan17;

		while(flag == false) {
			lowerThan17 = false;

			for (int i = 0; i < numOfPlayer; i++) {
				if (players.get(i).getTotalHand() < 17) {
					players.get(i).giveCard(deck.dealCard());
					System.out.println(players.get(i).getName());
					players.get(i).getHand().showAllCards();
					lowerThan17 = true;
				}
			}

			if(lowerThan17 == false){
				flag = true;
			}
		}

























		// Close Scanner
		scanName.close();
		scanner.close();

		}
	}