package Abstraction;

public class Employee extends ManagerAbstract {
	public Employee() {
		super(1);	
		}

	@Override
	public void m1() {
		System.out.println("M1 -- Employee");
	}
	
	public void m2() {
		System.out.println("M2 -- Employee");
	}
	
	public 	static void main(String args[]) {
		ManagerAbstract ma = new Employee();
		ma.m1();
		ma.m2();
	}
}