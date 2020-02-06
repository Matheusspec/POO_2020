package aula13.salaaula.excecao;

public class TestaCalculadora {
	public static void main(String[] args) {
		Calculadora app = new Calculadora();
		int a = 12;
		int b = 0;

		try {
			int c = app.multiplica(a, b);
			System.out.println("Resultado da * de " + a + " por " + b + " = " + c);
		
		}catch(MinhaExcecao e ) {
			System.out.println(e.getMessage());
		}
		
		int[] vet = {1,2,3,4,43,4};
		
		System.out.println("Soma do vetor: " + app.somar(vet));
	}
}
