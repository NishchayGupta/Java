package Abstraction;

public class MySql implements Connection {

	@Override
	public void commit() {
		System.out.println("Commit == MySql");
	}

	@Override
	public void rollback() {
		System.out.println("Rollback == MySql");
	}
}