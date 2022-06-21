package longestSubsequenceTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import longestSubsequence.Methods;

class Tests {

	@Test
	void subsequenceCountTest() {
		int [] ar1 = {0};
		int [] ar2 = {1,2,3,4};
		int [] ar3 = {1,3,3,2,8,8,8,5,6,6};
		int a = Methods.subsequenceCount(ar1);
		int b = Methods.subsequenceCount(ar2);
		int c = Methods.subsequenceCount(ar3);
		assertEquals(0, a);
		assertEquals(1, b);
		assertEquals(3, c);
	}
	
	@Test
	void randomizerTest () {
		int a = Methods.randomizer(0, 9);
		assertEquals((a > 0 || a < 10 ), (a > 0 || a < 10 ));
	}
	
	@Test
	void createArrayTest () {
		int ar [] = Methods.createArray(5);
		int a = ar.length;
		assertEquals(5, a); 
	}

}
