import java.util.Scanner;
/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you? :)");

		String user;
		Scanner cin =  new Scanner(System.in);
		System.out.println("Please enter you name: ");
		HelloUser obj = new HelloUser(); 
		user =  cin.next();
		obj.setUser(user);
		obj.greetUser();
		System.out.println("test");
	}
	
}
