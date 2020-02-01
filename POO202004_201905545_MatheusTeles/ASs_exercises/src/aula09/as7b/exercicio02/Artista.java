package aula09.as7b.exercicio02;

import java.util.Date;

public class Artista {

	private String nome;

	private Date nascimento;

	private String localNacimento;

	public Artista(String nome, Date nascimento, String localNacimento) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.localNacimento = localNacimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getLocalNacimento() {
		return localNacimento;
	}

	public void setLocalNacimento(String localNacimento) {
		this.localNacimento = localNacimento;
	}

}
