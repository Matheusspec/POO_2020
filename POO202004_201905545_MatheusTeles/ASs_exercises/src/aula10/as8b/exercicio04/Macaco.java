package aula10.as8b.exercicio04;

public class Macaco extends Animal {

	public Macaco(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som do macaco");

	}

	@Override
	public void mover() {
		System.out.println("Macaco correndo!\n");

	}
	
	public void correr() {
		mover();
	}

}
