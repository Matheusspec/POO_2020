package aula10.as8b.exercicio05;

public abstract class Funcionario {
	private String nome;
	private String codigo;
	// EX 08
	protected double Gerente = 1500;
	protected double Supervisor = 600;
	protected double Vendedor = 250;
	// EX 06
	protected double rendaBase = 1000;
	
	public Funcionario(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
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
	// EX 06
	public abstract double rendaTotal();
	
	public abstract String toString();
	
	
}
