package lab02;

import java.util.LinkedList;
import java.util.List;

/**
* Our second pure Object Oriented Programming Java class, in the sense it is used to model a concept (a type of objects) of the problem we want to solve<br>. 
* The module class produces and give functionality to n >= 0 module objects<br>
*/
public class Module {

	//---------------------------------------
	//	Attributes
	//---------------------------------------
	
	private String name;
	private int code;
	private int numOfStudents;
	private List<Student> studentRegistered;
	private int max;
	
	//---------------------------------------
	//	Constructor
	//---------------------------------------
	
	public Module() {
		code = 0;
		numOfStudents = 0;
		name = "";
		max = 0;
		studentRegistered = new LinkedList<Student>();
	}
	
	public Module(String name, int code) {
		this.name = name;
		this.code = code;
		studentRegistered = new LinkedList<Student>();
	}
	
	//---------------------------------------
	//	Get Methods
	//---------------------------------------	

	public String getName() {
		return name;
	}
	
	public int getCode() {
		return code;
	}
	
	public int getNumStudents() {
		return numOfStudents;

	}
	
	public int getMax() {
		return max;
	}
	
	public List<Student> getStudentRegistered(){
		return studentRegistered;
	}
	
	
	//---------------------------------------
	//	Set Method
	//---------------------------------------		

	public void setName(String otherName) {
		this.name = otherName;
	}
	
	public void setCode(int otherCode) {
		this.code = otherCode;
	}
	
	public void setNumOfStudents(int otherNumOfStudents) {
		this.numOfStudents = otherNumOfStudents;
	}
	
	public void setMax(int otherMax) {
		this.max = otherMax;
	}
	
	public void setStudentRegistered(LinkedList<Student> otherList) {
		
		this.studentRegistered = otherList;
		
	}
	
	//---------------------------------------
	//	Extra Functionality
	//---------------------------------------	
	
	
	public Student getStudentInfo(int i) {
		
		return this.studentRegistered.get(i);
		
	}
	
	public void registerStudent(Student s) {
		
		this.studentRegistered.add(s);
		
	}

	
}
