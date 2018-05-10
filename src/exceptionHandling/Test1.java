package exceptionHandling;

public class Test1 {
	
	public int m1() {
		int x = 5;
		try {
			System.out.println("Try -- Block");
			int a = 10/0;
			return x;
		}
		finally {
			x = 30;
			System.out.println("Finally -- Block");
			return x;
		}
	}
	
	public static void main(String args[])
	{
		Test1 t = new Test1();
		int x = t.m1();
		System.out.println("Value of x is: " +x);
	}
}