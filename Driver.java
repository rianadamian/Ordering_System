package assignment6;

import java.util.Scanner;

/**
 * @author Rían Adamian
 */

public class Driver {

	public static void main(String[] args) {
		
		OrderingSystem os = new OrderingSystem(Menu.getMenu());
		Scanner in = new Scanner(System.in);
		
		int choice = 7;
		
		System.out.println("Welcome to the Food Ordering System!");
		
		whileLoop:
		while (choice != 0) {
			
			System.out.println("Choose one of the following options:");
			System.out.println("1. New Order\n2. List Items\n3. Add Item to Order\n4. Order a Meal Combo\n5. Finalize Order\n6. Exit");
			
			choice = in.nextInt();
			
			switch (choice) {
			
			case 1: 
				os.newOrder();
				break;
			
			case 2: 
				os.listAll();
				break;
			
			case 3: 
				System.out.println("Enter what you would like to order: ");
				String itemName = in.nextLine();
				
				os.addToOrder(itemName);
				break;
				
			case 4:
				System.out.println("Enter the appetizer you would like to order: ");
				String appetizer = in.nextLine();
				
				System.out.println("Enter the main course you would like to order: ");
				String main = in.nextLine();
				
				System.out.println("Enter the dessert you would like to order: ");
				String dessert = in.nextLine();
				
				os.createFullMeal(appetizer, main, dessert);
				break;
			
			case 5:
				os.finalizeOrder();
				break;
				
			case 6:
				break whileLoop;
				
			}
				
				
		}
		
		in.close();
	}

}
