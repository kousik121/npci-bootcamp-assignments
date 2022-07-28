package com.mankatha;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	int rankCardNum = 4;
	int suitCardNum = 13;
	public Deck() {
		for(int i = 1; i <= rankCardNum; i++) {
			for(int j = 1; j <= suitCardNum; j++) {
				this.cards.add(new Card(i, j));
			}
		}
	}
	public ArrayList<Card> getCards() {
		return cards;
	}
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	public void shuffle() {
		ArrayList<Card> set1 = new ArrayList<Card>(); 
		set1.addAll(this.cards);
		ArrayList<Card> set2 = new ArrayList<Card>();
		for (int i = 0; i < this.cards.size(); i++) {
			Random rand = new Random();
			int index = rand.nextInt(set1.size());
			set2.add(set1.get(index));
			set1.remove(index);
		}
		this.cards = set2;
	}
	public Card deal() {
		return this.cards.remove(this.cards.size() - 1);
	}
}
