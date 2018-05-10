package pojo;

public class University {
	public static void main(String args[]) {
		College c = new College();
		Student s = c.setData();
		System.out.println(s.getName());
		System.out.println(s.getRollNo());
		System.out.println(s.getStream());
	}
}