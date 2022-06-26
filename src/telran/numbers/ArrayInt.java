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
		int [] res = Arrays.copyOf(ar, ar.length+1);
		res [res.length-1] = number;
		return res;
		
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
	
		int [] res = new int [ar.length-1];
		System.arraycopy(ar, 0, res, 0, index);
		System.arraycopy(ar, index+1, res, index, res.length - index);
		return res;
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


//	public static void sort(int[] ar) {
//			for (int i = 0; i < ar.length; i++) {
//			moveMaxToEnd(ar);
//			}
//			
//		}
		
		//Improve algorithm with a proper move MaxToEnd method call
	
		public static void sort(int[] ar) { // Improved algorithm with a proper move MaxToEnd method call
			boolean res = false;
			do {
				res = moveMaxToEnd(ar);
			} while (res != true);

		}

		/**
		 * 
		 * @param ar
		 * @return Method created as homework task with additional var as flag if array
		 *         is already sorted and no need to call method moveMaxToEnd again
		 */
		private static boolean moveMaxToEnd(int[] ar) {
			boolean flag = true;
			for (int i = 1; i < ar.length; i++) {
				if (ar[i - 1] > ar[i]) {
					swap(ar, i);
					flag = false;
				}

			}
			return flag;
		}

		private static void swap(int[] ar, int index) {
			int tmp = ar[index - 1];
			ar[index - 1] = ar[index];
			ar[index] = tmp;
		}
	
	
//	public static void sort(int[] ar) {
//		boolean sort = false;
//		for (int i = 0; i < ar.length; i++) {
//			sort = moveMaxToEnd(ar);
//			if (sort == true) {
//				moveMaxToEnd(ar);
//			}
//			else break;
//		}


//	private static void moveMaxToEnd(int[] ar) { // Method written in the classwork
//
//		for (int i = 1; i < ar.length; i++) {
//			if (ar[i - 1] > ar[i]) {
//				swap(ar, i);
//
//			}
//		}
//	}
	


	/**
	 *
	 * @param ar - sorted array
	 * @param number
	 * @return if the given number exist  in the given array then returns the index of first occurrence, 
	 * otherwise returns negative value of (index + 1) where index is the index at which position 
	 * given element should have been
	 * 
	 */
	public static int binaryIndexOf(int[] ar, int number) {
		int left = 0;
		int right = ar.length - 1;
		int middle = ar.length / 2;
		int i = 0;

		if (number == ar[i] && number == ar[i + 1]) { //looking if numbers are same, so i = middle = 0
			middle = i;
		}
		while (left <= right && ar[middle] != number) {

			if (ar[middle] < number) {
				left = middle + 1; // looking for the number will be in right part of the array
			} else {
				right = middle - 1; // looking for number will be in the left part of the array
			}
			middle = (left + right) / 2;

		}
		if (left > right) {
			middle = -1;
		}
//			return left > right ? -1 : middle; // previous version

		if (middle == -1) {

			while (i < ar.length) {

				if (number > ar[ar.length - 1]) {
					middle = ar.length * -1;
					break;
				}

				if (number > ar[i]) {
					i++;
				}

				else {
					middle = i + 1;
					middle *= -1;
					break;
				}

			}

		}
		return middle;

	}
 	
	
	
	
	
	
	
 
}
