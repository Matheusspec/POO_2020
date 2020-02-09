package aula14.as12b.exercicio02;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula10.as8b.exercicio02.Cachorro;
import aula10.as8b.exercicio02.Cavalo;
import aula10.as8b.exercicio02.Preguica;

public class TestAnimal {

	Preguica p = new Preguica();
	Cachorro c = new Cachorro();
	Cavalo cv = new Cavalo();

	@Before
	public void setup() {
		 p = new Preguica();
		 c = new Cachorro();
		 cv = new Cavalo();
	}
	
	@Test
	public void testeEmitirsomp() {
		assertTrue(p.emitirSom().equals("Emitindo som da macaco"));
	}
	
	@Test
	public void moverp() {
		assertTrue(p.mover().equals("Preguiça se movendo!"));
	}

	@Test
	public void testeEmitirsomcv() {
		assertTrue(cv.emitirSom().equals("Emitindo som do boi"));
	}
	
	@Test
	public void movercv() {
		assertTrue(cv.correr().equals("Cavalo correndo!"));
	}
	
	@Test
	public void testeEmitirsomch() {
		assertTrue(cv.emitirSom().equals("Emitindo som do cachorro"));
	}
	
	@Test
	public void moverch() {
		assertTrue(cv.correr().equals("Cachorro latindo!"));
	}
}

