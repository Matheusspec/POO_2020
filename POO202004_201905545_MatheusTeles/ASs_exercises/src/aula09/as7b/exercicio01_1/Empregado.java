package aula09.as7b.exercicio01_1;

public class Empregado extends Modelo {
	
	private String codigo;
	private String nome;
	private int idade;
	
	public Empregado(String tituloDoProjeto, String codigo, String nome, int idade) {
		super(tituloDoProjeto);
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

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

	@Override
	public void imprimir() {
		System.out.println(toString());
	}

	public String toString() {
		StringBuffer sc = new StringBuffer();
 		sc.append("\nResponsável:\nTiúlo do projeto: " + this.getTitulo());
 		sc.append("\nNome: " + this.getNome());
 		sc.append("\nCódigo: " + this.getCodigo());
 		sc.append("\nIdade: " + this.getIdade());
 		return sc.toString();
	}

}
