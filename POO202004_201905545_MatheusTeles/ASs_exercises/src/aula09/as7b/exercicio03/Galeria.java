package aula09.as7b.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Galeria {

	private List<Obra> obras = new ArrayList<Obra>();
	private List<Venda> vendas = new ArrayList<Venda>();

	public void cadastraVenda(Obra obra) {
		obras.add(obra);
	}
	
	public void cadastraVenda(Venda venda) {
		vendas.add(venda);
	}
	
	public void imprimiVenda(List<Venda> Venda) {
		System.out.println(Venda.toString());
	}
	
	public List<Venda> getVenda() {
		return vendas;
	}

	public void setVenda(List<Venda> venda) {
		this.vendas = venda;
	}
	


}
