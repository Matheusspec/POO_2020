package aula10.as8b.exercicio04;

public class Gurila extends Animal {

	public Gurila(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public Gurila(){}
	
	@Override
	public String emitirSom() {
		return "Emitindo som do Gurila";

	}

	@Override
	public String mover() {
		return "Gurila correndo";

	}
	
	public String correr() {
		return mover();
	}

}
