package IntervaloNumeros;
	
	import java.util.Scanner;

public class Estru_IntervaloNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int i = 0;
		int soma = 0;
		int pares = 0, imp = 0;
		double media = 0;
		System.out.println("Insira o primeiro numero :");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Insira o segundo numero :");
		int num2 = Integer.parseInt(sc.nextLine());
		
		if(num1 < num2) {
			for(i = num1 + 1; i < num2; i++) {
				cont++;
				soma += i;
				if(i%2==0)
					pares ++;
				else
					imp++;
			}
		}
		else {
			for(i = num2 + 1; i < num1; i++) {
				cont++;
				soma += i;
				if(i%2==0)
					pares ++;
				else
					imp++;
			}
		}
		media = (double)soma/(double)cont;
		System.out.println("A quantidade de n�meros no intervalo : " + cont);
		System.out.println("A soma dos n�meros do intervalo : " + soma);
		System.out.println("A m�dia dos n�meros do intervalo : " + media);
		System.out.println("N�meros pares no intervalo : " + pares);
		System.out.println("N�meros pares no intervalo : " + imp);
		
	}
}
