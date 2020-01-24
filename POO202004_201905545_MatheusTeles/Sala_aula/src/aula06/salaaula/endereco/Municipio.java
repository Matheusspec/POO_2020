package aula06.salaaula.endereco;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
	private Long codigoIbge;
	private String nome;
	private Estado estado;
	private List<Bairro> bairro;
	
	public Municipio(Long codigoIbge, String nome, Estado estado) {

		this.codigoIbge = codigoIbge;
		this.nome = nome;
		this.estado = estado;
		this.setBairro(new ArrayList<Bairro>());
	}
	
	public void adicionarBairro(Bairro b) {
		this.bairro.add(b);
	}
	
	public Bairro consultapelonome(String nome) {
		Bairro novoBairro = null;
		for(Bairro g : this.bairro) {
			if(g.getNome().equals(nome)) {
				novoBairro = g;
			}
		}
		return novoBairro;
	}
	
	public Long getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(Long codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Bairro> getBairro() {
		return bairro;
	}

	public void setBairro(List<Bairro> bairro) {
		this.bairro = bairro;
	}

	
	

	
}
