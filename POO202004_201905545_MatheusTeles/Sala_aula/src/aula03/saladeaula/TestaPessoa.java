package aula03.saladeaula;

import java.util.Date;

public class TestaPessoa {
	public static void main (String[] args){
		Pessoa p1 = new Pessoa();
		p1.setNome("Jorge");
		p1.setDataNascimento(new Date());
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Data: " + p1.getDataNascimento());
		System.out.println("Espécie: " + p1.especie);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Jose");
		
	}
	
}
