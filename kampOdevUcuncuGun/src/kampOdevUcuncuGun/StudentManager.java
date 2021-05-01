package kampOdevUcuncuGun;

public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " student added.");
	}
	
	public void remove(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " student removed.");
	}
}

