package aula14.salaaula.teste;

public class Saude {
	private int idade;
	private double altura;
	private double peso;
	
	public double calculaIMC() {
		double imc = peso / (altura*altura);
		return imc;
	}
	 
	public String condicaoFisica() {
		double imc = calculaIMC();
		String result;
		if(imc < 18.5) {
			result = "Abaixo do peso";
		}else if(imc <= 24.9) {
			result = "Peso normal";
		}else if(imc <= 29.9) {
			result = "Sobrepeso";
		}else {
			result = "Obesidade";
		}
		return result;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
