package com.java.ATM;

import java.util.*;

class ATM{
	
	float balance=00;
	int PIN=1234;
	
	Scanner sc=new Scanner(System.in);
	
	public void checkpin() {
		System.out.println("Enter your pin = ");
		int enteredpin=sc.nextInt();
		if(enteredpin == PIN)
		{
			menu();
		}
		else {
			System.out.print("Enter correct PIN"); 
		}
		menu();

	}
	
	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Check Balamce");
		System.out.println("2. Widraw ");
		System.out.println("3. Deposit ");
		System.out.println("4. Transfer ");
		System.out.println("5. Exit");
		int opt= sc.nextInt();
		 
		if(opt==1) {
			checkbalance();

		}
		else if(opt==2) {
			widrawmoney();	
		}
		else if(opt==3) {
			depositmoney();	
		}
		else if(opt==4) {
			transfermoney();
		}
		else if(opt==5) {
			return;  
		}
		else {
			System.out.println ("Please enter valid option no."); 
		}
	}
	
	public void checkbalance() {
		System.out.println("Your current balence is : "+balance);
		menu();
	}
	
	public void widrawmoney() {
		System.out.println("Enter amout to widraw : ");
		float amount=sc.nextFloat();
		if(amount>balance) {
			System.out.println("Insufficient balance");
			System.out.println("Your current balnce is : "+balance);
		}
		else {
			balance=balance-amount;
			System.out.println("Money widraw successfully");
			System.out.println("Your current balnce is : "+balance);
		}
		menu();
	}
	
	public void depositmoney() {
		System.out.println("Enter amount : ");
		float amount=sc.nextFloat();
		balance=balance+amount;
		System.out.println("Money deposited sucessfully.");
		System.out.println("Your current balnce is : "+balance);
		menu();   
	}
	
	public void transfermoney() {
		 System.out.print("Enter the amount to transfer: ");
	     Float amount = sc.nextFloat();
	     
	     if (amount <= 0) {
	            System.out.println("Invalid amount. Please enter a positive value.");
	            return;
	        }

	        if (amount > balance) {
	            System.out.println("Insufficient funds. Your current balance is " + balance);
	            return;
	        }

	        System.out.print("Enter the recipient's account number: ");
	        int accountNumber = sc.nextInt();

	        // Simulated transfer process
	        balance -= amount;
	        String transaction = "Transfer: RS. " + amount + " to Account #" + accountNumber;
	        //transactionHistory.add(transaction);
	        System.out.println("Successfully transferred RS" + amount + " to Account #" + accountNumber
	                + ". \nYour current balance is " + balance);
		menu();
	}
	
	public void exit() {
		
	}
	
}


public class ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM atm=new ATM();
		atm.checkpin();
	

	}

}
