package aula10.as8b.exercicio02;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som do cachorro\n");

	}

	@Override
	public void mover() {
		System.out.println("Cachorro correndo!\n");

	}
	
	public void correr() {
		mover();
	}

}
