package aula01.laboratorio;
import java.util.Scanner;
public class NumerosInter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Numeros	Num = new Numeros();
		int i,cont=0,soma=0,pares=0,imp=0;
		double media;
		
		System.out.println("Insira o primeiro numero :");
		Num.num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Insira o segundo numero :");
		Num.num2 = Integer.parseInt(sc.nextLine());
		
		int maior = Num.maior_menor(Num.num1,Num.num2);
		int menor = Num.menor_maior(Num.num1,Num.num2);
		
		for(i = menor; i < maior; i++) {
			cont++;
			soma += i;
			if(i%2==0)
				pares ++;
			else
				imp++;
		}
		media = Num.media(soma,cont);
		
		System.out.println("A quantidade de números no intervalo : " + cont);
		System.out.println("A soma dos números do intervalo : " + soma);
		System.out.println("A média dos números do intervalo : " + media);
		System.out.println("Números pares no intervalo : " + pares);
		System.out.println("Números pares no intervalo : " + imp);
	}
 	
}
