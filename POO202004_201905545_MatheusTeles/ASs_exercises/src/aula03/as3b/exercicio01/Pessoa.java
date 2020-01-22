package aula03.as3b.exercicio01;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private int [] dataNascimento;
	private double altura;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int[] getData() {
		return this.dataNascimento;
	}
	
	public void setData(int[] data) {
		this.dataNascimento = data;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double alt) {
		this.altura = alt;
	}
}
