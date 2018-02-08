package POS;

import java.util.Scanner;

public class Credit extends Money {
	Scanner scan = new Scanner(System.in);
	
	private int creditCardNumber = 0000000000000000;
	private int expirationDate = 0000;
	private int cvv = 000;
	private int debitCode = 0000;
	private int debCred = 0;
	private String processed = "your payment has been processed";	

	public Credit() {
		
	} 
	
	public static void processCredCard(Scanner scan, int creditCardNumber, int expirationDate, int cvv, int debitCode, int debCred, String processed) {
		
		System.out.println("Please Enter your credit card number: ");
		creditCardNumber = scan.nextInt();
		//Validator.getLong(scan, "Please Enter your credit card number: ", 100000000000000, 9999999999999999);
		
		System.out.println("Please enter the experation date (07/20): ");
		expirationDate = scan.nextInt();
		System.out.println("Enter your CVV number: ");
		cvv = scan.nextInt();
		System.out.println("Well this be debit or credit? \n(Press 1 for Debit 2 for Credit)");
		debCred = scan.nextInt();
		if(debCred == 1) {
			System.out.println("Please enter your 4 digit passcode");
			debitCode = scan.nextInt();
		}
		else {
			System.out.println("Processing your credit card");
		}
		System.out.println("you Card has been processed");
		
		return;
	}

}

