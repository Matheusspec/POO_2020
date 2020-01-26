package aula04.as4b.exercicio03;

public class Funcionario {
	private String nome;
	private String telefone;
	private int matricula;
	protected double salario;
	private String horario;
	
	public void aumento(double b) {
	    double s = this.getSalario();	
		s += ((b/100) * s);
		setSalario(s);
	}
	
	public double receb(double salario) {
		double atual = salario * 12;
		return atual;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
