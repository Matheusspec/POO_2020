package IntervaloNumeros;

public class Numeros {
		int num1;
		int num2;
		
		int maior_menor(int num1, int num2) {
			if(num1 < num2 )
				return num2;
			else
				return num1; 
		}
		int menor_maior(int num1, int num2) {
			if(num1 < num2 )
				return num1+1;
			else
				return num2+1; 
		}
		double media(int soma, int tot) {			
			return((double)soma / (double)tot);
			
		}

}
