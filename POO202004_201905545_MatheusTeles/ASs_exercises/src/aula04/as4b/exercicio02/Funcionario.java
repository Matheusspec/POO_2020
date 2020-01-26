package aula04.as4b.exercicio02;

import java.text.DecimalFormat;

public class Funcionario {
		private String nome;
		private int matricula;
		private String cpf ;
		private String Cargo;
		private double salario;
		private String departamento;
		private Endereco endereco;
		
		DecimalFormat dc = new DecimalFormat("#,###.00");
		
		public Funcionario() {}
		public String toString() {
			StringBuffer sp = new StringBuffer();
			sp.append("\n" + this.getCargo() + " - " + this.getMatricula() + " - " + this.getNome() + " - Departamento : " + this.getDepartamento() + 
				" – Cargo : " + this.getCargo() + " - Sálario : " + dc.format(this.getSalario()) + "\n\n");
			return sp.toString();
		}
		
		public void aumenta(double salario) {
			salario *= 1.3;
			this.setSalario(salario);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getCargo() {
			return Cargo;
		}

		public void setCargo(String cargo) {
			Cargo = cargo;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

	
}
