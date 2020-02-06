package aula11.as9b.exercicio03;

public class IncrementalSingleton {
	public static IncrementalSingleton instancia;
	
	private  int count = 0;
	private int numero;

	private IncrementalSingleton() {
		numero = ++count;
	}
	
	public static IncrementalSingleton getInstancia() {
		if(instancia == null)
			instancia = new IncrementalSingleton();
		return instancia;
				
	}
	
	public String toString() {
		return "IncrementalSingleton " + numero;
	}
}
