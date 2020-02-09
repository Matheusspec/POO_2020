package aula14.as12b.exercicio01;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula10.as8b.exercicio01.Preguica;

public class TestePreguica {

	Preguica pe;

	@Before
	public void setup() {
		pe = new Preguica();
	}

	@Test
	public void testeEmitirsom() {
		assertTrue(pe.emitirSom().equals("Emitindo som da macaco"));
	}
	
	@Test
	public void mover() {
		assertTrue(pe.mover().equals("Preguiça se movendo!"));
	}
	
}
