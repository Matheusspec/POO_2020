package aula10.as8b.exercicio03;

// Exercicio 3 
public class Veteninario {	
	
	public void examinar(Animal animal) {
		System.out.println("Examinando " + animal.getClass().getSimpleName());
		
		animal.emitirSom();
	}
	
	
}
