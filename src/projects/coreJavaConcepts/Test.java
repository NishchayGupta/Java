package projects.coreJavaConcepts;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Operations op = new Operations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choice: 1. Create account, 2. Balance Check, 3. Deposit Amount, 4. Withdrawal Amount");
		for(int i=1; i<=4; i++) {
			System.out.println("Enter you choice: ");
			int t = sc.nextInt();
		
		switch(t) {
			case 1: op.createAccount();
			break;
			
			case 2: op.balanceCheck();
			break;
			
			case 3: 
				op.deposit();
			break;
			
			case 4: op.withdrawal();
			break;
			
			default: 
				System.out.println("Invalid choice entered. Please enter correct choice");
			}
		}
	}
}