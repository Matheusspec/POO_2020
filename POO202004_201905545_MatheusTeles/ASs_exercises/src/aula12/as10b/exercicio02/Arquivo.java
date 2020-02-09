package aula12.as10b.exercicio02;

public class Arquivo implements Pasta {

	private String nome;
	private double tamanho;

	Arquivo(String nome, double tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}

	@Override
	public void abrir() {
		System.out.println( this.nome + " | size: " + this.tamanho + "Kb");
		
	}

}
