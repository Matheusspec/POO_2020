package aula09.as7b.exercicio03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Venda {
	private Cliente cliente;
	private Obra obra;
	private Date dataVenda;
	
	public Venda(Cliente cliente, Obra obra, Date dataVenda) {
		this.cliente = cliente;
		this.obra = obra;
		this.dataVenda = dataVenda;
	}
	
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		StringBuffer cs = new StringBuffer();
		cs.append(this.getObra().toString());
		cs.append(this.getCliente().toString() + "Data da Venda: " + formato.format(this.getDataVenda()) + "\n\n");
		
		return cs.toString();
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Obra getObra() {
		return obra;
	}
	public void setObra(Obra obra) {
		this.obra = obra;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

}
