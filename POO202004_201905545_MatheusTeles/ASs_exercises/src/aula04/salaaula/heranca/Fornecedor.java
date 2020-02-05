package aula04.salaaula.heranca;

public class Fornecedor extends PessoaJuridica{
	private String produtos;
	
	
	public Fornecedor(String nome,String end, String tel, String razaoSocial, String cnpj, String produtos) {
		 super(nome,end,tel,razaoSocial,cnpj);
		 this.produtos = produtos;
		 
	 }
	
	public String getProdutos() {
		return produtos;
	}
	
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nProdutos: " + this.getProdutos());
		
		return sb.toString();
	}
	
}
