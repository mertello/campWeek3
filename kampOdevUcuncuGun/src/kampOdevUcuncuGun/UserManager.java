package kampOdevUcuncuGun;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getNickName() + " user added.");
	}
	
	public void remove(User user) {
		System.out.println(user.getNickName() + " user removed.");
	}
}
