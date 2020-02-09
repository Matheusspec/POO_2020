package aula10.as8b.exercicio04;

public class Zebra extends Animal {

	public Zebra(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	Zebra(){}
	
	@Override
	public String emitirSom() {
		return "Emitindo som da Zebra";

	}

	@Override
	public String mover() {
		return "Zebra correndo!";

	}
	
	public String correr() {
		return mover();
	}
}
