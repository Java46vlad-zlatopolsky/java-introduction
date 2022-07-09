package telran.text;
import static telran.text.RegularExpressions.*;
import org.hamcrest.core.StringStartsWith;

public class Strings {
	/**
	 * 
	 * @param str1 ascii string with no repeated symbols
	 * @param str2 ascii string with no repeated symbols
	 * @return array with two numbers first - number of the symbols of the str2 that
	 *         exist in str1 at the same indexes second - number of the symbols of
	 *         the str2 that exist in str1 at different indexes
	 */
	public static int[] deepNoRepeatedCompare(String str1, String str2) {
		// TODO
		// Hints for two different implementations
		// first: additional helper array such that array['a']
		// is an index of the symbol 'a' in str1 or -1
		// example, str1 - "ctab" then array['a'] = 2;
		// ************************************************
		// second: implementation based on the method indexOf
		int res[] = new int[2];
		/*******************************************/
		// first implementation O[N]
		// helperImpl(str1, str2, res);
		/********************************************/
		// second implementation based on indexOf O[N^2]
		indexOfImpl(str1, str2, res);

		return res;
	}

	private static void indexOfImpl(String str1, String str2, int[] res) {
		char str2Ar[] = str2.toCharArray();
		for (int i = 0; i < str2Ar.length; i++) {
			int index = str1.indexOf(str2Ar[i]);
			if (index >= 0) {
				res[index == i ? 0 : 1]++;
			}
		}
	}

	private static void helperImpl(String str1, String str2, int[] res) {
		int helper[] = new int[127];

		fillInitHelper(helper);
		fillHelperString1(str1, helper);
		fillResult(helper, res, str2);
	}

	private static void fillInitHelper(int[] helper) {
		for (int i = 0; i < helper.length; i++) {
			helper[i] = -1;
		}

	}

	private static void fillResult(int[] helper, int[] res, String str2) {
		char str2Ar[] = str2.toCharArray();
		for (int i = 0; i < str2Ar.length; i++) {
			int index = helper[str2Ar[i]];
			if (index >= 0) {
				res[index == i ? 0 : 1]++;

			}
		}
	}

	private static void fillHelperString1(String str1, int[] helper) {
		char str1Ar[] = str1.toCharArray();// abcde helper['d']==3
		for (int i = 0; i < str1Ar.length; i++) {
			helper[str1Ar[i]] = i;
		}
	}

	/**
	 * 
	 * @param str1 English letters (may have repeats)
	 * @param str2 English letters (may have repeats)
	 * @return true if : (1) str2 has the same as str1 length (2) str2 comprises of
	 *         all letters from str1
	 */
	public static boolean isAnagram(String str1, String str2) {

		// additional helper array such that array['a'] is the number of 'a' occurrences
		// in str1
		// str1 = "hello", array['l'] = 2; array['w'] = 0;

		if (str1.length() != str2.length()) {
			return false;
		}
		int[] helper = new int[127];
		fillHelperOccurrences(str1, helper); // fill lookup table
		return isAnagram(str2, helper);

	}

	private static boolean isAnagram(String str, int[] helper) {
		char[] strAr = str.toCharArray();
		for (int i = 0; i < strAr.length; i++) {
			int count = helper[strAr[i]]--; // d = ++c vs. d = c++
			if (count == 0) {
				return false;
			}
		}
		return true;
	}

	private static void fillHelperOccurrences(String str, int[] helper) {
		char[] strAr = str.toCharArray();

		for (int i = 0; i < strAr.length; i++) {
			helper[strAr[i]]++;
		}

	}

	static public String join(String[] array, String delimiter) {
		// STring "+" operator based solution
		// return stringPluseSolution(array, delimiter);
		// StringBuilder attend based solution
		return stringBuilderSolution(array, delimiter);
	}

	static private String stringBuilderSolution(String[] array, String delimiter) {
		StringBuilder strBuilder = new StringBuilder(array[0]);
		for (int i = 1; i < array.length; i++) {
			strBuilder.append(delimiter).append(array[i]);
		}
		return strBuilder.toString();
	}

	static private String stringPluseSolution(String[] array, String delimiter) {
		String res = array[0]; // assumption: there is at least one string
		for (int i = 1; i < array.length; i++) {
			res += delimiter + array[i];
		}
		return res;
	}

