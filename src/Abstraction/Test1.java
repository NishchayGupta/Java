package Abstraction;

public class Test1 {
	public College design() {
		Computer c = new Computer();
		c.m1();
		IT i = new IT();
		i.m1();
		Civil civ = new Civil();
		civ.m1();
		Mech m = new Mech();
		m.m1();
		return c;
	}
	public static void main(String args[]) {
		Test1 t = new Test1();
		t.design();
	}
}