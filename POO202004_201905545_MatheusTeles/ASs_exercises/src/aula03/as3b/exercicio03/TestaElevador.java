package aula03.as3b.exercicio03;

import java.util.Scanner;

public class TestaElevador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Elevador elevador = new Elevador(15,20);
		
		int pessoas = 0;
		elevador.inicia(20, 15);
		

		System.out.println("\nSelecione uma opção:");
		System.out.println("(1) Entrou pessoas\n(2) Saiu pessoas\n(3) Subiu\n(4) Desceu");
		int option = sc.nextInt();
		
		do {
			switch(option) {
			case 1:
				System.out.println("Quantas pessoas?");
				pessoas = sc.nextInt();
				elevador.entra(pessoas);
				elevador.status();
				System.out.println("\n(1)(2)(3)(4)(5)\n(0)-Para descrição");
				break;
			case 2:
				System.out.println("Quantas pessoas?");
				pessoas = sc.nextInt();
				elevador.sai(pessoas);
				elevador.status();
				System.out.println("\n(1)(2)(3)(4)(5)\n(0)-Para descrição");
				break;
			case 3 :
				elevador.sobe();
				elevador.status();
				System.out.println("\n(1)(2)(3)(4)(5)\n(0)-Para descrição");
				break;
			case 4:
				elevador.desce();
				elevador.status();
				System.out.println("\n(1)(2)(3)(4)(5)\n(0)-Para descrição");
				break;	
			case 0: 
				System.out.println("\nSelecione uma opção:");
				System.out.println("(1) Entrou pessoas\n(2) Saiu pessoas\n(3) Subiu\n(4) Desceu\n(5) Encerrar");
				break;

			}

			option = sc.nextInt();
		}while(option !=5);
		System.out.println("\n------Elevador Desligado------\n");
	}
}
