package aula04.as4b.exercicio01.endereco;

public class Cliente {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public Cliente(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String toString() {
		StringBuffer sp = new StringBuffer();
		sp.append("\nCliente: " + this.getNome());
		sp.append("\ncpf: " + this.getCpf());
		sp.append("\nEndereço: " + this.getEndereco().getRua() + " Número: " + this.getEndereco().getNumero() + " ," + this.getEndereco().getComplemento() + " ,cep: "
				+ this.getEndereco().getCep() + " ," + this.getEndereco().getBairro() + " ," + this.getEndereco().getCidade() + " " + this.getEndereco().getEstado() + "\n\n");
		return sp.toString();
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
