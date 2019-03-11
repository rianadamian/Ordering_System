package assignment6;

/**	
 * An item of the day object. It has a class variable discount used to calculate its discounted price.
 * 	
 * @author Rían Adamian
 * @since 13/11/2018
 */

public class DiscountItem extends Item{
	
	private String name;
	private double price;
	private String type;
	private double discount;
	
	public DiscountItem(Item item, double discount) {
		this.name = item.getName();
		this.price = item.getPrice();
		this.type = item.getType();
		this.discount = discount;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		return (this.price * this.discount);
	}
	
	@Override
	public String getType() {
		return this.type;
	}
	
	@Override
	public String toString() {
		return (this.type + ": " + this.name + ", Price: " + this.price + ", Discounted Price: " + this.getPrice());
	}

}
