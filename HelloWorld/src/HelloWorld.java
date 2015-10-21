import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you now? :)");
		System.out.print("Please enter your name: ");
		String userName = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			userName = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		HelloUser hu = new HelloUser(userName);
		hu.greetUser();
	}

}
