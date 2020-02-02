package aula10.as8b.exercicio05;

public class FuncionarioSuperior extends Funcionario  implements Const {
	
	private String escola;
	private String universidade;


	public FuncionarioSuperior(String nome, String codigo) {
		super(nome, codigo);
		
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}
	
	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public double rendaTotal() {
		//EX09
		return Fs + Gerente;
	}

	@Override
	public String toString() {
		StringBuffer sc = new StringBuffer();
		sc.append("\nFuncionário: " + this.getNome() +
				"\nSalário: " + this.rendaTotal() + " | Comissão: " + Gerente);
		return sc.toString();
	}
}
