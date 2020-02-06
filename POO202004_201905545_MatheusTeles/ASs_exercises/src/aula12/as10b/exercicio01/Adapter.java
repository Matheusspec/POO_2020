package aula12.as10b.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Adapter implements SomadorEsperado {

	SomadorExistente m = new SomadorExistente();
	
	List <Integer> l = new ArrayList<Integer>();
	@Override
	public int somaVetor(int[] vetor) {
		for(int i = 0; i < vetor.length;i++) {
			l.add(vetor[i]);
		}
		int result = m.somaLista(l);
		
		return result;
	}

}
