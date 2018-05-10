package simpleJava;

public class OperationTest {
	public static void main(String args[])
	{
		Operations op = new Operations();
		int add = op.addition(10, 2);
		int sub = op.substraction(10, 2);
		int div = op.division(10, 2);
		int mult = op.multiplication(10, 2);
		
		System.out.println("Addition is: " + add);
		System.out.println("Sustraction is: " + sub);
		System.out.println("Division is: " + div);
		System.out.println("Multiplication is: " + mult);
	}
}
