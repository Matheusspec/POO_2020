package aula10.as8b.exercicio03;

public abstract class Animal {
	private String nome;
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Animal() {}
	private int idade;
	
	public abstract String emitirSom();
	
	public abstract String mover();
	
	public String correr() {
		return null;}
	
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
