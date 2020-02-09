package aula10.as8b.exercicio04;

public class Tigre extends Animal {

	public Tigre(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String emitirSom() {
		return "Emitindo som do Tigre";

	}

	@Override
	public String mover() {
		return "Tigre correndo!";

	}

	public String correr() {
		return mover();
	}
}
