import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Career {
	
	String name;
	String description;
	ArrayList<String> majors;
	double salary;
	
	public Career(){
		this.name = "nada";
		this.salary = 0;
		this.description = "nothing here";
		this.majors = new ArrayList<String>();
	}
	
	public Career(String name, double salary, String description){
		this.name = name;
		this.salary = salary;
		this.description = description;
		this.majors = new ArrayList<String>();
	}

	public ArrayList<String> getMajors(){
		return majors;
	}
	
	public void addMajor(String major){
		majors.add(major);
	} 
	
	public Boolean hasMajor(String major){
		if (majors.contains(major)){
			return true;
		}// end if
		else return false;
	} //end hasMajor
	
	public String getDescription(){
		return this.description;
	}
	
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}

}
