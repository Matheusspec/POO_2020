package aula11.as9b.exercicio03;

public class TestIncremental {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Incremental inc = new Incremental();
			System.out.println(inc);
		}
		System.out.println("\n");
		
		for (int i = 0; i < 5; i++) {
			IncrementalSingleton inc = IncrementalSingleton.getInstancia();
			System.out.println(inc);
		}
	}
}
