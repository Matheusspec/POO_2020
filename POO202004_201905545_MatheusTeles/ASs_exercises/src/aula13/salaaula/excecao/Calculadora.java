package aula13.salaaula.excecao;

public class Calculadora {

	public int dividir(int a, int b) throws ArithmeticException {

		return a / b;

		/*
		 * int result = 0; try { result = a/b; } catch(ArithmeticException e) {
		 * System.out.println("O segundo número deve ser diferente de zero!"); } return
		 * result;
		 */
	}

	public int somar(int[] numeros) {
		int tamanho = numeros.length;
		int soma = 0;

		for (int i = 0; i < tamanho; i++) {
			soma += numeros[i];
		}

		return soma;
	}

	public int multiplica(int a, int b) throws MinhaExcecao {
		int result = 0;
		if (a == 0 || b == 0)
			throw new MinhaExcecao("Esta operação não aceita zeros");
		else
			result = a * b;
		
		return result;
	}

}
