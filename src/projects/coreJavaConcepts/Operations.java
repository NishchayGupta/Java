package projects.coreJavaConcepts;

import java.util.Scanner;

public class Operations implements Banking {
	int bal;
	Account acc = new Account();
	Scanner sc = new Scanner(System.in);
	public void createAccount() {
		System.out.println("Enter account number: ");
		int accNumber = sc.nextInt();
		acc.setAccountNumber(accNumber);
		System.out.println("Enter account name: ");
		String accName = sc.next();
		acc.setAccountName(accName);
		System.out.println("Enter account address: ");
		String address = sc.next();
		acc.setAddress(address);
		System.out.println("Enter branch name: ");
		String branchName = sc.next();
		acc.setBranchName(branchName);
		System.out.println("The account has been created");
	}
	
	public void balanceCheck() {
		System.out.println("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.println("Enter account name: ");
		String accName = sc.next();
		if(accNumber == acc.getAccountNumber() && accName == acc.getAccountName()) {
			bal = acc.getBalance();
		}
		System.out.println("The current balance is: " +bal);	}
	
	public void deposit() {
		System.out.println("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.println("Enter account name: ");
		String accName = sc.next();
		System.out.println("Enter deposit amount: ");
		int depositAmount = sc.nextInt();
		if(accNumber == acc.getAccountNumber() && accName.equals(acc.getAccountName())) {
			acc.setBalance(acc.getBalance() + depositAmount);
			System.out.println("Amount deposited");
		}
		System.out.println("After deposit the amount is: "+ acc.getBalance());
	}
	
	public void withdrawal() {
		System.out.println("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.println("Enter account name: ");
		String accName = sc.next();
		System.out.println("Enter withdrawal amount: ");
		int withdrawalAmount = sc.nextInt();
		if(accNumber == acc.getAccountNumber() && accName.equals(acc.getAccountName())) {
			acc.setBalance(acc.getBalance() - withdrawalAmount);
			System.out.println("Amount withdrawal");
		}
		System.out.println("After withdrawal the amount is: "+ acc.getBalance());
	}
}