package learing.stringClass;

import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
