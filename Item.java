package assignment6;

/**	
 * An abstract class for an object that can be purchased.
 * 	
 * @author Rían Adamian
 * @since 13/11/2018
 */

public abstract class Item implements Payable{
	
	String name;
	String type;
	
	public abstract String getName();
	public abstract String getType();
	
}
