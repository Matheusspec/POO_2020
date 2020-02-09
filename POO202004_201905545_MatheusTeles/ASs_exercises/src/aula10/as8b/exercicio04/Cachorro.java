package aula10.as8b.exercicio04;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	Cachorro(){}
	
	@Override
	public String emitirSom() {
		return "Emitindo som do Cachorro";

	}

	@Override
	public String mover() {
		return "Cachorro correndo!";

	}
	
	public String correr() {
		return mover();
	}

}
