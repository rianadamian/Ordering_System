package assignment6;

/**	
 * A regular item object.
 * 	
 * @author Rían Adamian
 * @since 13/11/2018
 */

public class RegItem extends Item{
	
	private String name;
	private double price;
	private String type;

	public RegItem(String name, double price, String type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	/**
	 * The purpose of this secondary constructor is to change the Item-of-the-day selection easily.
	 * 
	 * @param item The Item-of-the-day to be made a regular menu item.
	 */
	public RegItem(DiscountItem item) {
		this.name = item.getName();
		this.price = item.getPrice();
		this.type = item.getType();
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String getType() {
		return this.type;
	}
	
	@Override
	public String toString() {
		return (this.type + ": " + this.name + ", Price: " + this.price);
	}
		
}
