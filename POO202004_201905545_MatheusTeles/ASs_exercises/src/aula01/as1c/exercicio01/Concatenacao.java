package aula01.as1c.exercicio01;

import java.util.Scanner;

public class Concatenacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numAlunos;
		int j = 0;
		System.out.println("Insira o número de alunos :");
		numAlunos = sc.nextInt();
	
		int i = numAlunos;  
		
		Aluno aluno[] = new Aluno[numAlunos];
		
		while(i>0) {
			
			aluno[j] = new Aluno();
 
			sc.nextLine();
			System.out.println("Insira o nome do Aluno " + (j + 1));
			aluno[j].nome = sc.nextLine();
			
			System.out.println("Insira a mátricula do Aluno " + (j + 1));
			aluno[j].matricula = sc.nextInt();
			j++;	
			i--;
			System.out.println("\n");
		}
		i = numAlunos;
		j = 0;
		System.out.println("Lista de Alunos :");
		
		while(i>0) {
			System.out.println(aluno[j].matricula + " - " + aluno[j].nome);
			
			j++;	
			i--;
		}
		
	}
}
