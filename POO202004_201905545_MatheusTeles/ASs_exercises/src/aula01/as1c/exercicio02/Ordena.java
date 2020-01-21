package aula01.as1c.exercicio02;

import java.util.Scanner;
public class Ordena {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Numeros num = new Numeros();
		
		System.out.println("Insira o 1° número :");
		num.x = sc.nextInt();
		
		System.out.println("Insira o 2° número :");
		num.y = sc.nextInt();
		
		System.out.println("Insira o 3° número :");
		num.z = sc.nextInt();
	
		if(num.x > num.y) {
			int aux = num.x ;
			num.x = num.y;
			num.y = aux;
			}
		if(num.x > num.z) {
			int aux = num.x ;
			num.x = num.z;
			num.z = aux;
			}
		if(num.y > num.z) {
			int aux = num.y ;
			num.y = num.z;
			num.z = aux;
			}
		System.out.println(num.x + " " + num.y + " " + num.z);
	}
	
}	
