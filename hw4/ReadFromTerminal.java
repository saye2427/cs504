import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays; //needed for Arrays.toString test used while writing program

public class ReadFromTerminal {

	public static void main(String[] args) {
		
		//Instantiate scanner class to read from terminal inputs
		Scanner scan = new Scanner(System.in);
		//Instantiate an empty arrayList to hold inputs
		ArrayList<Data> datascape = new ArrayList<Data>();
		
		System.out.println("Enter input {first_name<tab>last_name<tab>zip_code}, or \"quit\" to exit:");
		String userInput = scan.nextLine();
		//System.out.println(userInput);
		
		boolean running = true;
		while(running) {
		
			if(userInput.toLowerCase().equals("quit")) { //convert input to all lowercase to account for all possible forms of "quit" (i.e. quit/Quit/QUIT/etc.)
				running = false;
			} else if(userInput.trim().split("\t").length != 3) { //prompt user for re-entry if input is not in the correct form String<tab>String<tab>String
				System.out.println("Invalid input");
				System.out.println("Enter input {first_name<tab>last_name<tab>zip_code}, or \"quit\" to exit:");
				userInput = scan.nextLine();
			} else {
				String[] inputStrings = userInput.trim().split("\t");
				//System.out.println(Arrays.toString(inputStrings));
				datascape.add(new Data(inputStrings[0], inputStrings[1], Integer.parseInt(inputStrings[2])));
				System.out.println("Enter input {first_name<tab>last_name<tab>zip_code}, or \"quit\" to exit:");
				userInput = scan.nextLine();
			}
			
		}
		//System.out.println("Loop successfully exited");
		
		System.out.println("");
		System.out.println("Data entered:");
		//Cycle through the array list and print all inputs
		for(int i=0; i < datascape.size(); i++) {
			
			datascape.get(i).printData();
			
		}
	
	}

}
