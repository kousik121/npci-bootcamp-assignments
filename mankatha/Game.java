package mankatha;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean play = true;
		int playersNum = 3;
		int cardsNum = 52;
		Scanner scn = new Scanner(System.in);
		while (play) {
			int totalBetCoins = 0;
			boolean hostDecided = false;
			boolean playerWon = false;
			ArrayList<Player> players = new ArrayList<Player>();
			for (int i = 0; i < playersNum; i++) {
				Player p;
				boolean userHostStatus;
				if (hostDecided) {
					System.out.println("Player " + (i + 1) + " dont have chance to be as a host.");
					userHostStatus = false;
				}
				else {
					Random rand = new Random();
					boolean op = rand.nextBoolean();
					if (op || (!op && i == playersNum - 1)) {
						System.out.println("Player " + (i + 1) + " is chosen to be a host randomly.");
						hostDecided = op;
					}
					userHostStatus = (op || (!op && i == playersNum - 1));
				}
				System.out.println("Enter name of player " + (i + 1) + " : ");
				String userName = scn.nextLine();
				System.out.println("Enter number of coins you have : ");
				int userCoins = scn.nextInt();
				scn.nextLine();
				if (userHostStatus == false) {
					System.out.println("Enter rank number you want to choose (1 - 4) : ");
					int userRank = scn.nextInt();
					System.out.println("Enter suit number you want to choose (1 - 13) : ");
					int userSuit = scn.nextInt();
					System.out.println("Enter the orientation you want to choose (IN/OUT) : ");
					String userOrientation = scn.next();
					scn.nextLine();
					p = new Player(userName, userCoins, new Card(userRank, userSuit), userOrientation, userHostStatus);
					players.add(p);
				}
				else {
					p = new Player(userName, userCoins, new Card(0, 0), "", userHostStatus);
					players.add(p);
				}
				String dec = "";
				if (p.isHostStatus() == false) {
					System.out.println("Do you want to bet your money or exit the game (B/E)");
					dec = scn.next();
				}
				if (p.isHostStatus() == false && dec.equals("B")) {
					System.out.println("Enter number of coins you want to bet : ");
					int betCoins = scn.nextInt();
					scn.nextLine();
					totalBetCoins += betCoins;
					p.bet(betCoins);
				}
				else if (p.isHostStatus() == false){
					play = false;
					break;
				}
			}
			if (play) {
				Deck userCards = new Deck();
				userCards.shuffle();
				for (int i = 0; i < cardsNum; i++) {
					Card c = userCards.deal();
					if (playerWon) {
						break;
					}
					if (i % 2 == 0) {
						for (Player p : players) {
							if (p.isHostStatus() == false && p.getChosenOrientation().equals("IN") && p.getChosenCard().getRank() == c.getRank() && p.getChosenCard().getSuit() == c.getSuit()) {
								System.out.println("Congratulations " + p.getName() + " , you have won the game");
								p.addWinnings(totalBetCoins);
								playerWon = true;
								break;
							}
						}
					}
					else {
						for (Player p : players) {
							if (p.isHostStatus() == false && p.getChosenOrientation().equals("OUT") && p.getChosenCard().getRank() == c.getRank() && p.getChosenCard().getSuit() == c.getSuit()) {
								System.out.println("Congratulations " + p.getName() + " , you have won the game");
								p.addWinnings(totalBetCoins);
								playerWon = true;
								break;
							}
						}
					}
				}
				if (!playerWon) {
					Player host = new Player();
					for (Player pl: players) {
						if (pl.isHostStatus() == true) {
							host = pl;
							break;
						}
					}
					System.out.println("Congratulations as no player won, " + host.getName() + " have bagged all the coins");
					host.addWinnings(totalBetCoins);
				}
				for (Player pla : players) {
					System.out.println("The coin balance of " + pla.getName() + " is : " + pla.getCoins());
				}
				System.out.println("Do you want to continue the game?(Y/N)");
				String opin = scn.next();
				scn.nextLine();
				if (opin.equals("N"))
					play = false;
			}
		}
	}
}
