package aula09.salaaula;

public class ContaCorrente extends Conta implements Tributavel {

	private double limite;

	
	public boolean validaConta() {
		if(numero <= 100000)
			return false;
		else
			return true;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public double calculaTributos() {
		return saldo * taxa;
	}

}