	/**
	 * 
	 * @param name1 - first name
	 * @param name2 - second name
	 * @return either "match" or "no match" in accordance to the comments (see TODO)
	 */
	static public String matches(String name1, String name2) {

//      String matches(String name1, String name2)
//      Names match under the following conditions, after breaking each one into "name parts" on whitespace :
//      - Two name parts match if they are the same (case insensitive) or one is a single letter initial and the other is longer but starts with the same letter.
//      - A name part in  the name1 may be missing from the name2
//      - Name parts in one name must not contradict name parts in the other
//      - Name parts that match must be in the same order in both names

		String[] name1sp = name1.split(" ");
		String[] name2sp = name2.split(" ");
		String res = null;

		boolean isMatch = true;
		boolean remMatch = false;

		for (int i = 0, j = 0; i < name1sp.length;) {
			remMatch = isMatchCheck(name1sp[i], name2sp[j]);
			if (remMatch) {
				i++;
				j++;
				isMatch = true;

			}
			if (!remMatch) {
				i++;
				isMatch = false;
			}
			if (i == name1sp.length && j != name2sp.length) {
				isMatch = false;
			}
		}

		if (isMatch) {
			res = "match";
		} else
			res = "no match";

		return res;

	}

	static boolean isMatchCheck(String str1, String str2) {

		if (str1.equalsIgnoreCase(str2) || str1.startsWith(str2) || str2.startsWith(str1)) {
			return true;
		} else
			return false;
	}

	/**
	 * sorts array of strings
	 * 
	 * @param strNumbers array of strings containing the positive integer numbers
	 *                   length of each string can not be more than three symbols
	 *                   String containing "123" should be greater than string
	 *                   containing "23" as the number 123 greater than number 23
	 */
	static public String[] sortStringsAsNumbers(String[] strNumbers) {

		// Algorithm complexity should be O[N]
		// Implementation hint: additional helper array such that ar[10] - count of
		// occurrences
		// of number 10 in the given array
		// find out how to get number from a string and how to convert number to string

		int index = 0;
		int[] LookupTableAr = new int[1000];
		String[] sortAr = new String[strNumbers.length];

		for (int i = 0; i < strNumbers.length; i++) {
			if (Integer.parseInt(strNumbers[i]) > 999) {
				return null;
			}
			LookupTableAr[Integer.parseInt(strNumbers[i])] += 1;
		}

		for (int i = 0; i < LookupTableAr.length; i++) {
			String fill = String.valueOf(i);
			if (LookupTableAr[i] > 0) {
				do {
					sortAr[index] = fill;
					index++;
					LookupTableAr[i]--;
				} while (LookupTableAr[i] > 0);
			}
		}

		return sortAr;
	}
	
	
	
	public static boolean isIPv4(String ipV4str) {

		return ipV4str.matches(ipV4Regex());
	}

	public static boolean isJavaVariable(String javaVariable) {

		return javaVariable.matches(javaVariableRegex());
	}

	public static boolean isArithmeticExpression(String expression) {
		if (!checkParentheses(expression)) {
			return false;
		}
		expression = removeSpacesAndParentheses(expression);

		return expression.matches(arithmeticExpression());
	}
	
	
	
	
	/**
	 * method remove parentheses from the expression
	 * @param expression
	 * returns string with no parentheses and no spaces
	 */
	public static String removeSpacesAndParentheses(String expression) {

		char[] checkMeArray = expression.toCharArray();
		int countOfParenthesesAndSpaces = 0;

		for (int i = 0; i < checkMeArray.length; i++) {
			if (checkMeArray[i] == '(' || checkMeArray[i] == ')' || checkMeArray[i] == ' ') {
				checkMeArray[i] = '\0';
				countOfParenthesesAndSpaces++;
			}
		}
		char[] fillMeArray = new char[checkMeArray.length - countOfParenthesesAndSpaces];
		for (int i = 0, j = 0; i < checkMeArray.length; i++, j++) {
			if (checkMeArray[i] == '\0') {
				j--;
				continue;
			}
			fillMeArray[j] = checkMeArray[i];
		}
		String result = new String(fillMeArray);

		return result;
	}
	
	/**
	 * 
	 * @param expression
	 * @return true if for each '(' exist ')'
	 * examples: (ab)(dg(g)) - right
	 * wrong: (ab))((cd)
	 * 	 * 
	 */
	public static boolean checkParentheses(String expression) {

		// Hint: each ( => ++ counter, each ) => -- counter. if counter < 0 something
		// wrong and == false and break
		// at he end of our expression count should be 0;
		char[] checkMeArray = expression.toCharArray();
		int parenthesesCounter = 0;
		for (int i = 0; i < checkMeArray.length; i++) {
			if (checkMeArray[i] == '(') {
				parenthesesCounter++;
			}
			if (checkMeArray[i] == ')') {
				parenthesesCounter--;
			}
		}
		if (parenthesesCounter != 0) {
			return false;
		}

		return true;
	}
	
		
	
	
	
}
