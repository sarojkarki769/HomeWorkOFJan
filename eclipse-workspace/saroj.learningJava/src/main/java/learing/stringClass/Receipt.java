package learing.stringClass;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/// To print this line -"public static void main(String[] args)" type main and press ctrl and space bar.
	
	
	
//	
//	Scanner scan = new Scanner(System.in);
//	
//	System.out.println("What is your name?");
//
//	String name = scan.nextLine();
//	
//	System.out.println("Your name is " +name);
//	
//	System.out.println("What is your eamil?");
//	
//	 String email = scan.nextLine();
//	 
//	 System.out.println("Please Enter quantity");
//	 int quantity = scan.nextInt();
//	
//	
//	 System.out.println("Hello" +name+ "!");
//	
//	 System.out.println("email : "+ email);
//	
//	 
//
//	boolean isCorrectQuantity = quantity==5;
//	
//	System.out.println("Your item count is " + isCorrectQuantity );
//	
//	
//	scan.close();
//	
	
		
//		Printing the Receipt
	
	
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("What is the product name?");
//		
//		String productName = scanner.nextLine();
//		 
//		System.out.println("Please enter the price of product");
//		
//		double price = scanner.nextDouble();
//		
//		System.out.println("Please enter the quantity of product!");
//		
//		int quantity = scanner.nextInt();
//		
//		final double TAX = 0.06;   // sale tax is 6% here. Always type in %. 
//		
//		double total = price * quantity* TAX + quantity*price;
//	
//	//System.out.println(total);
//	
//	System.out.println("Welcome to target");
//	System.out.println("02/05/2020");
//	System.out.println("Your Sales sumarry");
//	System.out.println("Product :" + productName);
//	System.out.println("Quantity :" + quantity);
//	System.out.println("Price : " + price);
//	System.out.println("State Tax :" + TAX);
//	System.out.println("Total : " + total);
//	System.out.println("Thanks for visiting Target"); 
	
	
	
	
	
	double overdrawnPenelty = 8.0;
	double intrestRate = 0.02;
	double balance;
	
	System.out.println("Enter your checking account balance : $");
	Scanner scanner1 = new Scanner(System.in);
	 balance = scanner1.nextDouble();
	 
	 System.out.println("Original blance $ " + balance);
	
	 if (balance >=0)
	   balance = balance + (intrestRate * balance)/12;
	 else
		 balance = balance - overdrawnPenelty;
	 
	 System.out.println("your new balance is $ " + balance);
	
	scanner1.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
