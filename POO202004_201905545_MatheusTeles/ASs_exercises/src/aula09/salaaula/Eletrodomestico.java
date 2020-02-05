package aula09.salaaula;

public abstract class  Eletrodomestico {
	private boolean ligado;
	private int voltagem;
	
	public Eletrodomestico(boolean ligado, int voltagem) {
		this.setLigado(ligado);
		this.setVoltagem(voltagem);
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	public abstract void Ligar();
	public abstract void Desligar();
}	
