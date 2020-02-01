package aula09.as7b.exercicio03;

public class Cliente {
	private String nome;
	private String telefone;
	private String cpf;
	
	public Cliente(String nome, String telefone, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	public String toString() {
		StringBuffer cs = new StringBuffer();
		cs.append("\nCliente: " + this.getNome() +
				" | Telefone: " + this.getTelefone() +
				" | Cpf: " + this.getCpf());
		
		return cs.toString();
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
