package kampOdevUcuncuGun;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorName() + " instructor added.");
	}
	
	public void remove(Instructor instructor) {
		System.out.println(instructor.getInstructorName() + " instructor removed.");
	}
}

