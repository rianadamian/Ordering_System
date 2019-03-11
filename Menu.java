package assignment6;

import java.util.ArrayList;
import java.util.Iterator;

/**	
 * The menu containing all items.
 * 	
 * @author Rían Adamian
 * @since 13/11/2018
 */

public class Menu {

	public ArrayList<Item> menu;
	private DiscountItem ofTheDay;
	private static final Menu MENU = new Menu();
	
	private Menu() {
		this.menu = new ArrayList<Item>();
		
		menu.add(new RegItem("Bhaji", 2.0, "Appetizer"));
		menu.add(new RegItem("Samosa", 1.0, "Appetizer"));
		menu.add(new RegItem("Pakora", 3.0, "Appetizer"));
		
		menu.add(new RegItem("Aloo Gobi", 9.5, "Main"));
		menu.add(new RegItem("Chana Masala", 10.5, "Main"));
		
		menu.add(new RegItem("Rice Pudding", 3.5, "Dessert"));
		menu.add(new RegItem("Gulab Jamun", 3.0, "Dessert"));
		
		this.ofTheDay = new DiscountItem(new RegItem("Roti", 2.0, "Side"), 0.75);
		menu.add(ofTheDay);
		menu.add(new RegItem("Naan", 1.5, "Side"));
		
		menu.add(new Drink("Lassi", 3.5, false));
		menu.add(new Drink("Water", 1.0, false));
		menu.add(new Drink("Beer", 4.5, true));
	}
	
	
	/**
	 * This method changes the Item-of-the-day by first removing the current special, re-adding as a regular item,
	 * then making the provided item the new special.
	 * 
	 * @param i The item on the menu to become the Item-of-the-day.
	 * @param discount The desired discount to be applied to the item.
	 */
	public void changeSpecial(RegItem i, double discount) {
		RegItem old = new RegItem(ofTheDay.getName(), ofTheDay.getPrice(), ofTheDay.getType());
		menu.remove(ofTheDay);
		menu.add(old);
		
		ofTheDay = new DiscountItem(i, discount);
		menu.remove(i);
		menu.add(ofTheDay);
	}


	public String listMenu() {
		Iterator<Item> iterator = menu.iterator();
		String s = "";
		
		while (iterator.hasNext() == true) {
			s += iterator.next().toString() + "\n";
		}	
		
		return s;
	}
	
	public static Menu getMenu() {
		return MENU;
	}

}
