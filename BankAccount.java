package threads;
import java.io.*;
import java.util.*;



public class BankAccount{
	
	
		/*Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw and check balance. The class should be thread-safe and should be able to handle multiple threads accessing the account simultaneously.*/
private double balance;


public synchronized void deposit(double amount) {
    balance = balance+ amount;
}

public synchronized void withdraw(double amount) {
	try {
    if (balance >=  amount) {
        balance = balance-amount;
    } else {
        System.out.println("Insufficient funds");
    }
}
	catch(Exception d) {
		System.out.println(d);
	}
}



public synchronized double checkBalance() {
   return balance;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    BankAccount bc = new BankAccount();

    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check balance");

   do {
        System.out.print("Enter option: ");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            bc.deposit(amount);
        } else if (option == 2) {
            System.out.print("Enter withdraw amount: ");
            double amount = scanner.nextDouble();
            bc.withdraw(amount);
        } else if (option == 3) {
            double balance = bc.checkBalance();
            System.out.println("balance is: " + balance);
        } else {
            System.out.println("Invalid option");
        }
    }while(4!=0);
}


	}


