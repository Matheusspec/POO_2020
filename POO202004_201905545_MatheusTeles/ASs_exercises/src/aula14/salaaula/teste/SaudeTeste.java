package aula14.salaaula.teste;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SaudeTeste {
	
	private Saude saude;
	
	@Before 
	public void setup() {
		saude = new Saude();
	}
	
	@Test
	public void testaCondicaoFisica() {
		saude.setIdade(52);
		saude.setAltura(1.60);
		saude.setPeso(80.0);
		assertTrue(saude.condicaoFisica().equals("Obesidade"));
	}
	
	@Test
	public void testaCondicaoFisica1() {
		saude.setIdade(52);
		saude.setAltura(1.60);
		saude.setPeso(70.0);
		assertTrue(saude.condicaoFisica().equals("Sobrepeso"));
	}
	
	@Test
	public void testaCondicaoFisica2() {
		saude.setIdade(52);
		saude.setAltura(1.60);
		saude.setPeso(60.0);
		assertTrue(saude.condicaoFisica().equals("Pesso normal"));
	}
	
	@Test
	public void testaCondicaoFisica3() {
		saude.setIdade(52);
		saude.setAltura(1.60);
		saude.setPeso(50.0);
		assertTrue(saude.condicaoFisica().equals("Abaixo do peso"));
	}
	
	@Test
	public void testaIMC() {
		saude.setIdade(20);
		saude.setAltura(1.64);
		saude.setPeso(62);
		double imc = saude.getPeso() / (saude.getAltura()*saude.getAltura());
		assertEquals(saude.calculaIMC(), 23,01.2);

	};
}
