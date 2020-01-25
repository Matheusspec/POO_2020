package aula03.as3b.exercicio03;

public class Elevador {
	private int andarAtual;
	private int totalAndar;
	private int capacidade;
	private int pessoas;
	
	public Elevador(int totalAndar, int capacidade) {
		this.totalAndar = totalAndar;
		this.capacidade = capacidade;
	}
	
	public void inicia(int capacidade,int totalAndar) {
		System.out.println("Andar Atual: 0 (Térreo)" + "\nHá "
	+ getPessoas() + " pessoa(s) no elevador"
				+ "\nCapacidade máxima: " + capacidade + "\nAndares: " 
	+ totalAndar);

	}
	
	public void status() {
		if(getAndarAtual() == 0)
			System.out.println("\nAndar Atual: 0 (Térreo)" + "\nHá " + getPessoas() + " pessoa(s) no elevador" +
			"\nCapacidade máxima " + getCapacidade() + "\nAndares: " + getTotalAndar());
		else {	
			if(getAndarAtual() == getTotalAndar())
				System.out.println("\nAndar Atual: "+ getAndarAtual() + "(Cobertura)" + "\nHá " + getPessoas() + " pessoa(s) no elevador" +
				"\nCapacidade máxima " + getCapacidade() + "\nAndares: " + getTotalAndar());
			else
				System.out.println("\nAndar Atual: "+ getAndarAtual() + "\nHá " + getPessoas() + " pessoa(s) no elevador" +
				"\nCapacidade máxima: " + getCapacidade() + "\nAndares: " + getTotalAndar());
		}
			
		
	}
	
	

	public void entra(int pessoas) {
		int totalPessoas = getPessoas();
		int limite = totalPessoas;
		limite += pessoas;
		if(limite <= getCapacidade()) {
			totalPessoas += pessoas;
			setPessoas(totalPessoas);			
		}
		else
			System.out.println("\n-----AVISO!-----\nLimite de pessoas atingido!\n");
	}
	
	public void sai(int pessoas) {
		int totalPessoas = getPessoas();
		if((totalPessoas - pessoas) >= 0 ) {
			totalPessoas -= pessoas;
			setPessoas(totalPessoas);			
		}
		else {
			if(totalPessoas == 0)
				System.out.println("\n---O elevador está vazio!---\n");
			else
				System.out.println("\n---Só há " + totalPessoas + " pessoa(s) no elevador!---\n");
			
		}
	}
	
	public void sobe() {
		int totalandar = getAndarAtual();
		if(totalandar < getTotalAndar())
			totalandar ++;
		else
			System.out.println("\n---O prédio tem " + getTotalAndar() + " andares---\n");
		
		setAndarAtual(totalandar);
	}
	
	public void desce() {
		int totalandar = getAndarAtual();
		if(totalandar > 0)
			totalandar --;
		else
			System.out.println("\n----O elevador está no térreo!----");
		setAndarAtual(totalandar);
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndar() {
		return totalAndar;
	}

	public void setTotalAndar(int totalAndar) {
		this.totalAndar = totalAndar;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}
	
}
