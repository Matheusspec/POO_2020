package aula10.as8b.exercicio02;

public class TestAnimal {
	public static void main(String[] args) {

		Animal cavalo = new Cavalo("Safira", 12);

		Animal cachorro = new Cachorro("Malu", 8);

		Animal preguica = new Preguica("Pp", 10);

		cavalo.emitirSom();
		cachorro.emitirSom();
		preguica.emitirSom();

	}

}
