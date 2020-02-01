package aula09.as7b.exercicio04.revista;

public class Edicao extends Revista {
	
	private String assunto;
	
	public Edicao(String titulo, int ano, int numero, String assunto) {
		super(titulo, ano, numero);
		this.setAssunto(assunto);
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

}
