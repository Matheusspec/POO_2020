package aula09.as7b.exercicio01_2;

public class Empregado implements Modelo{
	
	private String codigo;
	private String nome;
	private int idade;
	
	public Empregado(String codigo, String nome, int idade) {

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

	//1.5
	public void imprimir() {
		System.out.println(toString());
	}
	
	//1.5
	public String toString() {
		StringBuffer sc = new StringBuffer();
 		sc.append("\nRespons�vel: ");
 		sc.append("\nNome: " + this.getNome());
 		sc.append("\nC�digo: " + this.getCodigo());
 		sc.append("\nIdade: " + this.getIdade());
 		return sc.toString();
	}

}
