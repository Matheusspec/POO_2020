package aula04.as4b.exercicio01.alunos;

public class Curso {
	private String nome;
	private String sigla;
	private Departamento departamento;
	
	public Curso(String nome, String sigla,Departamento departamento) {
		this.setNome(nome);
		this.setSigla(sigla);
		this.setDepartamento(departamento);
	}

	

	public Curso(String nome2, String sigla2) {
		this.setNome(nome2);
		this.setSigla(sigla2);
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
}
