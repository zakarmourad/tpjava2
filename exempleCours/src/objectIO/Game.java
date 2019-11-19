package objectIO;

import java.io.Serializable;

public class Game implements Serializable {
	private String name, style;
	private double price;
	private transient Player player;
	public Game(String name, String style, double price, Player p) {
		this.name=name;
		this.price=price;
		this.style=style;	
		this.player=p;
	}
	public Player getPlayer() {
		return this.player;
	}
	public String toString() {
		return "Name: "+ name + ", Style: "+style+" Price: "+price+ " "+player;
	}

}
