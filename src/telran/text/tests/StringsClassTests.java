package telran.text.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringsClassTests {

	private static final int N_RUNS = 10000;
	private static final int N_STRINGS = 10000;

	@Test
	void deepCompareTest() {
		String str1 = "123,tT89";
		String str2 = "123,tT89";
		String str3 = "19";
		String str5 = "98Tt,321";
		String str4 = "kugy";
		int expected1[] = { 8, 0 };
		int expected2[] = { 1, 1 };
		int expected3[] = { 0, 8 };
		int expected4[] = { 0, 0 };
		//for (int i = 0; i < N_RUNS; i++) {
			assertArrayEquals(expected1, Strings.deepNoRepeatedCompare(str1, str2));
			assertArrayEquals(expected2, Strings.deepNoRepeatedCompare(str1, str3));
			assertArrayEquals(expected3, Strings.deepNoRepeatedCompare(str1, str5));
			assertArrayEquals(expected4, Strings.deepNoRepeatedCompare(str1, str4));
		//}
	}

	@Test
	void isAnagramTests() {
		String str1 = "Hello";
		String str2 = "Helll";
		String str3 = "eloHl";
		String str4 = "Helo";
		String str5 = "lllll";
		assertTrue(Strings.isAnagram(str1, str3));
		assertFalse(Strings.isAnagram(str1, str2));
		assertFalse(Strings.isAnagram(str1, str4));
		assertTrue(Strings.isAnagram(str1, str1));
		assertFalse(Strings.isAnagram(str1, str5));
	}
	
	@Test
	void joinTest() {
		String array[] = {"Hello", "Vasya"};
		String expected = "Hello Vasya";
		assertEquals(expected, Strings.join(array, " "));
	}
	@Test
	void joinPerformanceTest() {
		String array[] = getBigArray();
		for(int i = 0; i < N_RUNS; i++) {
			Strings.join(array, " ");
		}
	}

	private String[] getBigArray() {
		String res[] = new String[N_STRINGS];
		for (int i = 0; i < res.length; i++) {
			res[i] = "Hello";
		}
		return res;
	}
	
	@Test
	void matchesTest() {
		String expected1 = "match";
		String expected2 = "match";
		String expected3 = "no match";
		String expected4 = "match";
		String expected5 = "match";
		String expected6 = "no match";
		String expected7 = "no match";
		String expected8 = "no match";
		
		String firstName1 = "David";
		String compareName1 = "david";
		
		String firstName2 = "John F";
		String compareName2 = "John Fitzgerald";
		
		String firstName3 = "John K";
		String compareName3 = "John Fitzgerald";
		
		String firstName4 = "Anna Maria Magdalena";
		String compareName4 = "Anna Magdalena";
		
		String firstName5 = "Anna Maria Magdalena";
		String compareName5 = "Maria Magdalena";
		
		String firstName6 = "Anna Maria Magdalena";
		String compareName6 = "Anna Maria Roberta";
		
		String firstName7 = "Anna Maria Magdalena";
		String compareName7 = "Anna Magdalena Roberta";
		
		String firstName8 = "Anna Maria Magdalena";
		String compareName8 = "Anna Magdalena Maria";
	
		assertEquals(expected1, Strings.matches(firstName1, compareName1));
		assertEquals(expected2, Strings.matches(firstName2, compareName2));
		assertEquals(expected3, Strings.matches(firstName3, compareName3));
		assertEquals(expected4, Strings.matches(firstName4, compareName4));
		assertEquals(expected5, Strings.matches(firstName5, compareName5));
		assertEquals(expected6, Strings.matches(firstName6, compareName6));
		assertEquals(expected7, Strings.matches(firstName7, compareName7));
		assertEquals(expected8, Strings.matches(firstName8, compareName8));

	}
	
	@Test
	void sortStringsAsNumbersTest() {
		String [] ar1 = {"123", "55", "10", "785"};
		String [] ar2 = {"123","123","0","800", "800", "800", "55", "10", "785"};
		String [] ar3 = {"0"};
		String [] ar4 = {"8888"};
		String [] expected1 = {"10", "55", "123", "785"};
		String [] expected2 = {"0", "10", "55", "123", "123","785", "800", "800", "800"};
		String [] expected3 = {"0"};
		String [] expected4 = null;
		
		assertArrayEquals(expected1, Strings.sortStringsAsNumbers(ar1));
		assertArrayEquals(expected2, Strings.sortStringsAsNumbers(ar2));
		assertArrayEquals(expected3, Strings.sortStringsAsNumbers(ar3));
		assertArrayEquals(expected4, Strings.sortStringsAsNumbers(ar4));
	}

}



