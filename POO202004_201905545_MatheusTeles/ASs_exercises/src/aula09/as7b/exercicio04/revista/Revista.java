package aula09.as7b.exercicio04.revista;

public class Revista {
	private String Titulo;
	private int ano;
	private int numero;
	
	public Revista(String titulo, int ano, int numero) {
		Titulo = titulo;
		this.ano = ano;
		this.numero = numero;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
