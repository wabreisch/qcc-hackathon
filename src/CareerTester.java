import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//A Basic Tester Class For the Career Manager to see if data is being used properly.
//By Brian Gill for team Wishbay, October 24 2015 Hackathon @ Quinnipiac University.

public class CareerTester {
	
	
	static String major = "software";
	static double debt = 1000000;
	static CareerManager myManager;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myManager = new CareerManager();
		System.out.println("Successfully Made the manager");
		
		System.out.println(myManager.debtToYears(major, debt));
	}

}
