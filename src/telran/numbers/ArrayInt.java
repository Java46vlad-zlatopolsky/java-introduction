package telran.numbers;

import java.util.Arrays;

public class ArrayInt {
	/**
	 * 
	 * @param ar
	 * @param number
	 * @return new array with added number
	 */
	public static int [] addNumber(int [] ar, int number) {
//		int res[] = new int [ar.length + 1]; // creates array as the reference to ar.length + 1 primitives
//		//copying from ar[] to res[]
//		for (int i = 0; i < ar.length; i++) {
//			res[i] = ar[i];
//			
//		}
//		res[res.length - 1] = number;
//		return res;
		// TODO HW#3
		//rewrite this method using class Arrays. method copyOf via Google!
		
		int res [] = Arrays.copyOfRange(ar, ar.length+);
		res [ar.length] = 
	}
	
	
	/**
	 * 
	 * @param ar
	 * @param index
	 * @param number
	 * @return new array containing number value at the given index
	 */
	public static int [] insertNumber(int ar[], int index, int number) {
		int res []  = new int [ar.length + 1];
		System.arraycopy(ar, 0, res, 0, index);
		res [index] = number;
		System.arraycopy(ar, index, res, index + 1, ar.length - index);
		
		return res;
	}
	
	
	/**
	 * 
	 * @param ar
	 * @param index
	 * @return new array with removed number at the given index
	 */
	public static int[] removeNumber(int []ar, int index) {
		//TODO
		// solution should be based on the method array copy of the class system (System.arrayCopy)
		int res[] = new int [ar.length-1];
		System.arraycopy(ar, 0, res, 0, index);
		return null;
	}
	/**
	 * 
	 * @param ar
	 * @param number
	 * @return index of value if given number of first occurrence exist in array or -1 if doesn't exist
	 */
	public static int indexOf (int ar[], int number) {
		int res = -1;
		for (int i = 0; i < ar.length ; i++) {
			if (ar[i] == number) {
				res = i;
				break;
			}
		}
		return res;
	}
 	
	
	
	
	
	
	
 
}
