package assignment6;

/**
 * @author Rían Adamian
 */

public class Drink extends RegItem {
	
	public boolean alc;

	public Drink(String name, double price, boolean alc) {
		super(name, price, "Drink");
		this.alc = alc;
	}

}
