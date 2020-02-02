package aula10.as8b.exercicio05;

import java.text.DecimalFormat;

public class TestaFuncionario {

	public static void main(String[] args) {
		DecimalFormat dc = new DecimalFormat("#,###.00");
		Object[] emp = new Object[10];
		// EX 7
		emp[0] = new FuncionarioEmedio("José", "4433-22");
		emp[1] = new FuncionarioEmedio("Nando", "4433-12");
		emp[2] = new FuncionarioEmedio("Paulo", "4433-32");
		emp[3] = new FuncionarioEmedio("Mauro", "4433-52");
		emp[4] = new FuncionarioEbasico("Jorge", "4233-00");
		emp[5] = new FuncionarioEbasico("Marcos", "4233-01");
		emp[6] = new FuncionarioEbasico("Mathew", "4233-02");
		emp[7] = new FuncionarioEbasico("Lucas", "4233-03");
		emp[8] = new FuncionarioSuperior("Lucio", "5533-01");
		emp[9] = new FuncionarioSuperior("Felipe", "5533-02");

		double custo = 0;
		// EX 7, custo antes da comissão = 17,600
		for (int i = 0; i < 10; i++) {
			if (emp[i] instanceof Funcionario)
				custo += ((Funcionario) emp[i]).rendaTotal();
		}

		System.out.println("O custo para a empresa é de : " + dc.format(custo));

		// EX 10

		Funcionario[] fm = new Funcionario[10];

		fm[0] = new FuncionarioEmedio("José", "4433-22");
		fm[1] = new FuncionarioEmedio("Nando", "4433-12");
		fm[2] = new FuncionarioEbasico("Paulo", "4433-32");
		fm[3] = new FuncionarioEbasico("Mauro", "4433-52");
		fm[4] = new FuncionarioEbasico("Jorge", "4233-00");
		fm[5] = new FuncionarioEbasico("Marcos", "4233-01");
		fm[6] = new FuncionarioEbasico("Mathew", "4233-02");
		fm[7] = new FuncionarioEbasico("Lucas", "4233-03");
		fm[8] = new FuncionarioEbasico("Lucio", "5533-01");
		fm[9] = new FuncionarioSuperior("Felipe", "5533-02");

		double custo2 = 0;
		for (Funcionario a : fm)
			custo2 += a.rendaTotal();
		System.out.println("\nO custo para a empresa é: " + dc.format(custo2) + "\n");
		
		for (Funcionario a : fm)
			System.out.println(a.toString());
	}

}
