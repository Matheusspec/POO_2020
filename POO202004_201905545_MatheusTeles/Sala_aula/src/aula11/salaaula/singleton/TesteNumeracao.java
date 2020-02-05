package aula11.salaaula.singleton;

public class TesteNumeracao {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Numeracao num = new Numeracao();
			System.out.println(num);
		}
	}
}
