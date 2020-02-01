package aula09.as7b.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Galeria {

	private List<Obra> obras = new ArrayList<Obra>();

	public void setObras(Obra obra) {
		obras.add(obra);
	}
	
	public List<Obra> getObras(){
		return obras;
	}
	public void imprimiObra(List<Obra> obra) {
		System.out.println(obra.toString());
	}
	


}
