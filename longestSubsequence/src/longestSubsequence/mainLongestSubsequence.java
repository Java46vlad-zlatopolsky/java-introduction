package longestSubsequence;

public class mainLongestSubsequence {

	public static void main(String[] args) {
		
		//System.out.println(Methods.randomizer(0, 9)); // method to test randomizer
		
		int arrayLength = Methods.randomizer(0, 9); // define array length
		System.out.println("Array length is: " + arrayLength); // print array length (optional)
		int ar [] = Methods.createArray(arrayLength); // Initialize array
		Methods.fillArray(ar); // Fill array with random numbers
		//int [] ar = {1,3,3,2,8,8,8,8,5,6,6}; // Test array for manual testing
		Methods.printArray(ar); // Prints filled with random numbers array 
		System.out.println("The length of longest sub-sequence is: " + Methods.subsequenceCount(ar)); // Print array longest sub-sequence
		

	}

}
