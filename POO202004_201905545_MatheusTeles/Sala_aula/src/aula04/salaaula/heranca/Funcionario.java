package aula04.salaaula.heranca;

public class Funcionario {
	private int matricula;
	private double salario;
	private String cargo;
	
	public Funcionario(String nome,String end, String tel, 
			 String cpf, String est, String sexo,int matricula, double salario, String cargo) {
				 super(nome,end,tel,cpf,est,sexo);
				 this.matricula = matricula;
				 this.salario = salario;
				 this.cargo = cargo;
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
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nCpf da Pessoa Física: " + this.getMatricula());
		sb.append("\nEstado Civil da Pessoa Física: " + this.getSalario());
		sb.append("\nSexo da Pe da Pessoa Física: " + this.getCargo());
		
		return sb.toString();
	}
}
