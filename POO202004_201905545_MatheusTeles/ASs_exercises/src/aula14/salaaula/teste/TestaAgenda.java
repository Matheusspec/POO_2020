package aula14.salaaula.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula03.as3b.exercicio02.Agenda;
import aula03.as3b.exercicio02.Contato;

public class TestaAgenda {

	Agenda agenda; 
	
	@Before
	public void setup() {
		agenda = new Agenda(); 
	} 
	
	@Test
	public void testaAdicaoPessoaAgenda() {
		agenda.adicionaContato("Antonio Carlos", 35, 1.75f);
        agenda.adicionaContato("Pedro Paulo", 18, 1.65f);
        agenda.adicionaContato("Jorley da Cambalhota", 32, 1.85f);
        assertTrue(agenda.getListaContatos().size() == 3);
	}
	
	@Test
	public void testaRemocaoPorNome() {
		agenda.adicionaContato("Antonio Carlos", 35, 1.75f);
        agenda.adicionaContato("Pedro Paulo", 18, 1.65f);
        agenda.adicionaContato("Jorley da Cambalhota", 32, 1.85f);
        agenda.removeContato("Pedro Paulo");
        assertTrue(agenda.getListaContatos().size() == 2);
	}
	
	@Test
	public void testaRemocaoPessoaObjeto() {
		Contato p1 = new Contato("Antonio Carlos", 35, 1.75f);
		agenda.adicionaContato(p1);
		Contato p2 = new Contato("Pedro Paulo", 18, 1.65f);
        agenda.adicionaContato(p2);
        Contato p3 = new Contato("Jorley da Cambalhota", 32, 1.85f);
        agenda.adicionaContato(p3);
        agenda.removeContato(p2);
        assertTrue(agenda.getListaContatos().size() == 2);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testaRemocaoPorIndice() {
		agenda.adicionaContato("Antonio Carlos", 35, 1.75f);
        agenda.adicionaContato("Pedro Paulo", 18, 1.65f);
        agenda.adicionaContato("Jorley da Cambalhota", 32, 1.85f);
        agenda.removeContato(4);
        assertTrue(agenda.getListaContatos().size() == 2);
	}
	 
	@Test
	public void testaRemocaoPorIndice2() {
		agenda.adicionaContato("Antonio Carlos", 35, 1.75f);
        agenda.adicionaContato("Pedro Paulo", 18, 1.65f);
        agenda.adicionaContato("Jorley da Cambalhota", 32, 1.85f);
        agenda.removeContato(0);
        assertTrue(agenda.getListaContatos().size() == 2);
	}
	
	@Test
	public void testaConsulta() {
		agenda.adicionaContato("Antonio Carlos", 35, 1.75f);
        agenda.adicionaContato("Pedro Paulo", 18, 1.65f);
        agenda.adicionaContato("Jorley da Cambalhota", 32, 1.85f);
        
        Contato p = agenda.getListaContatos().get(2);
        
        assertTrue(p.getIdade() == 32);
	}
	
}
