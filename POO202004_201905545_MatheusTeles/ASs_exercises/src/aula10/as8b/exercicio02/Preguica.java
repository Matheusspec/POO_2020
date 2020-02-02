package aula10.as8b.exercicio02;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som da preguiça\n");

	}

	@Override
	public void mover() {
		System.out.println("Preguiça subindo!\n");

	}

}
