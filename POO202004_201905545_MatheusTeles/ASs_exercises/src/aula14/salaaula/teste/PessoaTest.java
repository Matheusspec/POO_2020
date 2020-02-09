package aula14.salaaula.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula03.as3b.exercicio01.Pessoa1;
import util.ConverteData;

public class PessoaTest {
	private Pessoa1 pessoa;

	@Before
	public void setup() { 
		pessoa = new Pessoa1();
	}
	@Test
	public void testaIdade() {
		pessoa.setNome("Malaquias");
		pessoa.setAltura(1.79);
		try {
			pessoa.setDataNascimento(
					ConverteData.convertStringToDate("20/10/1998"));
			}catch(Exception e) {
				e.getMessage();
			
		}
		assertTrue(pessoa.calculaIdade() == 20);
	}
}
