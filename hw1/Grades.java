class Grades {
	
	private int[] values;
	private int arrayLength;
	
	//Default constructor
	Grades() {
		
		arrayLength = 10;
		values = new int[arrayLength]; //This creates a default array (of null values), with a length of 10
		
	}
	
	//Constructor that passes in array
	Grades(int[] myArray) {
	
		values = myArray;
	
	}
	
	//Method to set [new] values in array - set values declaration
	public void setValues(int[] myArray) {
		
		values = myArray;
	
	}
	
	//Method to return said array (from previous) - returns values array
	public int[] getValues() {
		
		return values;
	
	}
	
	//Method to return the highest value in the array
	public int highest() {
		
		int highest = values[0];
		
		for(int i=0; i < values.length; i++)
			if(values[i] > highest)
				highest = values[i];
			
		return highest;
	
	}
	
	//Method to return the lowest value in an array
	public int lowest() {
		
		int lowest = values[0];
		
		for(int i=0; i < values.length; i++)
			if(values[i] < lowest)
				lowest = values[i];
		
		return lowest;
	
	}
	
	//Method to return the number of grades in an array
	public int numOfGrades() {
		
		int numOfGrades = values.length;
		
		return numOfGrades;
	
	}
	
	//Method to return the average of an array
	public double average() {
		
		double average;
		double sum = 0.0;
		
		for(int i=0; i < values.length; i++)
			sum = sum + values[i];
		
		average = sum / values.length;
		
		return average;
	
	}
	
	//Method to return the number of grades in an array lower than an input value
	public int numOfFailingGrades(int gradeValue) {
		
		int count = 0; 
		
		for(int i=0; i < values.length; i++)
			if(values[i] < gradeValue)
				count++;
		
		return count;
	
	}
	
	//Method to print a histogram for the grades in the array
	public void histogram() {
		
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;
		
		for(int i=0; i < values.length; i++)
			if(values[i] >= 90 && values[i] <= 100)
				A++;
			else if (values[i] >= 80 && values[i] <= 89)
				B++;
			else if (values[i] >= 70 && values[i] <= 79)
				C++;
			else if (values[i] >= 60 && values[i] <= 69)
				D++;
			else
				F++;
		
		System.out.print("90 - 100 | ");
		for (int i = 0; i < A; i++)
			System.out.print("* ");
		
		System.out.print("\n80 - 89  | ");
		for (int i = 0; i < B; i++)
			System.out.print("* ");
		
		System.out.print("\n70 - 79  | ");
		for (int i = 0; i < C; i++)
			System.out.print("* ");
		
		System.out.print("\n60 - 69  | ");
		for (int i = 0; i < D; i++)
			System.out.print("* ");
		
		System.out.print("\n< 60     | ");
		for (int i = 0; i < F; i++)
			System.out.print("* ");
			
		System.out.println("");
		
	}
	
}
