package telran.numbers;

public class SportLotoAppl {
/**
 * 
 * @param args
 * application should return 7 numbers random and not similar from 1 to 49
 */
	public static void main(String[] args) {

	}
	//helper method getting one random number int the range [min - max]
	private static int getRandomNumber(int min, int max) {
		//TODO
		return (int) (min + Math.random()*(max - min + 1));
	}

}
