package aula10.as8b.exercicio04;

public class Cavalo extends Animal {
	

	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}

	public void emitirSom() {
		System.out.println("Emitindo som do cavalo");

	}

	@Override
	public void mover() {
		System.out.println("Cavalo correndo!\n");

	}
	
	public void correr() {
		mover();
	}
}
