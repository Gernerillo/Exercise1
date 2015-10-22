import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello ASE2015 - how are you? :)");
		
		System.out.println("Please enter your name: ");
		String username = in.nextLine();
		in.close();
		
		HelloUser user = new HelloUser(username);
		
		user.greetUser();
	}

}
