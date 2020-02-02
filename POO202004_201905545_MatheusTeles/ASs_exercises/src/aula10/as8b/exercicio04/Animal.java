package aula10.as8b.exercicio04;

public abstract class Animal {
	private String nome;
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	private int idade;
	
	public abstract void emitirSom();
	
	public abstract void mover();
	
	public void correr() {}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}		
