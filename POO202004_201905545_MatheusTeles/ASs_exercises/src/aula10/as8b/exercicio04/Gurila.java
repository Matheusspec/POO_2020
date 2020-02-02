package aula10.as8b.exercicio04;

public class Gurila extends Animal {

	public Gurila(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som da gurila");
	}

	@Override
	public void mover() {
		System.out.println("Gurila Correndo!\n");

	}
	
	public void correr() {
		mover();
	}

}
