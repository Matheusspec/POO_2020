package aula10.as8b.exercicio04;

public class Tigre extends Animal {

	public Tigre(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som do Tigre");

	}

	@Override
	public void mover() {
		System.out.println("Tigre Correndo!\n");

	}
	
	public void correr() {
		mover();
	}

}
