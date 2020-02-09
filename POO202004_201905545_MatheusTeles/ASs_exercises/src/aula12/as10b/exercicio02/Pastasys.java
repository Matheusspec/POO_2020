package aula12.as10b.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Pastasys implements Pasta {

	String nome;
	Subpasta sub;
	Arquivo arq;

	public Pastasys() {}

	Pastasys(String nome) {
		this.nome = nome;
	}

	List<Pasta> past = new ArrayList<Pasta>();

	public void add(Pasta sub) {
		this.past.add(sub);
	}

	public void remove(Pasta sub) {
		this.past.remove(sub);
	}

	@Override
	public void abrir() {
		System.out.println(this.nome + ":" );
		for (Pasta pasta : past) {
			pasta.abrir();
			System.out.println("\n");
		}
	}

}
