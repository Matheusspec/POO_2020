package aula10.as8b.exercicio04;

public class Macaco extends Animal {

	public Macaco(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String emitirSom() {
		return "Emitindo som do macaco";

	}

	@Override
	public String mover() {
		return "macaco correndo!";

	}
	
	public String correr() {
		return mover();
	}	

}
