package aula04.salaaula.heranca;

public class Funcionario extends PessoaFisica {
	private int matricula;
	private double salario;
	private String cargo;
	
	public Funcionario(String nome,String end, String tel, 
			 String cpf, String est, String sexo, int matricula, double salario, String cargo) {
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
		sb.append("\nMatricula do funcionário: " + this.getMatricula());
		sb.append("\nSalário do funcionário : " + this.getSalario());
		sb.append("\nCargo do funcionário : " + this.getCargo());
		
		return sb.toString();
	}
}
