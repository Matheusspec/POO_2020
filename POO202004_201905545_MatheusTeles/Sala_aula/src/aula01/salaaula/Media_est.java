	package aula01.salaaula;

import java.text.DecimalFormat;

public class Media_est {
			public static void main(String[] args) {
				String NomeA= "João";
				double nota1A1 = 4.0;
				double nota2A1 = 6.5;
				double nota3A1 = 6.0;
				
				String NomeA2= "Trevor";
				double nota1A2 = 5.3;
				double nota2A2 = 9.1;
				double nota3A2 = 8.7;
			
				String NomeA3= "Joyse";
				double nota1A3 = 7.3;
				double nota2A3 = 9.2;
				double nota3A3 = 8.2;
				
				String NomeA4= "Anna";
				double nota1A4 = 6.3;
				double nota2A4 = 8.1;
				double nota3A4 = 7.7;
				
				double mediaJ = (nota1A1 + nota2A1 + nota3A1)/3;
				double mediaT = (nota1A2 + nota2A2 + nota3A2)/3;
				double mediaJo = (nota1A3 + nota2A3 + nota3A3)/3;
				double mediaA = (nota1A4 + nota2A4 + nota3A4)/3;
				
				double mediaG = (mediaJ + mediaT + mediaJo + mediaA)/4;
				
				DecimalFormat df = new DecimalFormat("#,###.00");
				
				System.out.println("A media de " + NomeA + " foi de " + df.format(mediaJ));
				
				System.out.println("A media de " + NomeA2 + " foi de " + df.format(mediaT));
				
				System.out.println("A media de " + NomeA3 + " foi de " + df.format(mediaJo));
				
				System.out.println("A media de " + NomeA4 + " foi de " + df.format(mediaA) + "\n");
			
				System.out.println("A media geral foi de " + df.format(mediaG));				
			}
}