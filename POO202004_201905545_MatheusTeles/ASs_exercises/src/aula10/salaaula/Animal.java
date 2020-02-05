package aula10.salaaula;

public class Animal {
	private String nome;
	private int coordenadax;
	private int coordenaday;

	public Animal(String nome) {
		this.nome = nome;
		this.coordenadax = coordenadax;
		this.coordenaday = coordenaday;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCoordenadax() {
		return coordenadax;
	}

	public void setCoordenadax(int coordenadax) {
		this.coordenadax = coordenadax;
	}

	public int getCoordenaday() {
		return coordenaday;
	}

	protected void setCoordenadas(int x, int y) {
		coordenaday = y;
		coordenadax = x;
	}
	
	public void mover(int x, int y) {
		System.out.println("Não sei me mover" + this.getNome());
	}

}
