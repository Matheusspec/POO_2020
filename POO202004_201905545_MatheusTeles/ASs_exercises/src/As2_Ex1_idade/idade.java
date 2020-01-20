package As2_Ex1_idade;

import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int maisVelha = 0;
	int maisNova = 0;
	String pessoaV = null,pessoaN = null;
	pessoa[] p = new pessoa[3];
	
	for(int i = 0 ; i < 3; i++) {
		p[i] = new pessoa();
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
