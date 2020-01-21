package aula01.as1c.exercicio04;

public class Verifier {
		String nome;
		String tel;
		
		boolean DigitN(char []nome) {
			int cont = 0;
			int cont1 = 0;
			for(int i = 0; i < nome.length; i++) {
				
				boolean fv = Character.isDigit(nome[i]);
				
				if(fv == false)
					cont++;
			}
			if(cont == nome.length)
				return true;
			else
				return false;
		
		
		}
		boolean DigitTel(char []tel) {
			int cont = 0;
			int cont1 = 0;
			for(int i = 0; i < tel.length; i++) {
				
				boolean fv = Character.isDigit(tel[i]);
				
				if(fv == true)
					cont++;
			}
			if(cont == tel.length)
				return true;
			else
				return false;
		
		
		}

}