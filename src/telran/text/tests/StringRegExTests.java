package telran.text.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static telran.text.Strings.*;
import org.junit.jupiter.api.Test;

class StringRegExTests {

	@Test
	void javaVariableTrue() {
		
		assertTrue(isJavaVariable("__"));
		assertTrue(isJavaVariable("$"));
		assertTrue(isJavaVariable("$_"));
		assertTrue(isJavaVariable("abc"));
		assertTrue(isJavaVariable("abc100"));
		assertTrue(isJavaVariable("$2"));
		assertTrue(isJavaVariable("_2"));
	}
	
	@Test
	void javaVariableFalse() {
		assertFalse(isJavaVariable("2_"));
		assertFalse(isJavaVariable("_"));
		assertFalse(isJavaVariable("a 2"));
	}
	
	@Test
	void ipV4True() {
		assertTrue(isIPv4("0.0.0.0"));
		assertTrue(isIPv4("250.0.199.200"));
		assertTrue(isIPv4("001.0.2.0"));
		assertTrue(isIPv4("255.255.255.255"));
		assertTrue(isIPv4("255.255.255.249"));
	}

	@Test
	void ipV4False() {
		assertFalse(isIPv4("0.0.0.0.0"));
		assertFalse(isIPv4("0.*.10.0"));
		assertFalse(isIPv4("-10.0.2.0"));
		assertFalse(isIPv4("100..0.2.0"));
		assertFalse(isIPv4("192.168.200.256"));
		assertFalse(isIPv4("100.1.1.a"));
	}
	
	@Test
	void isArithmeticExpressionTrue() {
		assertTrue(isArithmeticExpression("a+b=10"));
		assertTrue(isArithmeticExpression("(a*2)/b = c"));
		assertTrue(isArithmeticExpression("(a * c)/b = c + 2 - (1 * 5)"));
	}
	
	//@Test
	void isArithmeticExpressionFalse() {
		assertFalse(isArithmeticExpression("a)+b=10"));
		assertFalse(isArithmeticExpression("abcd"));
		assertFalse(isArithmeticExpression("a,b-c;d"));
		assertFalse(isArithmeticExpression("a))bc!d@/*"));
	}
//	//@Test
//	void isParCountWorks () {
//		assertTrue(checkParentheses("a*(a+b)"));
//		assertTrue(checkParentheses("a*)a+b("));
//		assertFalse(checkParentheses("a*)a+b)"));
//	}
	
//	@Test
//	void wereParenthesesAndSpacesRemoved() {
//		assertEquals("a+2*2=x", removeSpacesAndParentheses("(a+2)* 2 = x"));
//	}
}
