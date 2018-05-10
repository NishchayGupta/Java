package exceptionHandling;

import java.io.IOException;

public class Manager {
	
	public Manager() throws ClassNotFoundException, IOException {
		System.out.println("Manager Constructor");
	}
	
// throws keyword with method calling in the case of unchecked exception(throws keyword not necessary) 	
	public void m1() throws ArithmeticException, ClassNotFoundException, IOException{
		System.out.println("M1 -- start");
		Employee emp = new Employee();
		emp.m2();
		System.out.println("M1 -- end");
	}

// throws keyword with method calling in the case of checked exception
//Note: Here the caller class needs to write throws or try-catch	
		public void m3() throws ClassNotFoundException, IOException{
			System.out.println("M3 -- start");
			Employee emp2 = new Employee();
			emp2.m4();
			System.out.println("M3 -- end");
		}
		
// throws keyword with method overriding in the case of unchecked exception
		public void m5() throws ArithmeticException, ClassNotFoundException, IOException{
			System.out.println("M5-Man -- start");
			Employee emp3 = new Employee();
			emp3.m5();
			System.out.println("M5-Man -- end");
		}
		
// throws keyword with method overriding in the case of checked exception		
		public void m6() throws ClassNotFoundException, IOException{
			System.out.println("M6-Man -- start");
			Employee emp4 = new Employee();
			emp4.m6();
			System.out.println("M6-Man -- end");
		}
}