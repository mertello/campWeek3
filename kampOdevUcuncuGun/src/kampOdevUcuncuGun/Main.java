package kampOdevUcuncuGun;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setNickName("mertello");
		user1.setPassword("123456");
		user1.seteMail("mert.29@hotmail.com");
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Mertello");
		student1.setLastName("Topçu");
		student1.setNickName(user1.getNickName());
		student1.seteMail(user1.geteMail());
		
		System.out.println(student1.geteMail());
	}

}
