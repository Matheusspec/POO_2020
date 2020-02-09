package aula10.as8b.exercicio05;

public class Funcionario {
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
	
	public Funcionario() {}

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
	public double rendaTotal() {
		return 0;
	};
	
	public  String toString() {
		return null;
	};
	
	public double getgerente()
	{
		return this.Gerente;
	}
	
	public double getvendedor()
	{
		return this.Vendedor;
	}
	
	public double getsupervisor()
	{
		return this.Supervisor;
	}
	
}
