import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ReadFromFile {

	public static void main(String[] args) {
		
		try {
			
			if(args.length == 0) {
				System.out.println("Please enter the name of the file that you would like to scan/analyze");
				System.out.println("Correct format: \"java ReadFromFile textFileName.txt\"");
			} else {
				File inputFile = new File(args[0]);
				Scanner scan = new Scanner(inputFile);
				ArrayList<Data> datascape = new ArrayList<Data>();
				
				while(scan.hasNextLine()) { //while another line exists in the input file...
					
					String fileData = scan.nextLine(); //add each line to a giant string of all the data
					String[] dataLines = fileData.trim().split(" "); //this will split each line of text (since only tabs exist within the lines) into separate strings
																	 //(much like we have for reading from the terminal)
					for(int i=0; i < dataLines.length; i++) {
						//System.out.println(dataLines[i]);
						String[] inputStrings = dataLines[i].trim().split("\t");
						datascape.add(new Data(inputStrings[0], inputStrings[1], Integer.parseInt(inputStrings[2])));
					}
					
				}
				
				System.out.println("");
				System.out.println("Data in File:");
				//Cycle through the array list and print all inputs
				for(int i=0; i < datascape.size(); i++) {
					datascape.get(i).printData();
				}
				
			}
			
		} catch(FileNotFoundException exception) {
			System.out.println("File not found. Please make sure the file exists in the same directory, and try again.");
		}
	
	}

}