

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nriit", "root", "root");

		PreparedStatement stmt = conn.prepareStatement("select * from  user");
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		
		
		
		

		
	}
}


//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
//import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
//
//public class Main {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nriit", "root", "root");
//
//		PreparedStatement stmt = conn.prepareStatement("delete from user where id = ?");
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter your Id to delete!!");
//		int id = sc.nextInt();
//
//		stmt.setInt(1, id);
//		
//		stmt.executeUpdate();
//	}
//}


//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
//import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
//
//public class Main {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nriit", "root", "root");
//
//		PreparedStatement stmt = conn.prepareStatement("insert into user values(?, ?, ?)");
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter your Id!!");
//		int id = sc.nextInt();
//
//		System.out.println("Enter your Name!!");
//		String name = sc.next();
//
//		System.out.println("Enter your email!!");
//		String email = sc.next();
//		
//		stmt.setInt(1, id);
//		stmt.setString(2, name);
//		stmt.setString(3, email);
//		
//		stmt.executeUpdate();
//	}
//}

//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nriit", "root", "root");
//		
//		Statement stmt = conn.createStatement();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Id!!");
//		int id = sc.nextInt();
//		
//		System.out.println("Enter your Name!!");
//		String name = sc.next();
//		
//		System.out.println("Enter your email!!");
//		String email = sc.next();
//		
//		stmt.executeUpdate("insert into user values("+id+",'"+name+"','"+email+"')");
//		
//
//	}
//}

//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Main {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nriit", "root", "root");
//		
//		Statement stmt = conn.createStatement();
//		
//		stmt.executeUpdate("delete from user where id = 13");	
//	}
//}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Main {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nriit", "root", "root");
//		
//		Statement stmt = conn.createStatement();
//		
//		stmt.executeUpdate("insert into user values(14, 'Manit2', 'manit2.gmail.com')");
//		
//		
//	}
//
//}
