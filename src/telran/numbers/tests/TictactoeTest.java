package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.TictactoeGame;

import static telran.numbers.TictactoeGame.*;

class TictactoeTest {

	

	@Test
	void testTictactoeMove() {
		char [][] matrix1 = {
				{O, O, E},
				{O, O, O},
				{O, E, O},
	};
		char [][] matrix2 = {
				{O, O, E},
				{O, X, O},
				{O, X, O},
	};
		char [][] matrix3 = {
				{X, O, E},
				{O, E, O},
				{O, X, E},
	};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix1, 0, 2, O)); 
		assertEquals(-1, TictactoeGame.tictactoeMove(matrix1, 0, 2, '8'));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix1, 2, 2, X));
		assertEquals(3, TictactoeGame.tictactoeMove(matrix2, 0, 2, X));
		assertEquals(0, TictactoeGame.tictactoeMove(matrix3, 2, 2, X));
	}
	

	
	@Test
	void isRowFullTest () {
		char [][] matrix1 = {
				{O, O, O},
				{O, O, E},
				{O, O, X},
		};
		
		assertTrue(TictactoeGame.isRowFull(matrix1, 0));
		assertFalse(TictactoeGame.isRowFull(matrix1, 2));
		
	}
	
	@Test
	void isLeftDiagFullTest () {
		char [][] matrix1 = {
				{O, O, E},
				{O, O, O},
				{O, E, O},
		};
		char [][] matrix2 = {
				{O, O, E},
				{O, O, O},
				{O, E, X},
		};
		assertTrue(TictactoeGame.isLeftDiagFull(matrix1));
		assertFalse(TictactoeGame.isLeftDiagFull(matrix2));
	}
	
	@Test
	void isRightDiagFullTest () {
		char [][] matrix1 = {
				{O, O, X},
				{O, X, O},
				{X, E, O},
		};
		char [][] matrix2 = {
				{O, O, E},
				{O, O, O},
				{X, E, X},
		};
		assertTrue(TictactoeGame.isRightDiagFull(matrix1));
		assertFalse(TictactoeGame.isLeftDiagFull(matrix2));
	}
	
	@Test
	void isColumnFullTest () {
		char [][] matrix1 = {
				{O, O, E},
				{O, O, O},
				{O, E, X},
		};
	
		assertTrue(TictactoeGame.isColumnFull(matrix1, 0));
		assertFalse(TictactoeGame.isColumnFull(matrix1, 2));
	}
	
//	@Test
	void isGameOverTest () {
		char [][] matrix1 = {
				{O, O, E},
				{O, O, O},
				{E, E, O},
	};
		char [][] matrix2 = {
				{O, O, O},
				{O, O, E},
				{X, X, O},
	};
		
	
		
		assertEquals(0, TictactoeGame.tictactoeMove(matrix1, 0, 2, X ));
		assertEquals(3, TictactoeGame.tictactoeMove(matrix2, 1, 2, O ));
	}
	
	@Test
	void isMatrixFullTest () {
		char [][] matrix1 = {
				{O, O, O},
				{O, O, O},
				{X, X, O},
		};
		char [][] matrix2 = {
				{O, O, O},
				{O, O, O},
				{X, X, E},
		};
	
		assertTrue( TictactoeGame.isMatrixFull(matrix1));
		assertFalse( TictactoeGame.isMatrixFull(matrix2));
		
	}
	
	
	
	}
