package exceptionHandling;

public class Test {
	public void m1(int age) throws AgeInvalidException {
		System.out.println("M1 -- Start");
		if(age<0) {
			AgeInvalidException e = new AgeInvalidException("Age problem");
			throw e;
		}
		System.out.println("M2 -- End");
	}
	public static void main(String args[]) {
		System.out.println("Main -- Starts");
		Test t = new Test();
		try {
			t.m1(-5);
		}
		catch(AgeInvalidException e) {
			System.out.println("Catch -- Block.."+e.getMessage());
		}
	}
}