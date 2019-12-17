import java.util.Scanner;
import java.util.Arrays; //imported this to print Arrays for checking purposes in program

public class GradesTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the grade analyzer!");
		System.out.print("Enter the number of grades you would like to input: ");
		int numGrades = scan.nextInt(); //Set the length of the array that the user is passing in
		
		int[] gradesArray = new int[numGrades];
		
		for(int i=0; i < numGrades; i++) {
			System.out.print("Enter grade " + (i+1) + ": ");
			int userInput = scan.nextInt();
			
			//Check if user input is in the range of 0-100
			boolean valid = false;
			
			while(valid == false) {
				
				if(userInput < 0 || userInput > 100) {
					System.out.println("Invalid input. Please enter grades only from 0-100");
					System.out.print("Re-enter grade " + (i+1) + ": ");
					userInput = scan.nextInt();
				} else {
					gradesArray[i] = userInput;
					valid = true; //exit the loop when the input is valid
				}
				
			}

		}
		
		//System.out.println("Grades entered: " + Arrays.toString(gradesArray)); //Need to convert array to String to print it as it is, otherwise it prints coded values of your array in hashcode
		
		// Initialize the array using the values obtained and the method that passes in an array to set values
		System.out.println("");
		Grades myArray = new Grades(gradesArray);
		System.out.println("Grades entered: " + Arrays.toString(myArray.getValues()));
		
		System.out.print("What is the lowest possible passing grade?: ");
		int failingGrade = scan.nextInt();
		
		//Check if input is within range of 0-100
		boolean valid = false;
			
		while(valid == false) {
				
			if(failingGrade < 0 || failingGrade > 100) {
				System.out.println("Invalid input. Please enter grades only from 0-100");
				System.out.print("Re-enter lowest possible passing grade: ");
				failingGrade = scan.nextInt();
			} else {
				valid = true; //exit the loop when the input is valid
			}
		
		}
		
		System.out.println("");
		
		// Test each method by returning data for all the grades entered
		System.out.println("Grades data:");
		System.out.println("Highest grade: " + myArray.highest());
		System.out.println("Lowest grade: " + myArray.lowest());
		System.out.println("Average grade: " + myArray.average());
		System.out.println("Number of total grades: " + myArray.numOfGrades());
		System.out.println("Number of failing grades: " + myArray.numOfFailingGrades(failingGrade));
		System.out.println("Histogram:");
		myArray.histogram(); //This is already a print statement in itself, so no "print" command is needed
		
	}
	
}
