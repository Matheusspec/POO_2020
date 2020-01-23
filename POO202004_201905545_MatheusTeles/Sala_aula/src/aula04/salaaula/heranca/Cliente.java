package aula04.salaaula.heranca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente extends PessoaFisica{
	private double renda;
	private List<String> interesses;
	private String profissao;
	
	public Cliente(String nome,String end, String tel, 
			 String cpf, String est, String sexo, int matricula, double salario, String cargo, double renda, String profissao) {
				 super(nome,end,tel,cpf,est,sexo);
				 this.renda = renda;
				 this.profissao = profissao;
				 interesses = new ArrayList<String>();
			 }
	
	

	public double getRenda() {
		return renda;
	}
	
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nRenda do Cliente: " + this.getRenda());
		sb.append("\nProfissão do cliente: " + this.getProfissao());
		
		return sb.toString();
	}

	public List<String> getInteresses() {
		return interesses;
	}

	public void setInteresses(List<String> interesses) {
		this.interesses = interesses;
	}
	
	public void adicionaInteresses(String interesse) {
		this.getInteresses().add(interesse);
	}
	
	public String consultaInteresse(String interesse) {
		String novoTnteresse = null;
		for(String s : this.getInteresses()) {
			if(s.equals(interesse)) {
				novoTnteresse = s;				
			}
		}
		return novoTnteresse;
		
	}
	
	public void removeInteresse(String interesse) {
		Iterator<String> iterator = interesses.iterator();
		
		int quantidadeInteresses = interesses.size();
		while(iterator.hasNext()) {
			String interesseRemover = iterator.next();
			if(interesseRemover.equals(interesse)) {
				iterator.remove();
			}
		}
		int novaQuantidade = interesses.size();
		
		if(novaQuantidade < quantidadeInteresses)
			System.out.println("O interesse " + interesse + "foi removido com sucesso!" );
			
		else
			System.out.println("Nenhum interesse encontrado ");
	}
}
