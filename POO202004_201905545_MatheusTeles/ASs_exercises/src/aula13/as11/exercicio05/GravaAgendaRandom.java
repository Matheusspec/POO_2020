package aula13.as11.exercicio05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class GravaAgendaRandom {
	public static void main(String args[]) throws FileNotFoundException,IOException{
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;
		float altura;
		long n; 
		
		RandomAccessFile agenda = new RandomAccessFile("agenda.dat","rw");
		
		agenda.seek(agenda.length());
		n = (agenda.length()/48)+1;
		while(true) {
			System.out.printf("Nome do %do.contato ou digite 2 para sair:\n",n);
			nome = ler.nextLine();
			if(nome.equals("2"))
				break;
			
			System.out.printf("\nInforme a idade:");
			idade = ler.nextInt();
			
			System.out.printf("\nInforme a altura:");
			altura = ler.nextFloat();
			
			ler.nextLine();
			
			gravarString(agenda,nome,20);
			agenda.writeInt(idade);
			agenda.writeFloat(altura);
			
			n++;
			
			System.out.println("\n");	
		}
		
		agenda.close();
	}
	
	private static void gravarString(RandomAccessFile arq, String s, int tam) throws IOException {
			StringBuilder result = new StringBuilder(s);
			result.setLength(tam);
			arq.writeChars(result.toString());
	}
}
