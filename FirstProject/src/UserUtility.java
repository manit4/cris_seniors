import java.util.ArrayList;
import java.util.Scanner;

public class UserUtility {

	ArrayList<User> users = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);

	void register() {

		System.out.println("Enter your Firstname!!");
		String firstName = sc.next();

		System.out.println("Enter your LastName!!");
		String lastName = sc.next();

		System.out.println("Enter your username!!");
		String uname = sc.next();

		System.out.println("Enter your password!!");
		String pwd = sc.next();

		User user = new User(uname, pwd, firstName, lastName);
		users.add(user);
	}

	void login() {

		boolean loginFlag = true;

		while (loginFlag) {

			System.out.println("Enter your username!!");
			String username = sc.next();

			System.out.println("Enter your password!!");
			String password = sc.next();

			for (User user : users) {

				if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
					System.out.println("Looged-In Successfully, welcome to NRIIT..");
					loginFlag = false;
				} else {
					System.out.println("Logged-In Failed, please try again");
				}
			}
		}
	}

}
