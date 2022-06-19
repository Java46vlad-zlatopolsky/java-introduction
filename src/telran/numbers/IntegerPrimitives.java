package telran.numbers;

public class IntegerPrimitives {

	public static byte getMaxByte() {
		byte res = 1;
		while (res > 0) {
			res *= 2;
		}
		return (byte) (res - 1);		
	}

	public static byte getMinByte() {
		byte res = (byte) (getMaxByte() + 1);
		return res;	
				
}

	public static int getLengthByte() {
	
		int length = getLength(Byte.MAX_VALUE+1);
		return length;
	}

	
	public static char getMaxChar() {
		char res = 1;
		while (res > 0) {
			res = (char) (res * 2);

		}
		return (char) (res - 1);
	}

	public static char getMinChar() {

		return (char) (getMaxChar() + 1);
	}

	public static int getLengthChar() {
		int length = getLength(Character.MAX_VALUE+1);
		System.out.println("Char calculated lenght: " + length);
		return length;
	}

	public static short getMaxShort() {
		short res = 1;
		while (res > 0) {
			res = (short) (res * 2);
		}
		return (short) (res - 1);
	}

	public static short getMinShort() {
		return (short) (getMaxShort() + 1);
	}

	public static int getLengthShort() {
		int length = getLength(Short.MAX_VALUE+1);
		return length;
	}

	public static int getMaxInt() {
		int res = 1;
		while (res > 0) {
			res *= 2;
		}
		return res - 1;
	}

	public static int getMinInt() {
		int res = 1;
		while (res > 0) {
			res = res * 2;
		}
		return res;
	}

	public static int getLengthInt() {
		int length = getLength(Integer.MAX_VALUE);
		return length;
	}

	public static long getMaxLong() {
		long res = 1;
		while (res > 0) {
			res = res * 2;
		}
		return res - 1;
	} 

	public static long getMinLong() {
		long res = 1;
		while (res > 0) {
			res = res * 2;
		}
		return res;
	}

	public static int getLengthLong() {
		int length = getLength(Long.MAX_VALUE);
		System.out.println("Long calculated lenght: " + length);
		return length;
	}
	
	

	/**
	 * 
	 * @param x you should understand what x is
	 * @return length of any type in accordance to the x length is number of bytes
	 *         for any type
	 */
//	private static int getLength (long val){
//		long mult = 1;
//		int count = 0;
//		int length = 0;
//		while(mult <= val+1) {
//			mult *=2;
//			count++;
//		}
//		//System.out.println(count);
//		switch (count) {
//		case 8: length = 1; break;
//		case 16: length = 2; break;
//		case 32: length = 4; break;
//		case 64: length = 8; break;
//		default: return 0;
//		}
//		return length;
//		}
	
	private static int getLength (long val){
		
		long N = val;
		int result = (int)(Math.log(N) / Math.log(2));
		//System.out.println("Logarithm base 2 of " + N + " is :" + result);
		if (result >= 7 && result <= 8) {
			result = 1;
		}
		else if (result >= 15 && result <= 16) {
			result = 2;
		}
		else if (result >= 30 && result <= 32) {
			result = 4;
		}
		else if (result >= 63 && result <= 64) {
			result = 8;
		}
		return result;
	
	
	}
	
//	private static int getLength (long val){ //working with plaster
//		long mult = 1;
//		int count = 0;
//		while(mult <= val && count <=64) {
//			mult *=2;
//			count++;
//		}
//		if (count > 7 && count <= 8) {
//			count = 1;
//		}
//		else if (count >= 15 && count <= 17) {
//			count = 2;
//		}
//		else if (count >= 30 && count <= 32) {
//			count = 4;
//		}
//		else if (count >= 60 && count <= 65) {
//			count = 8;
//		}
//		return count;
//		}
	

}
