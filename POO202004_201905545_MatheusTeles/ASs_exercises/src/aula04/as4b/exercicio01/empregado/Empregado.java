package aula04.as4b.exercicio01.empregado;

public class Empregado {
	private String nome;
	private int matricula;
	private Empresa empresa;
	
	public Empregado(String nome, int matricula, Empresa empresa) {
		this.nome = nome;
		this.matricula = matricula;
		this.empresa = empresa;
	}
	
	public String toString() {
		StringBuffer sp = new StringBuffer();
		sp.append("\nEmpregado: " + this.getNome());
		sp.append("\nMatricula: " + this.getMatricula());
		sp.append("\nEmpresa :" + this.getEmpresa().getRazaoSocial() + " | CNPJ: " + this.getEmpresa().getCpnj());
		sp.append("\nEndereço: " + this.getEmpresa().getEndereco().getRua() + " Número: " + this.getEmpresa().getEndereco().getNumero() + " ," + this.getEmpresa().getEndereco().getComplemento() + " ,cep: "
				+ this.getEmpresa().getEndereco().getCep() + " ," + this.getEmpresa().getEndereco().getBairro() + " ," + this.getEmpresa().getEndereco().getCidade() + " " + this.getEmpresa().getEndereco().getEstado() + "\n\n");
		return sp.toString();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
