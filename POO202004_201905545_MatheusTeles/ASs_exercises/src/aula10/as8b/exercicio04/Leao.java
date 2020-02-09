package aula10.as8b.exercicio04;

public class Leao extends Animal {

	public Leao(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public Leao() {}
 
	@Override
	public String emitirSom() {
		return "Emitindo som do Leão";

	}

	@Override
	public String mover() {
		return "Leão correndo!";

	}

	public String correr() {
		return mover();
	}

}
