package aula14.as12b.exercicio01;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula10.as8b.exercicio01.Cavalo;

public class TestCavalo {

	Cavalo cp;

	@Before
	public void setup() {
		cp = new Cavalo();
	}

	@Test
	public void testeEmitirsom() {
		assertTrue(cp.emitirSom().equals("Emitindo som do boi"));
	}
	
	@Test
	public void mover() {
		assertTrue(cp.correr().equals("Cavalo correndo!"));
	}
	
}
