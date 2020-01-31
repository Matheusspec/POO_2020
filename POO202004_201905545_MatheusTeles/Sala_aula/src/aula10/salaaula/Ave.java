package aula10.salaaula;

public class Ave extends Animal {

	public Ave(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public void mover(int x, int y) {
		setCoordenadas(x,y);
		System.out.println("movimento da Ave " + this.getNome());
	}
	

}
