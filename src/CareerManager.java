import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class CareerManager {
	
	ArrayList<Career> myList;
	ArrayList<Career> relevantList;
	public CareerManager(){
		myList.add(new Career("Software Developer", 93350, "Develops or enhances software projects"));
		myList.add(new Career("Video Game Designer", 83240, "Plans and develops software of video games."));
		myList.add(new Career("Game Tester", 20000, "Sits around all day providing feedback on video games."));
		myList.add(new Career("Software Architect", 102000, "Designs and coordinates complex software projects"));
		myList.add(new Career("Kanye", 30000000, "Lyrical wordsmith and architect of the English Language. So far ahead of the curve its a circle."));

	}
	
	public void addCareer(String name, int salary, String description){
		myList.add(new Career(name, salary, description));
	}//end addCareer
	
	//this method will return a list of all majors relative to the given major
	public ArrayList<Career> hasMajor(String major){
		relevantList.clear();
		for (Career careerFor: myList){
			if(careerFor.hasMajor(major)) relevantList.add(careerFor);
		}
		return relevantList;
	}
	
	public ArrayList<Career> getList(){
		return myList;
	}
	
	

}
