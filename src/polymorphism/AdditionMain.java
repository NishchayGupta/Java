package polymorphism;

public class AdditionMain extends Addition {
	
	public void add(int a, float b) {
		System.out.println("Int and then float AdditionMain");
	}
	public static void main(String args[]) {
		Addition a = new AdditionMain();
		Addition a1 = new Addition(12,13);
		a.add();
		a.add(12);
		a.add(10, 12);
		a.m1(4);
		a1.add(1.0f, 2);
		a.add(4, 1.3f);
	}
}