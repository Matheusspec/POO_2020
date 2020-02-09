package aula13.as11.exercicio04;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import aula03.as3b.exercicio02.Contato;

public class LerAgendaBinario {
	public static void main(String[] args) throws IOException {
		String nome;
		int idade;
		float altura;
		 
		FileInputStream arq = new FileInputStream("agendaBinario.dat");
		DataInputStream lerAg = new DataInputStream(arq);
		
		nome = lerAg.readUTF();
		idade = lerAg.readInt();
		altura = lerAg.readFloat();
		
		arq.close();
		
		Contato c = new Contato(nome,idade,altura);
		
		System.out.println(c.toString());
	}
}
