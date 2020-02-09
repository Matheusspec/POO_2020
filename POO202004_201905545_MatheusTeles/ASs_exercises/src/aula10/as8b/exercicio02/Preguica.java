package aula10.as8b.exercicio02;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public Preguica(){};

	@Override
	public String emitirSom() {
		return "Emitindo som da preguiça";

	}

	@Override
	public String mover() {
		return "Preguiça se movendo!";

	}

}
