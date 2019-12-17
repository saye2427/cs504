//HW-6

//Part-1
//Create a program that will parse each email address by its name and company. (Email parser object given)
//The company should be sorted in the first column and the person's name associated with the company
//should be sorted in the second column; separated with a tab character.
//(First sort is by company; second sort is by firstname.lastname).

//Part-2
//Create a histogram on the number of attendees per company for the conference.

//Part-3
//Check if bill.gates attended the conference. Output that Bill Gates attended the conference.

//Part-4 (OPTIONAL)
//Create an output text file for the out above so that it can be imported in Excel for further analysis.
//One method of code to write text to an output file:
/*
	String text = "my text\r\n";
	BufferedWriter output = null;
	try {
		File file = new File("example.txt");
		output = new BufferedWriter(new FileWriter(file));
		output.write(text);
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if ( output != null ) {
			output.close();  // need to close file to write to a file
        }
    }
*/
        
import java.util.*;
import java.io.*;

public class EmailSorter {

	public static void main(String[] args) {
		
		try{
		
			//Declare variables to hold # of attendees per company (for part 2)
			int amznCount = 0;
			int fbCount = 0;
			int googCount = 0;
			int msftCount = 0;
			int orclCount = 0;
		
			//Declare boolean for search of Bill Gates' attendance (for part 3)
			boolean billAttended = false;
			

			//Sort companies and names of reps in attendance using TreeMap
			//(Code based off of example the Professor used in class)
			File inputFile = new File("attendance.txt"); //automatically sets attendance.txt as file to be checked; no need to enter file name separately
			Scanner scan = new Scanner(inputFile);
		
			Map<String, TreeSet<String>> emailInfo = new TreeMap<String, TreeSet<String>>(); //as done in class, we create a treeMap to hold the information from each email
		
			while (scan.hasNextLine()) {
			
				Email attendee = new Email(scan.nextLine()); //create email object for each line (in this case, each separate email)
				String key = attendee.parseCompanyName(); //set the key as the company name as instructed in class
				String name = attendee.parseEmailName(); //key's values will be the names of the reps
			
				TreeSet<String> ts; //TreeSet to get ordered list
			
				if (emailInfo.containsKey(key)) {
					ts = emailInfo.get(key);
					ts.add(name);       
				} else {
				//if key not in Map...
					ts = new TreeSet<String>(); //create new set to add to TreeMap
					ts.add(name);
				}    

				emailInfo.put(key, ts);    

			} //end while loop
			
			System.out.println("");
			System.out.println("Sorted List of Attendees per Company:");
			
			//Iterate through TreeMap
			Iterator it = emailInfo.entrySet().iterator();
			while(it.hasNext()) {
		
				Map.Entry<String, TreeSet<String>> pair = (Map.Entry)it.next();
				String k = pair.getKey();
				TreeSet<String> t = pair.getValue();

				for (String str: t) {
					//Print newly sorted attendance for Part 1
					System.out.println(k + "\t" + str);
				
				
					//Store values of number of attendees per company while looping through tree value (Part 2)
					if(k.equals("amzn"))
						amznCount++;
					else if(k.equals("fb"))
						fbCount++;
					else if(k.equals("goog"))
						googCount++;
					else if(k.equals("msft"))
						msftCount++;
					else if(k.equals("orcl"))
						orclCount++;
				
				
					//Check for if bill gates attended the conference (Part 3)
					if(str.equals("bill.gates"))
						billAttended = true;
					
				} //end for loop 

			} //end while loop
		
			//Print Histogram for Part 2
			System.out.println("");
			System.out.println("Histogram of Attendees Per Company:");
		
			System.out.println("Amazon    |" + (" *").repeat(amznCount));
			System.out.println("Facebook  |" + (" *").repeat(fbCount));
			System.out.println("Google    |" + (" *").repeat(googCount));
			System.out.println("Microsoft |" + (" *").repeat(msftCount));
			System.out.println("Oracle    |" + (" *").repeat(orclCount));
		
			//Print whether or not Bill Gates attended the conference for Part 3
			if(billAttended = true) {
				System.out.println("");
				System.out.println("According to the list, Bill Gates attended the conference.");
			} else {
				System.out.println("");
				System.out.println("Ah too bad, Bill Gates did not attend the conference.");
			}
		
        } catch(FileNotFoundException exception) {
        	
        	System.out.println("\"attendance.txt\" file not found. Please make sure the file exists in the same directory, and try again.");
        
        }
        
	} //end main

} //end class
