package logical;

import java.util.Scanner;

public class Prime {
	int count = 0;
	
	public void prime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("It is a Prime number");
		}
		else {
			System.out.println("It is not a Prime number");
		}
	}

	// From 1-100
	public void primeNumber() {
		for(int i=1; i<=100; i++) {
			
		}
	}
	
	public static void main(String args[]) {
		Prime p = new Prime();
		p.prime();
		p.primeNumber();
	}
}