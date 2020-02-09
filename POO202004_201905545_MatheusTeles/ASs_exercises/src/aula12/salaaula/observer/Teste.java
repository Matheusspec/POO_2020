package aula12.salaaula.observer;

public class Teste {

	public static void main(String[] args) {
		BalancaDieta balanca = new BalancaDieta();
		Dieta dieta = new Dieta();
		dieta.registerObserver(balanca);
		dieta.setPeso(150.0); 
		
		balanca.update(150);
	}
}
