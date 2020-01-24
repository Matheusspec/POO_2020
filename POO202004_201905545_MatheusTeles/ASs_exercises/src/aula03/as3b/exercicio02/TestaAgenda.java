package aula03.as3b.exercicio02;

import java.util.Scanner;

public class TestaAgenda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		Agenda c = new Agenda();
		
		Contato[] cont = new Contato[11];
		
		for(i = 1; i < 11; i++) {
			cont[i] = new Contato();
			System.out.println("Nome do contato " + (i) + ":");
			cont[i].setNome(sc.nextLine());
			
			System.out.println("Idade do  contato:");
			cont[i].setIdade(sc.nextInt());
			
			System.out.println("Altura do contato:");
			cont[i].setAltura(sc.nextFloat());
			
			cont[i].setPosicao(i);
			
			c.adicionaContato(cont[i]);
			sc.nextLine();
		}
		
		System.out.println("\nOpções:\n(1)Imprimir Agenda\n"
				+ "(2)Consultar informações da Pessoa\n(3)Quero saber a posição do contato\n(4)Remover pessoa\n(5)Sair");
				int option = sc.nextInt();
				
		do {
			
		
			switch(option) {
			
			case 1:	c.imprimeAgenda(c.getListaContatos());
			break;
			
			case 2: System.out.println("Qual a posição do contato que deseja consultar?");
			int posicao = sc.nextInt();
			if(posicao >=i || posicao <= 0)
				System.out.println("\nNão existe essa posição");
			else
				c.imprimeContato(cont[posicao].getPosicao());
			break;
			
			case 3: System.out.println("Qual o nome que deseja consultar?");
			String nome = sc.nextLine();
			int pos = c.buscaContato(nome);
			if(pos != 0)
			System.out.println("\nA posição de " + nome + " é: " + pos);
			else
				System.out.println("\nO nome consultado não está na lista");
			break;
			
			case 4: System.out.println("Digite o nome do contato que deseja remover:"); 
				c.removeContato(sc.nextLine());
			break;
			case 5: break;
			}
			System.out.println("\nOpções:\n(1)Imprimir Agenda\n"
					+ "(2)Consultar informações da Pessoa\n(3)Quero saber a posição do contato\n(4)Remover pessoa\n(5)Sair");
					option = sc.nextInt();
					sc.nextLine();
		
		}while(option!=5);	
	}
}

