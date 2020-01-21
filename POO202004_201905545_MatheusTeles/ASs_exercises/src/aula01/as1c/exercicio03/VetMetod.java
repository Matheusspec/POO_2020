package aula01.as1c.exercicio03;

import java.util.Scanner;

public class VetMetod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vet a = new Vet();
		int tam;
		
		
		System.out.println("Informe o tamanho do vetor :");
		tam = sc.nextInt();
		
		int[] abc = new int [tam];
		for(int i = 0 ; i < tam ;i++) {
			abc[i] = sc.nextInt();
		}
		a.buble(abc, false);
		for(int i = 0; i < tam ;i++)
			System.out.print(abc[i] + " ");
		
		System.out.print("\n");
		
		a.buble(abc, true);
		for(int i = 0; i < tam; i++)
			System.out.print(abc[i] + " ");
		
		System.out.print("\n" + "Insira um número para saber se está no vetor :");
			int value = sc.nextInt();
			int pos = 0;
			int i = 0;
			abc[tam-1] = value;
			
			while(value!=abc[i])
		        i++;
		      
		        if(tam-1 == i)
		        	System.out.println("O valor não existe no vetor ");
		        else
		        	System.out.print("O valor existe e está na posição " + (i+1) + " do vetor");
		            
			
		
	}		
}
