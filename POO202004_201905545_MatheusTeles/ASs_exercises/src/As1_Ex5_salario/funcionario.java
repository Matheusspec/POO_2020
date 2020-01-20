package As1_Ex5_salario;

public class funcionario {
	String nome;
	double salario;
	
	double maior(double []salario, int numf) {
		int i = 0;
		double maior = salario[0];
		for(i = 0; i < numf; i++) {
			if(salario[i] > maior)
				maior = salario[i];
		}
		return(maior);
	}
	
	double menor(double []salario, int numf) {
		int i = 0;
		double menor = salario[0] ;
		for(i = 0; i < numf; i++) {
			if(salario[i] < menor)
				menor = salario[i];
		}
		return(menor);
	}
}
