package aula04.as4b.exercicio03;

public class Cliente extends Funcionario{
	private int idade;
	private String cpf;
	private String status;
	
	public void desativa(String status) {
		if(status.equals("A"))
			setStatus("I");
		else
			System.out.println("O cliente já está desativado");
	}
	
	public String toString() {
		StringBuffer ss = new StringBuffer();
		ss.append(this.getNome() + " - Tel: " + this.getTelefone() + 
		" - idade: " + this.getIdade() + " anos - cpf: " + this.getCpf() + " - " + this.getStatus());
		return ss.toString();
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
