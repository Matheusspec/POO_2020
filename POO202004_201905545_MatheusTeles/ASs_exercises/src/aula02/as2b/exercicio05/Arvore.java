package aula02.as2b.exercicio05;

import java.util.Scanner;

public class Arvore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa fm = new Pessoa();
		String mb = null;
		int num = 0;
		int i = 0;
		
		System.out.println("Qual o nome da pessoa ?");
		fm.nome = sc.nextLine();
		
		System.out.println("Qual a idade?");
		sc.nextInt();
		
		sc.nextLine();
		System.out.println("Qual o nome do pai ?");
		fm.pai = sc.nextLine();
		
		System.out.println("Qual o nome da mãe ?");
		fm.mae = sc.nextLine();
		
		System.out.println("Qual o nome da avó ?");
		fm.vo = sc.nextLine();
		
		System.out.println("Qual o nome da avô ?");
		fm.vo1 = sc.nextLine();
		
		System.out.println("Tem filhos ?");
		mb = sc.next();
		
		if(mb.equals("sim")) {
			System.out.println("Quantos ?");
			num = sc.nextInt();
			sc.nextLine();
			System.out.println("Quais os nomes ?");
			Pessoa[] s = new Pessoa[num];
			for(i = 0; i < num; i++) {
				s[i] = new Pessoa();
				s[i].filho = sc.nextLine();
			} 			

		System.out.println("Nome : " + fm.nome + ", idade: " + fm.idade);
		System.out.println("Avós : " + fm.vo + ", " + fm.vo1);
		System.out.println("Pais : " + fm.mae + ", " + fm.pai);
		System.out.print("Filhos : ");
			for(i = 0; i < num-1; i++)
				System.out.print(s[i].filho + ", ");
		System.out.print(s[i].filho);
		}
		if(mb.equals("não")){
			System.out.println("Nome : " + fm.nome + ", idade: " + fm.idade);
			System.out.println("Avós : " + fm.vo + ", " + fm.vo1);
			System.out.println("Pais : " + fm.mae + ", " + fm.pai);
			System.out.println("Filhos :" + " não");
		}
			

	}

}
