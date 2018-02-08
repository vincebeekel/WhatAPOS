/*
*
** @Author Vince Beekel
*
**/
package POS;

import java.util.Scanner;

public class Cash {
	
	public static double makeChange(Scanner scan,double changeDue, double paymentAmount, double purchaseAmount) {
		
//		System.out.println("How much is your purchase");
//		purchaseAmount = scan.nextDouble();
		
		purchaseAmount = Validator.getDouble(scan, "How much is your purchase");
		
		
//		System.out.println("How much is your purchase");
//		paymentAmount = scan.nextDouble();
		
		paymentAmount = Validator.getDouble(scan, "How much are you paying with");
		
		do {
			if (paymentAmount < purchaseAmount) {
//				System.out.println("Please enter more money");
//				paymentAmount = scan.nextDouble();
				
				paymentAmount = Validator.getDouble(scan, "Please enter more money");
			} else {
				changeDue = paymentAmount - purchaseAmount;
				System.out.printf("Your change is $%.2f",  changeDue);
			} 
		} while (paymentAmount < purchaseAmount);
		
	
		scan.close();
 

	
		return changeDue;	
	}

}
 