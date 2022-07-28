package com.mankatha;

public class Card {
	private int rank;
	private int suit;
	public Card() {
		
	}
	public Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	public Card nameToCard(String name) throws InvalidCardException {
		switch(name) {
			case "Ace of hearts": return new Card(1,1);
			case "Two of hearts": return new Card(1,2);
			case "Three of hearts": return new Card(1,3);
			case "Four of hearts": return new Card(1,4);
			case "Five of hearts": return new Card(1,5);
			case "Six of hearts": return new Card(1,6);
			case "Seven of hearts": return new Card(1,7);
			case "Eight of hearts": return new Card(1,8);
			case "Nine of hearts": return new Card(1,9);
			case "Ten of hearts": return new Card(1,10);
			case "Jack of hearts": return new Card(1,11);
			case "Queen of hearts": return new Card(1,12);
			case "King of hearts" : return new Card(1,13);
			case "Ace of spades": return new Card(2,1);
			case "Two of spades": return new Card(2,2);
			case "Three of spades": return new Card(2,3);
			case "Four of spades": return new Card(2,4);
			case "Five of spades": return new Card(2,5);
			case "Six of spades": return new Card(2,6);
			case "Seven of spades": return new Card(2,7);
			case "Eight of spades": return new Card(2,8);
			case "Nine of spades": return new Card(2,9);
			case "Ten of spades": return new Card(2,10);
			case "Jack of spades": return new Card(2,11);
			case "Queen of spades": return new Card(2,12);
			case "King of spades": return new Card(2,13);
			case "Ace of diamonds": return new Card(3,1);
			case "Two of diamonds": return new Card(3,2);
			case "Three of diamonds": return new Card(3,3);
			case "Four of diamonds": return new Card(3,4);
			case "Five of diamonds": return new Card(3,5);
			case "Six of diamonds": return new Card(3,6);
			case "Seven of diamonds": return new Card(3,7);
			case "Eight of diamonds": return new Card(3,8);
			case "Nine of diamonds": return new Card(3,9);
			case "Ten of diamonds": return new Card(3,10);
			case "Jack of diamonds": return new Card(3,11);
			case "Queen of diamonds": return new Card(3,12);
			case "King of diamonds": return new Card(3,13);
			case "Ace of clubs": return new Card(4,1);
			case "Two of clubs": return new Card(4,2);
			case "Three of clubs": return new Card(4,3);
			case "Four of clubs": return new Card(4,4);
			case "Five of clubs": return new Card(4,5);
			case "Six of clubs": return new Card(4,6);
			case "Seven of clubs": return new Card(4,7);
			case "Eight of clubs": return new Card(4,8);
			case "Nine of clubs": return new Card(4,9);
			case "Ten of clubs": return new Card(4,10);
			case "Jack of clubs": return new Card(4,11);
			case "Queen of clubs": return new Card(4,12);
			case "King of clubs": return new Card(4,13);
		}
		throw new InvalidCardException("Card given is invalid");
	}
}
