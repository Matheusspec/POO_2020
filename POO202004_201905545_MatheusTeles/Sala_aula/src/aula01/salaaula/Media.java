package aula01.salaaula;
	import java.util.Scanner;
	import java.text.DecimalFormat;
public class Media {
		public static void main(String[] args) {
			Aluno a1 = new Aluno();
			
			a1.nome = "Luísa";
			
			a1.nota_1 = 7;
			
			a1.nota_2 = 9;
			
			a1.nota_3 = 8.5;
			
			double media1 = (a1.nota_1 + a1.nota_2 + a1.nota_3)/3;
			 
			
			Aluno a2 = new Aluno();
			
			a2.nome = "Tulio";
			a2.nota_1 = 5.7;
			
			a2.nota_2 = 6.4;
			
			a2.nota_3 = 7.2;
		
			double media2 = (a2.nota_1 + a2.nota_2 + a2.nota_3)/3;
			
			
			Aluno a3 = new Aluno();
			
			a3.nome = "Marcos";
			
			a3.nota_1 = 6.9;
			
			a3.nota_2 = 7.7;
			
			a3.nota_3 = 9.0;
			
			double media3 = (a3.nota_1 + a3.nota_2 + a3.nota_3)/3;
			
			
			Aluno a4 = new Aluno();
			
			a4.nome = "Anna";
			
			a4.nota_1 = 8.5;
			
			a4.nota_2 = 9.2;
			
			a4.nota_3 = 10;
			
			double media4 = (a4.nota_1 + a4.nota_2 + a4.nota_3)/3;
			
			
			double mediaG = (media1 + media2 + media3 + media4)/4;
			
			DecimalFormat df = new DecimalFormat("#,###.00");
			
			System.out.println("A média de " + a1.nome + " foi de " + df.format(media1) + "\n" + "A média de " + a2.nome + " foi de " + df.format(media2) + "\n" + 
			"A média de " + a3.nome + " foi de " + df.format(media3) + "\n" + "A média de " + a4.nome + " foi de " + df.format(media4) + "\n\n" + "A média geral foi de " + 
			df.format(mediaG));
			}
}
