package lab02;

/**
* Our first pure Object Oriented Programming Java class, in the sense it is used to model a concept (a type of objects) of the problem we want to solve<br>. 
* The student class produces and give functionality to n >= 0 student objects<br>
*/
public class Student {

	//---------------------------------------
	//	Attributes
	//---------------------------------------
	
	private String name;
	private int age;
	private boolean firstYear;

	
	//---------------------------------------
	//	Constructor
	//---------------------------------------

	public Student() {
		this.name = "";
		this.age = 0;
		this.firstYear = false;
	}
	public Student(String name, int age, boolean firstYear){
		
		this.name = name;
		this.age = age;
		this.firstYear = firstYear;
		
	}
	
	//---------------------------------------
	//	Get Methods
	//---------------------------------------	

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean getFirstYear() {
		return firstYear;
	}
	
	//---------------------------------------
	//	Set Method
	//---------------------------------------		

	
	public void setName(String otherName) {
		this.name = otherName;
	}
	
	public void setAge(int otherAge) {
		this.age = otherAge;
	}
	
	public void setFirstYear(boolean otherFirstYear) {
		this.firstYear = otherFirstYear;
	}
	
	
	//---------------------------------------
	//	Extra Functionality
	//---------------------------------------		

	public void birthday() {
		
		this.age++;
		if(firstYear) {
			System.out.println("Happy birthday " + this.name +  " , we hope you are enjoying your first year in college");
		}else {
			System.out.println("Happy birthday " + this.name +  " , we hope you are enjoying your year in college");
		}
	}
	
	public String toString() {
		if(firstYear)
			return "(" + name + ", " + age + ", " + "first year" + ")";
		return "(" + name + ", " + age + ", " + "not first year" + ")";

	}
}
