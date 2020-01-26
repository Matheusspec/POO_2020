package aula04.as4b.exercicio01.endereco;

import java.util.ArrayList;
import java.util.List;

public class TestaCliente {
	public static void main(String[] args) {
		
	
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	Endereco e1 = new Endereco("Rua das Violetas",110,"Qd.lt110",75902201,"Jardim Flores","Rio Verde","GO");
	Cliente c1 = new Cliente("Matheus Teles","787189300-01",e1);
	
	Endereco e2 = new Endereco("Rua 26",23,"Qd.23 lt121",74902201,"Itatiaia","Goiania","GO");
	Cliente c2 = new Cliente("Marcos","787121330-05",e2);
	
	Endereco e3 = new Endereco("Av. Del Rey",223,"",330775240,"Vila Amaral","Belo Horizonte","MG");
	Cliente c3 = new Cliente("Jonas Neto","7871832100-01",e3);

	clientes.add(c1);
	clientes.add(c2);
	clientes.add(c3);
	
	System.out.println(clientes.toString());
	}
}

