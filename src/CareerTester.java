import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CareerTester {
	
	
	static String major = "cheetos";
	static double debt = 100000;
	static CareerManager myManager;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myManager = new CareerManager();
		System.out.println("Successfully Made the manager");
		
		System.out.println(myManager.debtToYears(major, debt));
	}

}
