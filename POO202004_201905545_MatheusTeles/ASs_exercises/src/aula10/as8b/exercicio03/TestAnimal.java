package aula10.as8b.exercicio03;

public class TestAnimal {
	public static void main(String[] args) {

		// Exercicio 2
		Animal cavalo = new Cavalo("Safira", 12);

		Animal cachorro = new Cachorro("Malu", 8);

		Animal preguica = new Preguica("Pp", 10);

		Veteninario vet = new Veteninario();

		vet.examinar(preguica);

		vet.examinar(cachorro);

		vet.examinar(cavalo);

	}

}
