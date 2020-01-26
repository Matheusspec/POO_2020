package aula04.as4b.exercicio01.alunos;

import java.util.ArrayList;
import java.util.List;

public class Matricula {

	public static void main(String[] args) {
		
		List<Alunos> alunos = new ArrayList<Alunos>();

		Curso d1 = new Departamento("Departamento de informatica","INF");
		Curso c1 = new Curso("Engenharia de Software","ES",(Departamento) d1);
		Alunos a1 = new Alunos("Matheus",201905545,2020,c1);
		
		Curso d2 = new Departamento("Departamento de informatica","INF");
		Curso c2 = new Curso("Ciência da Computação","CC",(Departamento) d2);
		Alunos a2 = new Alunos("Lucas",2019335,2020,c2);
		
		Curso d3 = new Departamento("Instituto de Matematica e Estatistica","IME");
		Curso c3 = new Curso("Matemática","MA",(Departamento) d3);
		Alunos a3 = new Alunos("Jorge",201904332,2020,c3);
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		
		System.out.println(alunos.toString());
	}

}
