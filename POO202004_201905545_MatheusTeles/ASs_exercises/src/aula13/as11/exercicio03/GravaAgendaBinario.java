package aula13.as11.exercicio03;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import aula03.as3b.exercicio02.Contato;

public class GravaAgendaBinario {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Agenda c = new Agenda();

		FileOutputStream agenda = new FileOutputStream("agendaBinario.dat");
		DataOutputStream gravarAg = new DataOutputStream(agenda);

		Contato cont = new Contato();

		cont = new Contato();
		System.out.println("Nome do contato :"); 
		cont.setNome(sc.nextLine());

		System.out.println("Idade do  contato:");
		cont.setIdade(sc.nextInt());

		System.out.println("Altura do contato:");
		cont.setAltura(sc.nextFloat());

		gravarAg.writeUTF(cont.getNome());
		gravarAg.writeInt(cont.getIdade());
		gravarAg.writeFloat(cont.getAltura());
		agenda.close();
		System.out.println("Imprimindo Agenda...");
		System.out.println("Agenda gravada com sucesso! Obrigado");

	}
}
