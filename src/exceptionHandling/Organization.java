package exceptionHandling;

import java.io.IOException;

public class Organization {
	
	public Organization() throws IOException {
		
		try {
			Manager mn3 = new Manager();
		}
		catch(ClassNotFoundException e) {
			System.out.println("CatchMain -- Block");
		}
	}
	
	public static void main(String args[])  {
		System.out.println("Main -- Start");
//throws keyword with method calling in the case of unchecked exception(throws keyword not necessary)		
		Manager m;
		try {
			m = new Manager();
			m.m1();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			
		}
		catch(ArithmeticException e) {
			System.out.println("CatchMain -- Block");
		}
		System.out.println("Main -- end");
		System.out.println("");
	
//throws keyword with method calling in the case of checked exception	
		Manager mn;
		try {
			mn = new Manager();
			mn.m3();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Main -- end");
		System.out.println("");
	
// throws keyword with method overriding in the case of unchecked exception
		Manager mn1;
		try {
			mn1 = new Manager();
			mn1.m5();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
// throws keyword with method overriding in the case of checked exception	
		Manager mn2;
		try {
			mn2 = new Manager();
			mn2.m6();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}	
}