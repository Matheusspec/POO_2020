package aula10.as8b.exercicio01;

public class Cavalo extends Animal {
	

	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}
	 
	public Cavalo() {}
	
	public String emitirSom() {
		return "Emitindo som do cavalo";
	}

	@Override
	public String mover() {
		return "Cavalo correndo!";

	}
	
	public String correr() {
		return mover();
	}
}
