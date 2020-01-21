package aula02.as2b.exercicio01;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int maisVelha = 0;
	int maisNova = 0;
	String pessoaV = null,pessoaN = null;
	Pessoa[] p = new Pessoa[3];
	
	for(int i = 0 ; i < 3; i++) {
		p[i] = new Pessoa();
		maisVelha = p[0].idade;
		maisNova = p[0].idade;
		System.out.println("Nome da pessoa " + (i + 1));
		p[i].nome = sc.nextLine();
		
		System.out.println("Idade da pessoa " + (i + 1));
		p[i].idade = sc.nextInt();
		
		if(p[i].idade > maisVelha) {
			maisVelha = p[i].idade;
			pessoaV = p[i].nome;
			}
		if(p[i].idade < maisNova) {
			maisNova = p[i].idade;
			pessoaN = p[i].nome;			
			}
		sc.nextLine();
		}
		System.out.println("\nPessoa mais nova : " + pessoaN + "\nIdade: " + maisNova);
		
		System.out.println("Pessoa mais velha : " + pessoaV + "\nIdade: " + maisVelha);
	}
	
}
