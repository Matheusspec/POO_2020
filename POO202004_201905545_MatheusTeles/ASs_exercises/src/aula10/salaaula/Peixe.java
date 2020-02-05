package aula10.salaaula;

public class Peixe extends Animal {

	public Peixe(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public void nada() {
		System.out.println("Sou um " + this.getClass().getSimpleName() + 
				" e estou nadando");
	}

	public void mover(int x, int y) {
		setCoordenadas(x,y);
		System.out.println("movimento do peixe " + this.getNome());
	}
	
}
