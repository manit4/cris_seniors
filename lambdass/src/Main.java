import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface Cab {
	
	void book(String source, String destination);
}

//class Uber implements Cab {
//
//	@Override
//	public void book(String source, String destination) {
//
//		System.out.println("Your Cab has been booked from "+source+" to "+destination);
//		
//	}
//}


public class Main {
	
	public static void main(String[] args) {
		
//		Cab cab = (source, destination) -> System.out.println("Your Cab has been booked from "+source+" to "+destination);
//		
//		cab.book("Delhi", "Chandigarh");
		
		
		List<String> names = new ArrayList<String>();
		names.add("Sumit");   names.add("Kuldeep");   names.add("Sandeep");
		
//		names.stream().filter(user-> {
//			boolean status = false;
//			if(user.length() > 5) {
//				status = true;
//			}
//			return status;
//		}).forEach(user->System.out.println(user));
		
//		List<String>  namess = names.stream().filter(user-> {
//			boolean status = false;
//			if(user.length() > 5) {
//				status = true;
//			}
//			return status;
//		}).collect(Collectors.toList());
		
		
		
//		names.stream().map(lname->lname+" Sharma").forEach(System.out::println);
		
		List<String> filteredNames = names.stream().map(lname->lname+" Sharma").collect(Collectors.toList());
		
//		filteredNames.forEach(System.out::println);
		
		filteredNames.forEach(namee->System.out.println(namee));
		
		//System.out.println(namess.size());
		
		//System.out.println(count);
		
		
		
	}

}
