package aula12.as10b.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class AlarmSystem extends Observable {
	private List<Observer> observers = new ArrayList<Observer>();
	private boolean move;
	public static int control = 0 ;
	public void sensorSala(boolean move) {
		this.move = move;
		if (move == true && control < 1)
			this.notifyObservers();
	}

	public void sensorGaragem(boolean move) {
		this.move = move;
		if (move == true && control < 1)
			this.notifyObservers();
	}

	public void sensorQuarto(boolean move) {
		this.move = move;
		if (move == true && control < 1)
			this.notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
			control++;
			System.out.println("Notificando Sistema...\nDelegacia\nSeguradora");
		for (Observer alarm : observers) {
			alarm.update(null, this.move);
		}
	}

}
