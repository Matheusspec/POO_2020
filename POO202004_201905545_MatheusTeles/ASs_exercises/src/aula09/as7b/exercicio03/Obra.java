package aula09.as7b.exercicio03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Obra {

	private String titulo;

	private double preco;

	private Date dataCriacao;

	private String situacao;

	private String tipo;

	private String material;

	private String artistaNome;

	public Obra(String titulo, double preco, Date dataCriacao, String situacao, String tipo, String material, String artistaNome) {
		this.titulo = titulo;
		this.preco = preco;
		this.dataCriacao = dataCriacao;
		this.situacao = situacao;
		this.tipo = tipo;
		this.material = material;
		this.artistaNome = artistaNome;
	}
	
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat fc = new DecimalFormat("#,###.00");
		StringBuffer cs = new StringBuffer();
		cs.append("\nTítulo: " + this.getTitulo() + " | Preço: "  +  fc.format(this.getPreco()) + " | Criação: " + formato.format(this.getDataCriacao()) 
		+ "\nSituação: " + this.getSituacao() + " | Tipo: " + this.getTipo() + " | Material: " + this.getMaterial() 
		+ "\nArtista: " + this.getArtistaNome() + "\n");
		
		return cs.toString();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getArtistaNome() {
		return artistaNome;
	}

	public void setArtistaNome(String artistaNome) {
		this.artistaNome = artistaNome;
	}


	
	

	
}
