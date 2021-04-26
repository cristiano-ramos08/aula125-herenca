package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main (String[] args) {
		
	Account acc1 = new Account(1001, "alEX", 1000.00);
	acc1.withdraw(200.00);
	System.out.println(acc1.getBalance());
		
	Account acc2 = new SavingsAccount(1002, "Cris", 1000.00, 0.01);
	acc2.withdraw(200.00);
	System.out.println(acc2.getBalance());
	Account acc3 = new BusinessAccount(1003, "bob", 1000.0, 500.0);
	acc3.withdraw(200.0);
	System.out.println(acc3.getBalance());
	}
	
}
