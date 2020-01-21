package aula02.as2b.exercicio04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SaldoMedio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat fc = new DecimalFormat("#,####.00");
		
		double saldo_medio = 0, credito = 0;
		
		System.out.println("Insira seu saldo médio :");
		saldo_medio = sc.nextDouble();
		
		if(saldo_medio >= 0 && saldo_medio <= 200)
			System.out.println("Saldo médio de: R$ " + fc.format(saldo_medio)+ "\nNenhum crédito");
		
		if(saldo_medio > 200  && saldo_medio <= 400) {
			credito = 0.2 * saldo_medio;
			System.out.println("Saldo médio de: R$ " + fc.format(saldo_medio) + "\nCrédito de: R$ "+ fc.format(credito));
			
		}
		
		if(saldo_medio > 400  && saldo_medio <= 600) {
			credito = 0.3 * saldo_medio;
			System.out.println("Saldo médio de: R$ " + fc.format(saldo_medio) + "\nCrédito de: R$ "+ fc.format(credito));
			
		}
		if(saldo_medio > 600) {
			credito = 0.4 * saldo_medio;
			System.out.println("Saldo médio de: R$ " + fc.format(saldo_medio) + "\nCrédito de: R$ "+ fc.format(credito));
			
		}
		
		
		
	}
}
