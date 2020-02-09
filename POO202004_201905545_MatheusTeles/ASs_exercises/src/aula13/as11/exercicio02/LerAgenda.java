package aula13.as11.exercicio02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import aula03.as3b.exercicio02.Contato;
import aula13.as11.exercicio01.Agenda;

public class LerAgenda { 

	public static void main(String[] args) {
		System.out.printf("\nContatos da Agenda: \n");
		String[] vet = new String[3];
		try {
			FileReader arq = new FileReader("agenda.txt");
			BufferedReader lerArq = new BufferedReader(arq);

			
			String linha = lerArq.readLine();
			vet[0] = linha;
			System.out.printf("Nome %s\n", linha);
			linha = lerArq.readLine();
			vet[1] = linha;
			System.out.printf("Idade %s\n", linha);
			linha = lerArq.readLine();
			vet[2] = linha;
			System.out.printf("Altura %s\n", linha);
			arq.close();
		} catch (IOException e) {
			System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		
		String nome = vet[0];
		int idade = Integer.parseInt(vet[1]);
	
		double altura = Float.parseFloat(vet[2]);
	
		
		Contato n = new Contato(nome,idade,(float)altura);
		
		Agenda ag = new Agenda();
		
		ag.adicionaContato(n);
		System.out.println("\nIprimindo a agenda novamente, intanciada");
		System.out.println(ag.imprimeAgenda(n));
		
	}

}
