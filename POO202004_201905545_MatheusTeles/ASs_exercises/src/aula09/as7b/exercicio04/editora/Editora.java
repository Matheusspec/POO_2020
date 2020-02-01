package aula09.as7b.exercicio04.editora;

public class Editora {
	private String razaoSocial;
	private String endereco;
	private String cnpj;
	private Livro livro;

	public Editora(String razaoSocial, String endereco, String cnpj, Livro livro) {
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.livro = livro;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String toString() {
		StringBuffer sc = new StringBuffer();
		sc.append("Publicação do Livro: " + this.getLivro().getTitulo() + " | Autor :" + this.getLivro().getAutor());
		sc.append("Gênero: " + this.getLivro().getGenero());
		sc.append("Ano de Lançamento: " + this.getLivro().getAnoLancamento());
		return sc.toString();
		
	}

	public void PublicarLivro() {
		System.out.println(toString());
	}
	

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
