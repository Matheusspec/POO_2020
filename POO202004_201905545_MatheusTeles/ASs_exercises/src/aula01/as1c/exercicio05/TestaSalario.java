package aula01.as1c.exercicio05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestaSalario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		int numF;
		int i = 0, indM = 0, indN = 0;
		double somaS = 0, mediaS = 0;
		double maior = 0, menor = 0;
		String nomeM = null, nomeN = null;
		
		System.out.println("Insira a quantidade de funcion�rios :");
		numF = sc.nextInt();
		sc.nextLine();
		double[] sall = new double[numF];
		
		Funcionario Fx[] = new Funcionario[numF];

		for(i = 0 ; i < numF; i++) {
			Fx[i] = new Funcionario();
			
			System.out.println("Informe o nome do funcion�rio " + (i+1) + ":");
			Fx[i].nome = sc.nextLine();
			
			System.out.println("Informe o sal�rio do funcion�rio " + (i+1) + ":");
			Fx[i].salario = sc.nextDouble();
			sc.nextLine();
			sall[i] = Fx[i].salario;
			somaS += Fx[i].salario; 
		}
		maior = Fx[0].maior(sall,numF);
		menor = Fx[0].menor(sall,numF);
		mediaS = somaS/numF;
		
		for(i = 0;i < numF;i++) {
			if(Fx[i].salario == maior) {
				indM = i+1;
				nomeM = Fx[i].nome;
			}
			
			if(Fx[i].salario == menor) {
				indN = i+1;
				nomeN = Fx[i].nome;
			}
			if(Fx[i].salario > mediaS);
		}
		System.out.println("Maior sal�rio :\nfuncion�rio " + indM + "\nnome: " + nomeM + "\nvalor:" + "R$ " +df.format(maior) + "\n");
		
		System.out.println("Menor sal�rio :\nfuncion�rio " + indN + "\nnome: " + nomeN + "\nvalor:" + "R$ " + df.format(menor) + "\n");
	
		System.out.println("M�dia salarial:\n" + df.format(mediaS) + "\n");
		
		System.out.println("Maiores da m�dia:");
		for(i = 0;i < numF;i++) {
			if(Fx[i].salario > mediaS)
				System.out.println(Fx[i].nome + ", R$ " +  df.format(Fx[i].salario));
			
		}
		
		System.out.println("\n");
		
		System.out.println("Menores da m�dia:");
		for(i = 0;i < numF;i++) {
			if(Fx[i].salario < mediaS)
				System.out.println(Fx[i].nome + ", R$ " +  df.format(Fx[i].salario));
			
		}	
		
	}
}
