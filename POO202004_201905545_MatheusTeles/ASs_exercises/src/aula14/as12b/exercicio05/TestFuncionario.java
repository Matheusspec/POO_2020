package aula14.as12b.exercicio05;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula10.as8b.exercicio05.Funcionario;
import aula10.as8b.exercicio05.FuncionarioEbasico;
import aula10.as8b.exercicio05.FuncionarioEmedio;
import aula10.as8b.exercicio05.FuncionarioSuperior;

public class TestFuncionario {
	Funcionario f;

	@Before
	public void setup() {
		f = new Funcionario();
	}

	@Test
	public void testeRenda() {

		Funcionario[] fc = new Funcionario[3];
		fc[0] = new FuncionarioEmedio("Jose", "3212-33");
		fc[1] = new FuncionarioSuperior("Felipe", "5533-02");
		fc[2] = new FuncionarioEbasico("Mathew", "4233-02");

		assertEquals(fc[1].rendaTotal(), fc[0].rendaTotal(), 0);
	}

	@Test
	public void testecusto() {
		Funcionario[] fc = new Funcionario[3];
		fc[0] = new FuncionarioEmedio("Jose", "3212-33");
		fc[1] = new FuncionarioSuperior("Felipe", "5533-02");
		fc[2] = new FuncionarioEbasico("Mathew", "4233-02");
		double custo = 0;
		for (int i = 0; i < 3; i++)
			custo += ((Funcionario) fc[i]).rendaTotal();

		assertEquals(custo, 8400, 0);
	}

	@Test
	public void testeComissao() {
		assertTrue(f.getgerente() > f.getsupervisor());
	}
	
	@Test
	public void testeComissao2() {
		assertTrue(f.getvendedor() >= f.getsupervisor());
	}
	@Test
	public void testeNome() {
		Funcionario[] fc = new Funcionario[3];
		fc[0] = new FuncionarioEmedio("Jose", "3212-33");
		fc[1] = new FuncionarioSuperior("Felipe", "5533-02");
		
		FuncionarioSuperior fs = (FuncionarioSuperior) fc[1];
		
		assertTrue(fs.getNome().equals(fc[1].getNome()));
	}

}
