package aula14.salaaula.teste;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AlgumTeste {
	
	@Test
	public void teste1() {
		int a = 10;
		int b = 5;
		int c = a + b;
		assertTrue(c == 15);
	}
	
	@Test
	public void testExpectedException() {
	 
	  Assertions.assertThrows(ArithmeticException.class, () -> {
	    int c = 10 / 0;
	  });
	}
}

