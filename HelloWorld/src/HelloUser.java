
public class HelloUser {
	private String userName;
 

	public void setUser(String user) {
		userName = user;
	}

	public void greetUser() {
		System.out.println("Hello " + userName+"!");
	}
}