package aula04.salaaula.heranca;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String razaoSocial;
	
	public PessoaJuridica(String nome,String end, String tel, String razaoSocial, String cnpj) {
				 super(nome,end,tel);
				 this.cnpj = cnpj;
				 this.razaoSocial = razaoSocial;
			 }

	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nCnpj da pessoa júridica: " + this.getCnpj());
		sb.append("\nRazão Social:  " + this.getRazaoSocial());
		
		return sb.toString();
	}

}
