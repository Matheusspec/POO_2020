package aula10.salaaula;

public class Amfibio extends Animal {

	public Amfibio(String nome) {
		super(nome);
		
	}
	
	public void mover(int x, int y) {
		setCoordenadas(x,y);
		System.out.println("movimento do anfíbio " + this.getNome());
	}
	
	
}	
