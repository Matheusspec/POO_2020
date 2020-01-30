package aula09.salaaula;

public abstract class Conta {

	protected int numero;

	protected double saldo;

	private Cliente cliente;

	public void sacarValor(double valor) {
		this.saldo = saldo - valor;
	}

	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}

	public void transferiValor(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.sacarValor(valor);
			destino.depositar(valor);			
		}else {
			System.out.println("erro");
		}
	}

	public void operation5() {

	}

	public abstract boolean validaConta();

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
