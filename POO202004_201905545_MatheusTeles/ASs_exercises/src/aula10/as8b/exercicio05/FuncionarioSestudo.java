package aula10.as8b.exercicio05;

public class FuncionarioSestudo extends Funcionario{
	
	public FuncionarioSestudo(String nome, String codigo) {
		super(nome, codigo);
				
	}
	
	public double rendaTotal() {
		return rendaBase;
	}

	@Override
	public String toString() {
		StringBuffer sc = new StringBuffer();
		sc.append("\nFuncionário: " + this.getNome() +
				"\nSalário: " + this.rendaTotal() + " | Comissão: 0");
		return sc.toString();
	}


	
		
}
