package aula14.as12b.exercicio04;

import aula10.as8b.exercicio04.Zoologico;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula10.as8b.exercicio04.Animal;
import aula10.as8b.exercicio04.Gurila;
import aula10.as8b.exercicio04.Leao;
import aula10.as8b.exercicio04.Cobra;

public class TestZoo {
	Zoologico zoo;
	
	@Before
	public void setup() {
		zoo = new Zoologico();
	}
	
	@Test
	public void testejaula() {
		Animal cobra = new Cobra();
		zoo.jaula[0] = cobra;
		assertTrue(((Animal)zoo.jaula[0]).emitirSom().equals(cobra.emitirSom()));
	}
	
	@Test
	public void testecobracorre() {
		Animal cobra = new Cobra();
		Animal leao = new Leao();
		zoo.jaula[0] = cobra;
		zoo.jaula[1] = leao;
		assertTrue(((Animal)zoo.jaula[0]).correr().equals(leao.correr()));
	}
	
	@Test
	public void testegurila() {
		Animal gu = new Gurila();
		zoo.jaula[0] = gu;
		assertEquals(((Animal)zoo.jaula[0]).correr(),"Gurila correndo");
	}
	
	@Test 
	public void testeleao() {
		Animal l = new Leao();
		zoo.jaula[1] = l;
		assertEquals(((Animal)zoo.jaula[1]).correr(),((Animal)zoo.jaula[1]).mover());	
	}
}
