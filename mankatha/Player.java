package mankatha;

public class Player {
	private String name;
	private int coins;
	private Card chosenCard;
	private String chosenOrientation;
	private boolean hostStatus;
	public Player() {
		
	}
	public Player(String name, int coins, Card chosenCard, String chosenOrientation, boolean hostStatus) {
		super();
		this.name = name;
		this.coins = coins;
		this.chosenCard = chosenCard;
		this.chosenOrientation = chosenOrientation;
		this.hostStatus = hostStatus;
	}
	public boolean isHostStatus() {
		return hostStatus;
	}
	public void setHostStatus(boolean hostStatus) {
		this.hostStatus = hostStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	public Card getChosenCard() {
		return chosenCard;
	}
	public void setChosenCard(Card chosenCard) {
		this.chosenCard = chosenCard;
	}
	public String getChosenOrientation() {
		return chosenOrientation;
	}
	public void setChosenOrientation(String chosenOrientation) {
		this.chosenOrientation = chosenOrientation;
	}
	public void bet(int coins) {
		this.coins -= coins;
	}
	public void addWinnings(int coins) {
		this.coins += coins;
	}
}
