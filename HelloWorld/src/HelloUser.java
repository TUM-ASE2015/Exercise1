
public class HelloUser {
	private String userName;

	public HelloUser() {
		userName = "aurel";
	}

	public void setUser(String user) {
		userName = user;
	}

	public void greetUser() {
		System.out.println("Hello " + userName+"!");
	}
}