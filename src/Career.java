import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Career {
	
	String name;
	String description;
	ArrayList<String> majors;
	int salary;
	
	public Career(String name, int salary, String description){
		this.name = name;
		this.salary = salary;
		this.description = description;
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
	
	public int getSalary(){
		return salary;
	}

}
