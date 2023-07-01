
public class FullName implements Comparable<FullName>{

	//DATA ATTRIBUTES
	private final String firstName;
	private final String lastName;
	
	//CONSTRUCTORS
	public FullName(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	//GETTERS
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	//METHOD TO IMPLEMENT FROM COMPARABLE
	//This compareTo belongs to the interface
	public int compareTo(FullName fn) {
		if(lastName.equals(fn.getLastName())) 
			//THESE COMPARETO BELONGS TO THE STRING METHOD
			return firstName.compareTo(fn.getFirstName());
		else
			return lastName.compareTo(fn.getLastName());
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
	//TASK 1: ADDS AN equals() METHOD TO THE FULLNAME CLASS
	public boolean equals(Object obj) {
		
		boolean equalObject = false;
		//getClass() returns the runtime class for a given object
		if(obj != null && this.getClass() == obj.getClass()) {
			FullName fnObj = (FullName) obj;
			equalObject = firstName.equals(fnObj.getFirstName()) && lastName.equals(fnObj.getLastName());			
		}
		return equalObject;
	}
	
	//TASK 2 ADD A hashCode() METHOD TO THE FULLNAME CLASS
	//HASH FUNCTION: (sum of chars) % 4
	public int hashCode() {
		return (firstName.length() + lastName.length()) % 4;		
	}
}