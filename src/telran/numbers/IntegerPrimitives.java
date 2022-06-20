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
		//System.out.println("Char calculated lenght: " + length);
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
		//System.out.println("Long calculated lenght: " + length);
		return length;
	}
	
	
	private static int getLength (long x){
		long value = 1;
		int count = 1;
		while (value < x && value > 0) {
			value *= 2;
			count ++;
		}
	return count / 8;
	}

	
}
