package aula13.as11.exercicio06;

import java.io.IOException;
import java.io.RandomAccessFile;
import aula03.as3b.exercicio02.Contato;
import aula13.as11.exercicio03.Agenda;

public class LerAgendaRandom {
	public static void main(String[] args) throws IOException {
		String nome = null;
		int idade = 0;
		float altura = 0;
		
		try { 
			RandomAccessFile agenda = new RandomAccessFile("agenda.dat", "r");
			
			System.out.println("Agenda:");
			
			int i;
			long n = (agenda.length()/48);
			for(i = 1; i<=n;i++) {
				nome = lerString(agenda,20);
				idade = agenda.readInt();
				altura = agenda.readFloat();
				
				System.out.printf("\nContato %d:\nNome: %s\nIdade: %d\nAltura: %.2f\n",i,nome,idade,altura);
			}
			
			agenda.close(); 
			Contato cont = new Contato(nome,idade,altura);
			Agenda ag = new Agenda();
			ag.adicionaContato(cont);
		}catch (Exception e) {
			System.err.printf("Arquivo não encontrado: %s.\n",e.getMessage());
			
		}
	}
	
	private static String lerString(RandomAccessFile arq, int tam) throws IOException{
		char result[] = new char[tam];
		for(int i=0; i < tam;i++) {
			result[i] = arq.readChar();
		}
		return(new String(result).replace('\0',' '));
	}
}
