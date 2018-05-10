package inheritance;

public class Test {
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		A ab = new B();
		A ac = new C();
		
		B bc = new C();
		
		a.m1();
		a.m2();
		a.m4();
		System.out.println("Object of A");
		b.m1();
		b.m2();
		b.m4();
		b.m5();
		System.out.println("Object of B");
		c.m1();
		c.m2();
		c.m4();
		c.m5();
		c.m7();
		System.out.println("Object of C");
		ab.m1();
		ab.m2();
		ab.m4();
		System.out.println("Object of AB");
		ac.m1();
		ac.m2();
		ac.m4();
		System.out.println("Object of AC");
		bc.m1();
		bc.m2();
		bc.m4();
		bc.m5();
		System.out.println("Object of BC");
	}
}