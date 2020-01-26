package aula04.as4b.exercicio01.empregado;

import java.util.ArrayList;
import java.util.List;

public class TestaEmpregado {

	public static void main(String[] args) {
		List<Empregado> employes = new ArrayList<Empregado>();
		
		Endereco e1 = new Endereco("Rua das Violetas",110,"Qd.24",75902201,"Jardim Flores","Rio Verde","GO");
		Empresa b1 = new Empresa("123213","Banco Santander Brasil S.A.",e1);
		Empregado p1 = new Empregado("Matheus Teles",213123,b1);

		Endereco e2 = new Endereco("Rua 26",23,"Qd.23 lt121",74902201,"Itatiaia","Goiania","GO");
		Empresa b2 = new Empresa("123213","Coca Cola Indústria LTDA.",e2);
		Empregado p2 = new Empregado("Jorge",4536232,b2);
		
		Endereco e3 = new Endereco("Av. Del Rey",223,"",330775240,"Vila Amaral","Belo Horizonte","MG");
		Empresa b3 = new Empresa("123213","Chiquinho Sorveres S.A",e3);
		Empregado p3 = new Empregado("Luis",432210,b3);

		employes.add(p1);
		employes.add(p2);
		employes.add(p3);
		
		System.out.println(employes.toString());
	}

}
