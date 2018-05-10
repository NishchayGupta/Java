package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Employee {
	
	public Employee() throws IOException, ClassNotFoundException {
		System.out.println("Employee constructor -- Start");
		Class.forName("Manager");
		System.out.println("Employee constructor -- End");
	}
	
//throws keyword with method calling in the case of unchecked exception(throws keyword not necessary)	
	public void m2() {
		System.out.println("M2 -- start");
		int a = 10/0;
		System.out.println("M2 -- end");
	}
//throws keyword with method calling in the case of checked exception
//throws needs to be written in the method or else try-catch	
		public void m4() throws ClassNotFoundException {
			System.out.println("M4 -- start");
			Class.forName("Manager");
			System.out.println("M4 -- end");
		}	
		
// throws keyword with method overriding in the case of unchecked exception
		public void m5() throws ArithmeticException{
			System.out.println("M5-Emp -- start");
			int a = 10/0;
			System.out.println("M5-Emp -- end");
		}	
		
// throws keyword with method overriding in the case of checked exception		
		public void m6() throws ClassNotFoundException{
			System.out.println("M6-Emp -- start");
			Class.forName("Organization");
			System.out.println("M6-Emp -- end");
		}
}