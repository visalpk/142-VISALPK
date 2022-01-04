package bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount{
	double balance;
	int customerId;
	String customerName;
	private Scanner scanner;
	BankAccount(String cName,int cId ,double cbalance)throws InputMismatchException{
		customerId=cId;
		balance=cbalance;
		customerName=cName;
		}
	
	void deposit(int amount) throws InputMismatchException
	{
		if(amount>0)
	{
		balance=balance+amount;
		System.out.println("$"+amount+" is deposited successfully");
		System.out.println("current balance:"+balance);
	}
	else {
		System.out.println("invalid Input");
	}  
		
	}
	void withdraw(double amount)
	{ 
		if(amount>balance)
		{
			System.out.println("Invalid Input");
		}else {
			balance=balance-amount;
			System.out.println("$"+amount+" is withdrawn successfully");
			System.out.println("current balance:"+balance);
		}
	}
	void showMenu() throws InputMismatchException {
		try {
		int option=0;
		scanner = new Scanner(System.in);
		System.out.println("Welcome "+customerName);
		System.out.println("ID: "+customerId);
		System.out.println("\n");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		int x=1;
		do {
			
			if(x==1) {
			System.out.println("Enter an option:");
			option = scanner.nextInt();
			System.out.println("\n");}
			else {
				System.out.println("Enter an option to continue or 4 to exit: ");
				option = scanner.nextInt();
				System.out.println("\n");
				
			}
			x=2;
			switch(option) {
			case 1:
				System.out.println("Balance = "+balance);
				System.out.println("\n");
				break;
			case 2:
				System.out.println("Enter an amount to deposit:");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			case 3:
				System.out.println("Enter an amount to withdraw");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
			case 4:
				System.out.println("--------------------");
				break;
			default:
				System.out.println("Invalid option! Please try again");
			    break;
			}
	
	}while(option!=4);
	System.out.println("Thankyou for using our service");
	}catch(InputMismatchException e) {
		System.out.println("Invalid input Exited");
	}
}
}





