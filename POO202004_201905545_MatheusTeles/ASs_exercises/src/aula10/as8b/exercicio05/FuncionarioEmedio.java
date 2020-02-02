package aula10.as8b.exercicio05;

public class FuncionarioEmedio extends Funcionario implements Const  {
	
	private String escola;
	

	public FuncionarioEmedio(String nome, String codigo) {
		super(nome, codigo);
		// TODO Auto-generated constructor stub
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	
	public double rendaTotal() {
		//EX09
		return Fm + Supervisor;
	}

	@Override
	public String toString() {
		StringBuffer sc = new StringBuffer();
		sc.append("\nFuncionário: " + this.getNome() +
				"\nSalário: " + this.rendaTotal() + " | Comissão: " + Supervisor);
		return sc.toString();
	}

}
