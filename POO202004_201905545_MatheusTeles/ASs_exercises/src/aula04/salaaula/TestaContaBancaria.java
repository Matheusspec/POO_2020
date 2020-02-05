package aula04.salaaula;

import java.util.ArrayList;
import java.util.List;

public class TestaContaBancaria {

	public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setNumero(326679);
		contaBancaria.setSaldo(15000.0d);
		contaBancaria.setLimite(500);
		contaBancaria.setTipo("Corrente");
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli = new Cliente();
		cli.setNome("João Carlos dos Santos");
		cli.setEndereco("Rua seila, Parque nn, 0909");
		cli.setCpf("191");
		
		Cliente cli1 = new Cliente();
		cli1.setNome("Maria da Silva");
		cli1.setEndereco("Rua seila, Parque nn, 0909");
		cli1.setCpf("19.641");
		
		
		clientes.add(cli);
		clientes.add(cli1);
		
		contaBancaria.setTitulares(clientes);
		
		//System.out.println("Nome do Titular da conta: " + contaBancaria.getTitular().getnome());
		
		for(Cliente c: contaBancaria.getTitulares()) {
			System.out.println(c.getNome());
		}

	}

}
