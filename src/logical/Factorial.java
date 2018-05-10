package logical;

import java.util.Scanner;

public class Factorial {
	int value =1;
	public void fact(int num) {
		for(int i=1; i<=num; i++) {
			value = value * i;
		}
		System.out.println("The factorial of "+num+ " is: " +value);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		Factorial f = new Factorial();
		f.fact(num);
	}
}