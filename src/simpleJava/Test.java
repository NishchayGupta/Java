package simpleJava;

public class Test {
	
	static {
		System.out.println("Static block executed");
	}
	
	{
		System.out.println("Non-static block executed");
	}
	
	Test(){
		System.out.println("Contructor");
	}
	
	public void m1() {
		System.out.println("m1---method");
	}
	
	public static void main(String args[]) {
		System.out.println("Main method");
		Test t = new Test();
		t.m1();
	}
}