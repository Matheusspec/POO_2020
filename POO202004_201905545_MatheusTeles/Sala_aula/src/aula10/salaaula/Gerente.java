package aula10.salaaula;

public class Gerente extends Funcionario {
	private int senha;

	public double bonificacao() {
		double b = salario * 0.15;
		return b;
	}
}
