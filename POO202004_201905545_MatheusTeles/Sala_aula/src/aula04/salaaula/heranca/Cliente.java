package aula04.salaaula.heranca;

public class Cliente {
	private double renda;
	private String interesses;
	private String profissao;
	
	public double getRenda() {
		return renda;
	}
	
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public String getInteresses() {
		return interesses;
	}
	
	public void setInteresses(String interesses) {
		this.interesses = interesses;
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
		sb.append("\nCpf da Pessoa Física: " + this.getRenda());
		sb.append("\nEstado Civil da Pessoa Física: " + this.getInteresses());
		sb.append("\nSexo da Pe da Pessoa Física: " + this.getProfissao());
		
		return sb.toString();
	}
}
