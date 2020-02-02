package aula10.as8b.exercicio04;

public class Leao extends Animal {

	public Leao(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som do Leao");

	}

	@Override
	public void mover() {
		System.out.println("Leão correndo!\n");

	}
	
	public void correr() {
		mover();
	}

}
