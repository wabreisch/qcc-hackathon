import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//A Basic Data Manager Class to manipulate career data types
//The main bread-n-butter of the class is the debt to years formula, which compares how long a person would have to work in each prospective career to pay off their debt.
//By Brian Gill for team Wishbay, October 24 2015 Hackathon @ Quinnipiac University.

public class CareerManager {
	
	ArrayList<Career> myList;
	ArrayList<Career> relevantList;
	String debtParagraph = "Assuming that you use 10-20% of your salary to pay loans, " + "\n";
	
	String debtShorter; //These variables will be used to hold the value of how many years a person will have to work.
	String debtShorterTwo; //They are used in the debtToYears method
	
	public CareerManager(){
		
		myList = new ArrayList<Career>() ;
		relevantList = new ArrayList<Career>() ;

		//Just some starter careers for a newly constructed manager and their added majors
		myList.add(new Career("Software Developer", 93350, "Develops or enhances software projects"));
		this.addMajor("Software Developer", "software");
		
		myList.add(new Career("Video Game Designer", 83240, "Plans and develops software of video games."));
		this.addMajor("Video Game Designer", "software");
		this.addMajor("Video Game Designer", "cheetos");

		
		myList.add(new Career("Game Tester", 20000, "Sits around all day providing feedback on video games."));
		this.addMajor("Game Tester", "cheetos");
		
		myList.add(new Career("Software Architect", 102000, "Designs and coordinates complex software projects"));
		this.addMajor("Software Architect", "software");
		
		myList.add(new Career("Kanye", 30000000, "Lyrical wordsmith and architect of the English Language. So far ahead of the curve its a circle."));
		this.addMajor("Kanye", "yeezus");

	}
	
	public void addMajor(String CareerName, String newMajor){
		for (Career careerFor: myList){
			if (careerFor.getName() == CareerName) careerFor.addMajor(newMajor);
		}
	}
	
	public void addCareer(String name, double salary, String description){
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
	
	//This method will take the user's major and debt and will then return a relevant list of careers they may pursue, including how long it would take to pay off their debt.
	public String debtToYears(String major, double debt){
		this.hasMajor(major);
		for (Career debtFor: relevantList){
			debtShorter = new String(String.format("%.3g%n",(debt/ (debtFor.getSalary()* .8))));
			debtShorterTwo = new String(String.format("%.3g%n",(debt/ (debtFor.getSalary()* .9))));
			debtParagraph = (debtParagraph + "As a " + debtFor.getName() + " it will take " + debtShorter + "-" + debtShorterTwo +" years to pay off your debt." + "\n");
		}
		return debtParagraph;
	}



}
