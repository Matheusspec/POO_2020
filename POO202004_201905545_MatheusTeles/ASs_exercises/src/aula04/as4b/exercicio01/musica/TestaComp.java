package aula04.as4b.exercicio01.musica;

import java.util.ArrayList;
import java.util.List;

public class TestaComp {

	public static void main(String[] args) {
		
		List<Musica> musicas = new ArrayList<Musica>();
		
		Compositor c1 = new Compositor("Ed. Sheeran","americano");
		Musica ms1 = new Musica("Photograph",2017,"Pop",c1);
		
		Compositor c2 = new Compositor("Lucas Graham","americano");
		Musica ms2 = new Musica("Love Someone",2018,"Pop",c2);

		Compositor c3 = new Compositor("Imagine Dragons","americano");
		Musica ms3 = new Musica("Birds",2019,"Pop",c3);

		musicas.add(ms1);
		musicas.add(ms2);
		musicas.add(ms3);
		System.out.println(musicas.toString() );

	}

}
