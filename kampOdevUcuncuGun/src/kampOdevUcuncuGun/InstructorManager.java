package kampOdevUcuncuGun;

public class InstructorManager extends UserManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorName() + " instructor added.");
	}
	
	public void remove(Instructor instructor) {
		System.out.println(instructor.getInstructorName() + " instructor removed.");
	}
}

