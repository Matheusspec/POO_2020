package aula13.as11.exercicio01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import aula03.as3b.exercicio02.Contato;

public class GravaAgenda {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int i = 0;

		Agenda c = new Agenda();

		FileWriter agenda = new FileWriter("agenda.txt");
		PrintWriter gravarAg = new PrintWriter(agenda);

		Contato cont = new Contato();

		cont = new Contato();
		System.out.println("Nome do contato " + (i + 1) + ":");
		cont.setNome(sc.nextLine());

		System.out.println("Idade do  contato:");
		cont.setIdade(sc.nextInt());

		System.out.println("Altura do contato:");
		cont.setAltura(sc.nextFloat());

		System.out.println("Imprimindo Agenda...");
		System.out.println("Agenda gravada com sucesso! Obrigado");

		gravarAg.print(c.imprimeAgenda(cont));

		gravarAg.close();
	}
}
