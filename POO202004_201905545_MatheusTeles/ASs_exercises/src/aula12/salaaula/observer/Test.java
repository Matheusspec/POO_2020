package aula12.salaaula.observer;

public class Test {
	public static void main(String args[]) {
		Balanca balanca = new Balanca();
		Dieta dieta = new Dieta();
		dieta.registerObserver(balanca);
		dieta.setPeso(150);
	}

}