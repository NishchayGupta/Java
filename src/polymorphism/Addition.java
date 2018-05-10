package polymorphism;

public class Addition {
	public Addition() {
		System.out.println("Default contructor");
	}
	public Addition(int a, int b) {
		System.out.println("Parametrized contructor");
	}
	
	public void add() {
		System.out.println("No param");
	}
	
	public void add(int a) {
		System.out.println("1 param");
	}
	
	public void add(int a, int b) {
		System.out.println("2 params");
	}
	
	public void add(int a, float b) {
		System.out.println("Int and then float");
	}
	
	public void add(float a, int b) {
		System.out.println("Float and then int");
	}
	
	public void m1(float a) {
		System.out.println("Float");
	}
}