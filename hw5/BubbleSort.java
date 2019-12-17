//HW-5.1
// Create a program (using main method) that will sort an array of int using a bubble sort algorithm.  
// You can declare an array of int[]  in the program.

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		//[Unsorted] Array declaration
		int[] array = {0, -1, 3, 1715, -56, -1000, 84, 23, 76, 5};
		
		System.out.println("Original array: " + Arrays.toString(array));
		
		//BubbleSort Algorithm
		for(int i=0; i < array.length; i++) { //cycle through each element in the array (we need enough iterations to theoretically allow for a number in the last index to get to the first one)
			
			//System.out.println("");
			//System.out.println("Iteration " + i + ":" + Arrays.toString(array));
			
			for(int j=0; j < array.length-1; j++) { //arrayLength must go upto one less here (to avoid ArrayOutofBounds), because we compare j to j+1 (the next element)
				
				if(array[j] > array[j+1]) { //if the previous value is larger...
					//SWAP
					int temp = array[j+1]; //store the value in a temporary variable
					array[j+1] = array[j]; //set the value in the next index to the previous one
					array[j] = temp; //place the larger value in the higher index
				}
				//System.out.println("Comparison of index" + j + " and " + (j+1) + ":" + Arrays.toString(array));
				
			}
			
		} //end of BubbleSort algorithm
		
		System.out.println("After BubbleSort: " + Arrays.toString(array));
	
	}

}
