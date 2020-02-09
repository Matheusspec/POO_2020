package aula12.as10b.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Subpasta implements Pasta{

	String nome;
	Arquivo arq;

	public Subpasta() {}

	Subpasta(String nome) {
		this.nome = nome;
	}

	List<Pasta> a = new ArrayList<Pasta>();
	

	public void add(Pasta sub) {
		this.a.add(sub);
	}

	public void remove(Pasta sub) {
		this.a.remove(sub);
	}

	@Override
	public void abrir() {
		System.out.println(this.nome +  ":");
		for (Pasta pasta: a) {
			pasta.abrir();
		}
		

	}

}
