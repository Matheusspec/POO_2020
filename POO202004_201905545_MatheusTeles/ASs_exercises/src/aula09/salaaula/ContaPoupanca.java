package aula09.salaaula;

public class ContaPoupanca extends Conta {

	private double juros;

	public boolean validaConta() {
		if(numero > 100000)
			return false;
		else
			return true;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

}
