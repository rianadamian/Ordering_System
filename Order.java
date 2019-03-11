package assignment6;

import java.util.ArrayList;
import java.util.Iterator;

/**	
 * An order class. It is a composite of Payable objects, such that 
 * 	
 * @author Rían Adamian
 * @since 13/11/2018
 */

public class Order implements Payable {
	
	private ArrayList<Item> order;

	public Order() {
		order = new ArrayList<Item>();
	}
	
	public void add(Item i) {
		order.add(i);
	}

	@Override
	public double getPrice() {
		
		double total = 0.0;
		
		for (Payable p: order) {
			total += p.getPrice();
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		Iterator<Item> iterator = order.iterator();
		String s = "";
		
		while (iterator.hasNext() == true) {
			s += iterator.next().toString() + "\n";
		}
		
		return s;
	}
	
}
