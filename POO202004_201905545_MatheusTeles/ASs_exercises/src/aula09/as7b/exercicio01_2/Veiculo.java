package aula09.as7b.exercicio01_2;

public class Veiculo implements Modelo{

	private int placa1;
	private Empregado responsavel;
	
	public Veiculo(int placa, Empregado responsavel) {
		
		this.responsavel = responsavel;
	}
	
	public Empregado getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Empregado responsavel) {
		this.responsavel = responsavel;
	}
	
	//1.5
	public String toString() {
 		StringBuffer sc = new StringBuffer();
 		sc.append("Projeto: " + Titulo_do_projeto);
 		sc.append("\nPlaca: " + this.getPlaca());
 		sc.append("\nResponsável: " + this.getResponsavel().getNome() + ", " 
 		+ this.getResponsavel().getIdade() + " anos");
 		sc.append(" | Código: " + this.getResponsavel().getCodigo());
 		return sc.toString();
	}
	
	//1.5
	public void imprimir() {
		System.out.println(toString());
	}

	public int getPlaca() {
		return placa1;
	}

	public void setPlaca(int placa) {
		this.placa1 = placa;
	}

}
