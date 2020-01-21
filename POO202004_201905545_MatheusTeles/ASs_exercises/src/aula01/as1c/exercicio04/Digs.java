package aula01.as1c.exercicio04;

import java.util.Scanner;


public class Digs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Verifier Amigo = new Verifier();
		
		
		System.out.println("Nome :");
		Amigo.nome = sc.nextLine();
		System.out.println("Número de Telefone :");
		Amigo.tel = sc.nextLine();
		
		char[] nomeC= Amigo.nome.toCharArray();
		char[] num = Amigo.tel.toCharArray();
				
		boolean resultNome = Amigo.DigitN(nomeC);
		boolean resultTel = Amigo.DigitTel(num);
		
		
		if(resultTel == true && resultNome == true) 
			System.out.println("Nome : ok" + "\n" + "Número : ok");
		
		if(resultTel == false && resultNome == true) 
			System.out.println("Nome : ok" + "\n" + "Número : incorreto");
		
		if(resultTel == true && resultNome == false) 
			System.out.println("Nome : incorreto" + "\n" + "Número : ok");
		
		if(resultTel == false && resultNome == false) 
		    System.out.println("Nome : incorreto" + "\n" + "Número : incorreto");
		
		
		
		
	}
}		
