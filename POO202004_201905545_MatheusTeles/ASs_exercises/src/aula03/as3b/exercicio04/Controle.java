package aula03.as3b.exercicio04;

public class Controle {
	private int canalAtual;
	private int volumeA;
	
	public Controle(int canalAtual, int volumeA) {
		this.canalAtual = canalAtual;
		this.volumeA = volumeA;
	}
	
	public void consultar() {
		System.out.println("\nCanal: " + getCanalAtual() + "\nVolume: " + getVolumeA());
	
	}
	
	
	void aumentarVolume() {
		int vol = getVolumeA();
		vol++;
		setCanalAtual(vol);
		setVolumeA(vol);
	}
	
	void diminuirVolume() {
		int vol = getVolumeA();
		if(vol > 0)
			vol--;
		if(vol == 0)
			System.out.println("\n---Mudo---");
		setVolumeA(vol);
	}
	
	void trocarCanalM() {
		int att = getCanalAtual();
		att++;
		setCanalAtual(att);
	}


	void trocarCanalN() {
		int att = getCanalAtual();
		if(att > 0)
			att--;
		setCanalAtual(att);
	}
	
	void irCanal(int canal) {
		setCanalAtual(canal);
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public int getVolumeA() {
		return volumeA;
	}

	public void setVolumeA(int volumeA) {
		this.volumeA = volumeA;
	}


	
}
