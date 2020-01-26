package aula04.as4b.exercicio03;

public class Gerente extends Funcionario{
	private double bonificacao;
	private String tipo;
	
	@Override
	public double receb(double salario) {
		double atual = (salario + this.bonificacao) * 12;
		return atual;
	}
	
	public double getSalario1() {
		return (this.salario + this.bonificacao);
	}
	
	public double getBonificacao() {
		return bonificacao;
	}
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
