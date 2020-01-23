package aula04.salaaula.funcionario;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(String n, String c, double s) {
		this.setNome(n);
		this.setCpf(c);
		this.salario = s;
	}
	
	public double calcularBonificacao() {
		return this.salario *= 1.1;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
