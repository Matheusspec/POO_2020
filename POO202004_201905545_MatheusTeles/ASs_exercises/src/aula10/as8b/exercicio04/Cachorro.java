package aula10.as8b.exercicio04;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som do cachorro");

	}

	@Override
	public void mover() {
		System.out.println("Cachorro correndo!\n");

	}
	
	public void correr() {
		mover();
	}

}
