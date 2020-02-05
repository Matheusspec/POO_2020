package aula09.salaaula;

public class CadastraConta {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();

		cc1.depositar(1000.00);
		cp1.depositar(1000.00);

		cp1.transferiValor(5000.00, cc1);
	}

}
