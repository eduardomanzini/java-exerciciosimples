package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entitites.Account;
import entitites.BusinessAccount;
import entitites.SavingsAccount;

public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 400.0));
		
		
		double sum = 0.0;
		
		for(Account acc: list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f", sum);
		
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for(Account acc: list) {
			System.out.printf("\n%.2f", acc.getBalance());
		}
		
	}

}
