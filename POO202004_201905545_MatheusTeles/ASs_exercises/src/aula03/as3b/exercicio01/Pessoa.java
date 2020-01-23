package aula03.as3b.exercicio01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
	
	private String nome;
	private int [] dataNascimento;
	private double altura;
	private int idade;
	
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
	
	public int idade(int[] n) {

		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
	
		int mesAtual = cal.get(Calendar.MONTH) + 1;
		
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		
		int base = anoAtual - n[2];
		
		if(mesAtual < n[1]) {
			base--;
		}
		else {
			if(diaAtual < n[0])
				base--;
		}
		
		return base;
	}

	public String toString() {	
		StringBuffer app = new StringBuffer();	
		app.append("Nome: " + this.getNome());
		app.append("\nData de Nascimento: " + getData()[0] + "/" + getData()[1] + "/" + getData()[2]);
		app.append("\nAltura: " + this.getAltura() + " cm");
		app.append("\nIdade: " + getIdade() + " anos");
		
		return app.toString();
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
