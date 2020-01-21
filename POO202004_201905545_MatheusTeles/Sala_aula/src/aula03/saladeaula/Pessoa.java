package aula03.saladeaula;

import java.util.Date;

 public class Pessoa {
	 
	 private String nome;
	 private Date dataNascimento;
	 public final String especie = "mamifero";
	 
	 public String getNome() {
		 return this.nome;
	 }
	 
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 
	 public Date getDataNascimento() {
		 return this.dataNascimento;
	 }
	 
	 public void setDataNascimento(Date data) {
		 this.dataNascimento = data;
	 }
}
