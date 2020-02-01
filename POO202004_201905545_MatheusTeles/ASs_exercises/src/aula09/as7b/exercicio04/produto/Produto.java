package aula09.as7b.exercicio04.produto;

public class Produto {
	private String nome;
	private String codigo;
	private String tipo;

	public Produto(String nome, String codigo) {
		this.setNome(nome);
		this.setCodigo(codigo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
