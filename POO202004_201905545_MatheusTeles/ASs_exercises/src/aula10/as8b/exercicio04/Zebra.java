package aula10.as8b.exercicio04;

public class Zebra extends Animal {

	public Zebra(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som da Zebra");

	}

	@Override
	public void mover() {
		System.out.println("Zebra correndo!\n");

	}
	
	public void correr() {
		mover();
	}

}
