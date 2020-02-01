package aula09.as7b.exercicio04.editora;

public class Livro {
	private String titulo;
	private String genero;
	private int anoLancamento;
	private String autor;

	public Livro(String titulo, String genero, int anoLancamento,String autor) {
		this.titulo = titulo;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
