package aula10.as8b.exercicio04;

public class Ave extends Animal {

	public Ave(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emitirSom() {
		return "Emitindo som da Ave";

	}

	@Override
	public String mover() {
		return "Ave voando!";

	}

}
