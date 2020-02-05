package aula11.salaaula.singleton;

public class Conta {
	Banco banco;
	int codigo;
	String nome;

	Conta(int codigo, String nome) {
		banco = Banco.getInstancia();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public  String toString() {
		return "Codigo " + codigo + this.banco.toString();
	}
}
