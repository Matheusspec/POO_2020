package aula10.as8b.exercicio04;

public class Cobra extends Animal {

	public Cobra(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	} 
	
	public Cobra(){}

	@Override
	public String emitirSom() {
		return "Emitindo som da cobra";
 
	}

	@Override
	public String mover() {
		return "Cobra rastejando!";

	}

}
