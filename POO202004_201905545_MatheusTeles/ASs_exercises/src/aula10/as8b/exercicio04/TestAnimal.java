package aula10.as8b.exercicio04;

public class TestAnimal {
	public static void main(String[] args) {

		Animal cavalo = new Cavalo("Safira", 12);

		Animal preguica = new Preguica("Pp", 10);

		Animal cachorroSelvagem = new Cachorro("Malu", 8);

		Animal zebra = new Zebra("Jiu", 12);

		Animal gurila = new Gurila("Mal", 8);

		Animal periquito = new Ave("Loro", 6);

		Animal leao = new Leao("Lio", 12);

		Animal tigre = new Tigre("Mina", 5);

		Animal cobra = new Cobra("Juditi", 2);

		Animal macaco = new Macaco("Jojo", 3);

		Zoologico zoo = new Zoologico();

		zoo.jaula[0] = cavalo;
		zoo.jaula[1] = cachorroSelvagem;
		zoo.jaula[2] = zebra;
		zoo.jaula[3] = gurila;
		zoo.jaula[4] = periquito;
		zoo.jaula[5] = leao;
		zoo.jaula[6] = tigre;
		zoo.jaula[7] = cobra;
		zoo.jaula[8] = macaco;
		zoo.jaula[9] = preguica;

		System.out.println("\nZoológico:\n");
		for (int i = 0; i < 10; i++) {
			System.out.println("Passando pela jaula " + (i + 1));
			if (zoo.jaula[i] instanceof Animal) {
				((Animal) zoo.jaula[i]).emitirSom();
				((Animal) zoo.jaula[i]).correr();
			}
		}
	}

}
