package aula06.salaaula.endereco;

import java.util.ArrayList;
import java.util.List;

public class Bairro {
	private String regiao;
	private String nome;
	private Municipio municipio;
	private List<Endereco> enderecos;
	
	public Bairro(String regiao, String nome, Municipio municipio) {
		this.regiao = regiao;
		this.nome = nome;
		this.municipio = municipio;
		this.enderecos = new ArrayList<Endereco>();
	}
	 

	public void adicionaEndereco(Endereco e) {
		this.enderecos.add(e);
	}
	
	//public Endereco consultaEndereco(Endereco s) {
//		Endereco novoend = new Endereco();
	//	for(Endereco a :this.enderecos) {
		//	if(a.contains(s)) {
			//	novoend = 
			//}
		//}
		
	//}
	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	
	
	
}
