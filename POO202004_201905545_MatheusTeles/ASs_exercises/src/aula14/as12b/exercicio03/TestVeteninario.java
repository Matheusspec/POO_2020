package aula14.as12b.exercicio03;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula10.as8b.exercicio03.Animal;
import aula10.as8b.exercicio03.Veteninario;
import aula10.as8b.exercicio03.Cachorro;
import aula10.as8b.exercicio03.Cavalo;
import aula10.as8b.exercicio03.Preguica;

public class TestVeteninario {
	Veteninario vet;
	
	@Before
	public void setup() {
		vet = new Veteninario();
	}
	
	@Test
	public void testaExame() {
		Animal c = new Cachorro();
		//Ao examinar o cachorro deve emitir o som
		assertTrue(vet.examinar(c).equals(c.emitirSom()));
	}
	
	@Test
	public void testaExameCavalo() {
		Animal cv = new Cavalo();
		//Ao examinar o cavalo deve emitir o som
		assertTrue(vet.examinar(cv).equals(cv.emitirSom()));
	}
	
	@Test
	public void testaExameCavalo2() {
		Animal cv2 = new Cavalo();
		//Ao examinar o cavalo deve emitir o som
		assertTrue(vet.examinar(cv2).equals("Emitindo som do boi"));
	}

	@Test
	public void testaExamePreguica() {
		Animal p = new Preguica();
		//Ao examinar o cavalo deve emitir o som
		assertTrue(vet.examinar(p).equals("Emitindo som da preguiça"));
	}
}
