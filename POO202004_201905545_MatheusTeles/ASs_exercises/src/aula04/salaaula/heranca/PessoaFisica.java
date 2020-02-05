package aula04.salaaula.heranca;

public class PessoaFisica extends Pessoa {
	 private String cpf;
	 private String estadoCivil;
	 private String sexo;
	 
	 public PessoaFisica(String nome,String end, String tel, 
	 String cpf, String est, String sexo) {
		 super(nome,end,tel);
		 this.cpf = cpf;
		 this.estadoCivil = est;
		 this.sexo = sexo;
	 }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nCpf da Pessoa Física: " + this.getCpf());
		sb.append("\nEstado Civil da Pessoa Física: " + this.getEstadoCivil());
		sb.append("\nSexo da Pe da Pessoa Física: " + this.getSexo());
		
		return sb.toString();
	}
}
