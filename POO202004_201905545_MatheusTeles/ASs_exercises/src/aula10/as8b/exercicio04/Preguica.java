package aula10.as8b.exercicio04;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public String emitirSom() {
		return "Emitindo som da preguiça";

	}

	@Override
	public String mover() {
		return "Preguiça se movendo!";

	}

}
