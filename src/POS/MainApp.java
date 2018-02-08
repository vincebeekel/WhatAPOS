package POS;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double changeDue = 0.0;
		double paymentAmount = 0.0;
		double purchaseAmount = 0.0;
		int creditCardNumber = 0;
		int expirationDate = 0000;
		int cvv = 0;
		int debitCode = 0;
		int debCred = 0;
		String processed = "";
		int accountNumber = 0;
		int routingNumber = 0;
		int checkNumber = 0;
		
		
		
		//Cash.makeChange(scan, changeDue, paymentAmount, purchaseAmount);
		Credit.processCredCard(scan, creditCardNumber, expirationDate, cvv, debitCode, debCred, processed);
//		Check.checktingNumber(scan, accountNumber, routingNumber, checkNumber);
	}

}



