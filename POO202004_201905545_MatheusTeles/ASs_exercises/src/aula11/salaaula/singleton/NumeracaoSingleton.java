package aula11.salaaula.singleton;

public final class NumeracaoSingleton {
	public static NumeracaoSingleton instancia;
	
	private static int cont = 0;
	
	private int numero = 0;
	
	private NumeracaoSingleton() {
		numero = ++cont;
	}
	
	public static NumeracaoSingleton getInstancia() {
		if(instancia == null) {
			instancia = new NumeracaoSingleton();
		}
		return instancia;
	}
	
	public String toString() {
		return "Numeracao " + numero;
	}
}
