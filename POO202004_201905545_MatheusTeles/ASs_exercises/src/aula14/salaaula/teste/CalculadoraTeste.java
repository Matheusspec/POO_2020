package aula14.salaaula.teste;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import aula13.salaaula.excecao.Calculadora;

public class CalculadoraTeste {
	
	Calculadora calc;
	
	@Before
	public void setup() {
		calc = new Calculadora();
	} 
	
	@Test
	public void testExpectedException() {
	 
	  Assertions.assertThrows(ArithmeticException.class, () -> {
	    calc.dividir(3, 0);
	  });
	}
	

}
