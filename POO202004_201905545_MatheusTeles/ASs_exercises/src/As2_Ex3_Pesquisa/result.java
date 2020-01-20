package As2_Ex3_Pesquisa;

import java.util.Scanner;

public class result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hab = 0;
		int maiorI = 0;
		int cont = 0;
		double porc = 0;
		System.out.println("Informe a população estudada em número de habitantes");
		hab = sc.nextInt();
		
		pessoa[] p = new pessoa[hab];
		
		for(int i = 0;i < hab; i++) {
			p[i] = new pessoa();
			
			System.out.println("Informe o sexo da pessoa " + (i+1));
			p[i].sexo = sc.next();
			
			System.out.println("Informe a cor dos olhos");
			p[i].olho = sc.next();
			
			System.out.println("Informe a cor dos cabelos");
			p[i].cabelo = sc.next();
			
			System.out.println("Informe a idade");
			p[i].idade = sc.nextInt();
		}
		maiorI = p[0].idade;
		for(int i = 0; i < hab;i++) {
			if(p[i].idade > maiorI)
				maiorI = p[i].idade;
			if(p[i].sexo.equals("feminino") && (p[i].idade >= 18 && p[i].idade <= 35) && p[i].cabelo.equals("louros") && p[i].olho.equals("verdes")) {
						cont++;
			}

		}
		
		System.out.println("A maior idade é " + maiorI);
		porc = (cont*100)/hab;
		System.out.println("A porcentagem é de " + porc + "%");
	}

}
