package aula10.as8b.exercicio04;

public class Ave extends Animal {

	public Ave(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som da Ave\n");

	}

	@Override
	public void mover() {
		System.out.println("Ave voando!\n");

	}

}
