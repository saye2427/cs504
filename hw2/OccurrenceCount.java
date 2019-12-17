import java.util.Scanner;
import java.util.Arrays;

public class OccurrenceCount {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] userInputs = new int[1001]; //default array length is 1001 (upto 1000 user inputs allowed) - this high number is to account for the fact that an ARRAY must have a SET length (and we cannot use ArrayLists for this hw) ;-;
										  //When the index of 1000 is surpassed, the loop will be exited automatically to avoid Exceptions (and any 1001th entry will be voided)
		int[] inputCounts = new int[51]; //this will hold the number of occurrences for each number 0-50 (51 elements total)
		
		System.out.print("Enter a value between 0 and 50 [-1 to end]: ");
		int input = scan.nextInt();
		
		//Check for validity of input
		int index = 0;
		while(input != -1 && index < userInputs.length) {
			
			if(input >= 0 && input <= 50) {
					userInputs[index] = input;
					index++;
					System.out.print("Enter a value between 0 and 50 [-1 to end]: ");
					input = scan.nextInt();
			} else {
				System.out.print("Invalid input. Please enter a value between 0 and 50 [or -1 to end]: ");
				input = scan.nextInt();
			}
			
		}
		//System.out.println("Integers entered: " + Arrays.toString(userInputs)); 
		
		//Set a new array without any null values
		int[] pertinentInputs = new int[index];
		for(int i=0; i < index; i++)
			pertinentInputs[i] = userInputs[i];
		//System.out.println("Integers entered: " + Arrays.toString(pertinentInputs)); 
		
		//Check for number of occurrences and enter into array that stores them
		for(int i=0; i < pertinentInputs.length; i++) {
			int num = pertinentInputs[i];
			inputCounts[num]++;
		}
		//System.out.println("Counts: " + Arrays.toString(inputCounts)); 
		
		System.out.println("");
		//Cycle through counter array
		for(int i=0; i < inputCounts.length; i++) {
			if(inputCounts[i] > 0)
				System.out.println("The value of " + i + " has " + inputCounts[i] + " occurrence(s).");
		}
		
	}
	
}
