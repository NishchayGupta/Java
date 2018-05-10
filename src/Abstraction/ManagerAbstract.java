package Abstraction;

abstract class ManagerAbstract {
	
	public ManagerAbstract() {
		System.out.println("Abstract class contructor");
	}
	public ManagerAbstract(int a) {
		System.out.println("Abstract class parameterized contructor");
	}

	public abstract void m1();
	
	public void m2() {
		System.out.println("M2 -- ManagerAbstract");
	}
}