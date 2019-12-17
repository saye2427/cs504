import java.util.Scanner;
import java.io.File;

public class FileScan {
	
	public static void main(String[] args) throws Exception { //needed this line when we wrote file in class, in order to account for the FileNotFound exception
															  //without it, program will NOT compile													  
		//Redirection in case no filename is entered
		if(args.length == 0) {
			System.out.println("Please enter the name of the file that you would like to scan/analyze");
			System.out.println("Correct format: \"java FileScan myTextFile.txt\"");
		} else {											  
															  
			File inputFile = new File(args[0]); //args[0] calls in the file name that is typed into the command prompt when the program is run (any spaces before the filename are automatically ignored)
			Scanner scan = new Scanner(inputFile);
		
			//cycle through the file for a line count
			int lineCount = 0;
			int wordCount = 0;
		
			while(scan.hasNextLine()) { //while the txt file has another line, the boolean "hasNextLine()" returns true
			
				String fileText = scan.nextLine(); //so while it's true, add each line to a string we are saving in our program
				//System.out.println(fileText);
				lineCount++; //and each time we add to the string, we will also increment our lineCount variable
			
				//cycle through the file for a word count - we can now use the string "textFile" which we created, but trim() it to remove any leading or trailing spaces 
				//Note: we assume that no blank lines exist in our txt file, as those lines cannot be ignored by simply using Scanner (we would need BufferedReader API)
				String[] wordsInText = fileText.trim().split(" "); //split the lines saved in our string by the spaces between each word = split each word into its own entity, now in an ordered array
				for(int i=0; i < wordsInText.length; i++) { //cycle through the array
					//System.out.println(wordsInText[i]);
					wordCount++;
				}
			
			}
			System.out.println("The number of lines in \"" + inputFile + "\" is: " + lineCount);
			System.out.println("The number of words in \"" + inputFile + "\" is: " + wordCount);
		}
		
	}
	
}