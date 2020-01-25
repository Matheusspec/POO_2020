package aula03.as3b.exercicio04;

import java.util.Scanner;

import aula03.as3b.exercicio03.Elevador;

public class Televisao {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Controle control = new Controle(1,1);
			control.consultar();
			System.out.println("\nControle:");
			System.out.println("(1) Trocar de canal +\n(2) Trocar de canal -\n(3) Aumentar volume\n(4) Diminuir volume\n(5) Escolher canal\n(6) Desligar Tv");
			int option = sc.nextInt();
				
			do {
				if(option == 6)
					break;
				switch(option) {
				case 1:
					control.trocarCanalM();
					control.consultar();
					System.out.println("\n(0)- Mostrar Controle");
					break;
				case 2:
					control.trocarCanalN();		
					control.consultar();
					System.out.println("\n(0)- Mostrar Controle");
					break;
				case 3 :
					control.aumentarVolume();
					control.consultar();
					System.out.println("\n(0)- Mostrar Controle");
					break;
				case 4:
					control.diminuirVolume();
					control.consultar();
					System.out.println("\n(0)- Mostrar Controle");
					break;	
				case 5: 
					System.out.println("\nDigite o número do canal");
					int canal = sc.nextInt();
					control.irCanal(canal);					
					control.consultar();
					System.out.println("\n(0)- Mostrar Controle");
					break;
				case 0:
					System.out.println("\n(1) Trocar de canal +\n(2) Trocar de canal -\n(3) Aumentar volume\n(4) Diminuir volume\n(5) Escolher canal\n(6) Desligar Tv1\n");
					break;
				}
				
				option = sc.nextInt();
			}while(option !=6);
			System.out.println("\n--Tv off--\n");
	}	
}
