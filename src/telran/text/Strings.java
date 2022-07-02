package telran.text;

public class Strings {

	/**
	 * 
	 * @param str1 - ASCII string with no repeated symbols
	 * @param str2 - ASCII string with no repeated symbols
	 * @return array with two numbers: first - number of the symbols of the str2
	 *         that exist in str1 at same indexes second - number of the symbols of
	 *         the str2 that exist in str1 at different indexes
	 */
	public static int[] deepNoRepeatedCompare(String str1, String str2) {
		// TODO
		// Two implementations hints
		// First: create additional helper array O(n) such that array ['a'] - this is
		// number, like index (!!! important)
		// is index of the symbol 'a' in str1 or -1
		// example: str1 - "ctab" the array['a'] = 2 (index of a)

		// Second: O(n**2)
		// implementation based on the method indexOf
		return null;
	}

	/**
	 * 
	 * @param str1 - String array with English letters only (may have duplicates)
	 * @param str2 - String array with English letters only (may have duplicates)
	 * @return true if : (1) str2 has the same as str1 length (2) str2 comprises of
	 *         ALL letters from str1
	 */
	public static boolean isAnagram(String str1, String str2) {
		// TODO
		// additional helper array such that array['a'] is the number of 'a' occurrences
		// in str1
		// str1 = "hello", array['l'] = 2; array['w'] = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// boolean isSameLength = false;
		boolean isAnagramFlag = true;
		int count = 0;
		char[] arCount1 = new char[256];
		char[] arCount2 = new char[256];

		if (str1.getBytes().length == str2.getBytes().length) {
			

			for (char index = 'a'; index <= 'z'; index++) {
				for (int i = 0; i < str1.length(); i++) {
					if (str1.toCharArray()[i] == index) {
						++count;
						arCount1[index] = (char) count;
					}
				}
				count = 0;
				for (int i = 0; i < str2.getBytes().length; i++) {
					if (str2.toCharArray()[i] == index) {
						++count;
						arCount2[index] = (char) count;
					}

				}
			}

			for (char index = 'a'; index <= 'z'; index++) {
				if (arCount1[index] != arCount2[index]) {
					isAnagramFlag = false;
				}
			}
			return isAnagramFlag;

		}
		else {
		return false;
	}


	}
}
