package aula04.as4b.exercicio01.musica;

public class Compositor {
	private String nome;
	private String nacionalidade;
	
	
	public String getNome() {
		return nome;
	}
	
	public Compositor(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
}
