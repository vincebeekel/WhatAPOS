package POS;

import java.util.Scanner;

public class Check extends Money {

	private int accountNumber = 000000000000;
	private int routingNumber = 000000000;
	private int checkNumber = 0000;
	
	
	public Check() {
		
	}
	
	public static void checktingNumber(Scanner scan, int accountNumber, int routingNumber, int checkNumber) {
		System.out.println("Please enter your Check Account number");
		accountNumber = scan.nextInt();
		System.out.println("Please enter your Routing Number");
		routingNumber = scan.nextInt();
		System.out.println("Please Enter your Check Number");
		checkNumber = scan.nextInt();
		
		System.out.println("Thank you for your purchase, your check has been processed!");
		
		
		return;
		
	}
	

}
