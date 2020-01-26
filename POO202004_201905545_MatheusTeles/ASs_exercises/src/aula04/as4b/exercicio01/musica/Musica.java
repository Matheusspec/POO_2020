package aula04.as4b.exercicio01.musica;

public class Musica {
	private String nome;
	private int ano;
	private String tipo;
	private Compositor comp;
	
	public Musica(String nome, int ano, String tipo, Compositor comp) {
		this.nome = nome;
		this.ano = ano;
		this.tipo = tipo;
		this.comp = comp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Compositor getComp() {
		return comp;
	}

	public void setComp(Compositor comp) {
		this.comp = comp;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nImprimindo dados da músia " + this.getNome() );
		sb.append("\nAno: " + this.getAno());
		sb.append("\nTipo: " + this.getTipo());
		sb.append("\nCompositor: " + this.getComp().getNome());
		sb.append("\nNacionalidade: " + this.getComp().getNacionalidade() + "\n\n\n");
		return sb.toString();
	}
}
