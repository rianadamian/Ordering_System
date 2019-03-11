package assignment6;

import java.util.Iterator;

/**	
 * The ordering system class that the driver will manage.
 * 	
 * @author Rían Adamian
 * @since 13/11/2018
 */

public class OrderingSystem {
	
	public Order current;
	public Menu menu;

	public OrderingSystem(Menu menu) {
		this.menu = menu;
		this.current = null;
	}
	
	
	/**
	 * This method creates a new order for the system to handle. If there is already one then it must be finalized.
	 */
	public void newOrder() {
		if (current != null) {
			System.out.println("There is an existing order yet to be completed!");
			
		} else {
			current = new Order();
			System.out.println("A new order has been created.");
		}
	}
	
	
	/**
	 * This method lists all items on the menu, followed by their price.
	 */
	public void listAll() {
		System.out.println(menu.listMenu());
	}
	
	
	/**
	 * This method allows the customer to add an item to the current order.
	 * 
	 * @param name The name of the item requested.
	 */
	public void addToOrder(String name) {
		if (current == null) {
			System.out.println("You must begin a new order!");
			
		} else {
			Iterator<Item> iterator = menu.menu.iterator();
			
			whileLoop:
			while (iterator.hasNext() == true) {
				Item i = iterator.next();

				if (i.getName() == name) {
					
					if (i.getClass() == Drink.class) {
						Drink d = (Drink) i;
						
						if (d.alc = true) {
							System.out.println("You must be 18 years old to buy this.");
						}
					}
					
					current.add(i);
					System.out.println("Your order has been updated: " + current.toString());
					break whileLoop;
				}
			}
		}
	}
	
	
	/**
	 * 
	 * This method allows the customer to explicitly access the full meal combo. 
	 * Any valid item requested that is on the menu is added to the order.
	 * 
	 * @param appetizer The desired appetizer of the combo
	 * @param main The desired main course of the combo
	 * @param dessert The desired dessert of the combo
	 */
	public void createFullMeal(String appetizer, String main, String dessert) {
		Item a = null;
		Item m = null;
		Item d = null;
		
		Iterator<Item> iterator = menu.menu.iterator();
		
		while (iterator.hasNext() == true) {
			Item i = iterator.next();
			
			if (i.getName() == appetizer && i.getType() == "Appetizer") {
				a = i;
			}
			
			if (i.getName() == main && i.getType() == "Main") {
				m = i;
			}
			
			if (i.getName() == dessert && i.getType() == "Dessert") {
				d = i;
			}
		}
		
		if ((a == null || m == null) || d == null) {
			System.out.println("Invalid order.");
			
		} else {
			current.add(a);
			current.add(m);
			current.add(new DiscountItem(d, 0.5));
		}
	}
	
	
	/**
	 * This method relays the total cost of the customer's order and demands that they pay.
	 * Then it closes the order the System is handling so a new one can be created.
	 */
	public void finalizeOrder() {
		System.out.println("The cost of your order is: " + current.getPrice() + "\nPlease pay now.");
		current = null;
	}
	
}
