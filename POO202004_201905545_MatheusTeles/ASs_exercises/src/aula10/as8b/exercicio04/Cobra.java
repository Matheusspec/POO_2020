package aula10.as8b.exercicio04;

public class Cobra extends Animal {

	public Cobra(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som da cobra\n");

	}

	@Override
	public void mover() {
		System.out.println("Cobra rastejando!\n");

	}

}
