package toBinaryStr_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import toBinaryStr_methods.Methods;

class ToBinaryTests {

	@Test
	void toBinaryStrTest() {
		String a = Methods.toBinaryStr(5);
		String b = Methods.toBinaryStr(0);
		assertEquals("101", a);
		assertEquals("0", b);  
	}

}
