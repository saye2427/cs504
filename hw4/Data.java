public class Data {
	
	//Declare class instance variables
	String fname;
	String lname;
	int postalCode;
	
	//Set constructors
	Data() { } //default constructor
	Data(String first_name, String last_name, int zipCode) {
		fname = first_name;
		lname = last_name;
		postalCode = zipCode;
	}
	
	//Set methods - getters/setters not necessarily needed here as the class instance variables are not set to private, but setters have been included for good measure
	public String setFirstName(String first_name) {
		fname = first_name;
		return fname;
	}
	
	public String setLastName(String last_name) {
		lname = last_name;
		return lname;
	}
	
	public int setPostalCode(int zipCode) {
		postalCode = zipCode;
		return postalCode;
	}
	
	public void printData() {
		System.out.println(fname + "\t" + lname + "\t" + postalCode);	
	}

}