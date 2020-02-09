package aula12.as10b.exercicio03;

import java.util.Observable;
import java.util.Observer;

public class Seguradora implements Observer {

	public void update(boolean move) {
		if(move == true) {
			System.out.println("Alarme ativado, a Seguradora foi notificada!");
		}
		else
			System.out.println("O alarme não foi ativado");
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
