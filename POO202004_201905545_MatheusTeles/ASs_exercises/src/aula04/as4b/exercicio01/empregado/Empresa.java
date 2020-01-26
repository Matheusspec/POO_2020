package aula04.as4b.exercicio01.empregado;

public class Empresa {
	private String cpnj;
	private String razaoSocial;
	private Endereco endereco;
	
	public String getCpnj() {
		return cpnj;
	}
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public Empresa(String cpnj, String razaoSocial, Endereco endereco) {
		this.cpnj = cpnj;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
