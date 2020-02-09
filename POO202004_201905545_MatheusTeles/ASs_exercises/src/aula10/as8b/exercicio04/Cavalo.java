package aula10.as8b.exercicio04;

public class Cavalo extends Animal {
	

	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}

     Cavalo(){}
	
	@Override
	public String emitirSom() {
		return "Emitindo som do Cavalo";

	}

	@Override
	public String mover() {
		return "Cavalo correndo!";

	}
	
	public String correr() {
		return mover();
	}
}
