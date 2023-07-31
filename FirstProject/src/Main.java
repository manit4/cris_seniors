
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

public class Main {

	public static void main(String[] args) {

		boolean flag = true;

		UserUtility utility = new UserUtility();

		while (flag) {

			System.out.println("Enter 1 for login and 2 for Registration and 0 for Exit...");
			Scanner sc = new Scanner(System.in);
			int value = sc.nextInt();

			switch (value) {

			case 1:

				utility.login();

				break;

			case 2:

				utility.register();

				break;

			case 0:

				System.out.println("Good-bye");
				flag = false;
				break;
			}
		}
	}

}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//import javax.imageio.spi.RegisterableService;
//
//public class Main {
//	
//	ArrayList<User> users = new ArrayList<>();
//
//	public static void main(String[] args) {
//
//		boolean flag = true;
//		
//		Main main = new Main();
//
//		while (flag) {
//
//			System.out.println("Enter 1 for login and 2 for Registration and 0 for Exit...");
//			Scanner sc = new Scanner(System.in);
//			int value = sc.nextInt();
//
//			switch (value) {
//
//			case 1:
//
//				main.login();
//
//				break;
//
//			case 2:
//
//				main.register();
//				
//				break;
//
//			case 0:
//
//				System.out.println("Good-bye");
//				flag = false;
//				break;
//			}
//		}
//	}
//	
//	void register() {
//		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter your Firstname!!");
//		String firstName = sc.next();
//
//		System.out.println("Enter your LastName!!");
//		String lastName = sc.next();
//
//		System.out.println("Enter your username!!");
//		String uname = sc.next();
//
//		System.out.println("Enter your password!!");
//		String pwd = sc.next();
//
//		User user = new User(uname, pwd, firstName, lastName);
//		users.add(user);
//	}
//	
//	void login() {
//		
//		Scanner sc = new Scanner(System.in);
//
//		boolean loginFlag = true;
//
//		while (loginFlag) {
//
//			System.out.println("Enter your username!!");
//			String username = sc.next();
//
//			System.out.println("Enter your password!!");
//			String password = sc.next();
//
//			for (User user : users) {
//
//				if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
//					System.out.println("Looged-In Successfully, welcome to NRIIT..");
//					loginFlag = false;
//				} else {
//					System.out.println("Logged-In Failed, please try again");
//				}
//			}
//		}
//	}
//
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		ArrayList<User> users = new ArrayList<>();
//
//		boolean flag = true;
//
//		while (flag) {
//
//			System.out.println("Enter 1 for login and 2 for Registration and 0 for Exit...");
//
//			int value = sc.nextInt();
//
//			switch (value) {
//
//			case 1:
//
//				boolean loginFlag = true;
//
//				while (loginFlag) {
//
//					System.out.println("Enter your username!!");
//					String username = sc.next();
//
//					System.out.println("Enter your password!!");
//					String password = sc.next();
//
//					for (User user : users) {
//
//						if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
//							System.out.println("Looged-In Successfully, welcome to NRIIT..");
//							loginFlag = false;
//						} else {
//							System.out.println("Logged-In Failed, please try again");
//						}
//					}
//				}
//
//				break;
//
//			case 2:
//
//				System.out.println("Enter your Firstname!!");
//				String firstName = sc.next();
//
//				System.out.println("Enter your LastName!!");
//				String lastName = sc.next();
//
//				System.out.println("Enter your username!!");
//				String uname = sc.next();
//
//				System.out.println("Enter your password!!");
//				String pwd = sc.next();
//
//				User user = new User(uname, pwd, firstName, lastName);
//
//				// User user = new User();
//				// user.firstName = firstName; user.lastName = lastName; user.username = uname;
//				// user.password = pwd;
//
//				users.add(user);
//				break;
//
//			case 0:
//
//				System.out.println("Good-bye");
//				flag = false;
//				break;
//			}
//		}
//	}
//
//}
