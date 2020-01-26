package aula04.as4b.exercicio01.alunos;

public class Alunos {
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Aluno: " + this.getNome());
		sb.append("\nMatricula: " + this.getMatricula());
		sb.append("\nAno: " + this.getAno());
		sb.append("\nCurso: " + this.getCurso().getNome() + " | Sigla: " + this.getCurso().getSigla());
		sb.append("\nDepartamento: " + this.getCurso().getDepartamento().getNome() + " | Sigla: " + this.getCurso().getDepartamento().getSigla() + "\n\n");
		return sb.toString();
	}

	private String nome;
	private int matricula;
	private int ano;
	private Curso curso;
	
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Alunos(String nome, int matricula, int ano, Curso curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.ano = ano;
		this.curso = curso;
	}
}
