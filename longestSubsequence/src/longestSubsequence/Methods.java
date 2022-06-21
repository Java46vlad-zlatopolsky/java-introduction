package longestSubsequence;

public class Methods {
	
	public static int randomizer(int min, int max) { // randomizer to get random numbers
		
		return (int) (min + Math.random()*(max - min + 1));
				
	}
	
	public static int[] createArray (int number) { // array initialization
		
		int [] ar = new int [number];
		
		return ar;
	}
	
	public static void fillArray (int [] ar) { // method for filling array with random numbers from randomizer
		int min = 0, max = 9;
		for (int i = 0; i < ar.length-1 ; i++) {
			ar[i] = randomizer(min, max);
		}
	}
	
	public static int subsequenceCount (int [] ar) {
		int [] arc = new int [ar.length]; // create additional array to store maximal sub-sequence length number
		int count = 0;
		for (int i = 0; i< ar.length-1 ; i++) {
			
			if (ar[i] == ar[i+1]) { // compare if current and next primitives are same
				count ++;
				
			}
			else {
			arc[i] = count; //store current sequence length in array arc[]
			count = 1;
			}
			
			
		}
		
		for (int i = 0; i < arc.length-1 ; i++) { //compare which sequence number is greater 
			if (arc[i] > count) {
				count = arc [i];
			}
		}
		return count;
		
	}
	
	public static void printArray(int [] ar) {
		for (int a : ar) {
		System.out.print(a + " | ");	
		}
		System.out.println();
	}
	
	
 
}
