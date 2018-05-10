package Abstraction;

public class Test {

	public static void main(String[] args) {
		Connection c = new MySql();
		c.commit();
		c.rollback();
	}
}