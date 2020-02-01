package aula09.as7b.exercicio03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GaleriaTest {

	private static Date formata(String data) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataf = null;
		try {
			dataf = formato.parse(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dataf;
	}

	public static void main(String[] args) {
		
		Galeria g = new Galeria();

		Obra o1 = new Obra("Auto-Retrato",71500000,formata("12/09/1889"),"Disponível","Quadro","Óleo,tinta","Vicent Van Gogh");
		Obra o2 = new Obra("Le Rêve",155000000,formata("12/02/1932"),"Disponível","Quadro","Óleo,tinta","Pablo Picasso");
		Obra o3 = new Obra("A Persistência da Memória",200000000,formata("12/06/1931"),"disponível","Quadro","Bronze, Tinta a Óleo","Salvador Dalí");
		
		Cliente c1 = new Cliente("Matheus Teles","3940-2134","938.304.323-02");
		Cliente c2 = new Cliente("Vitor Teles","3442-2134","912.444.343-12");
		
		Venda v1 = new Venda(c1,o3,formata("11/03/2020"));
		Venda v2 = new Venda(c2,o1,formata("22/03/2020"));
		g.cadastraVenda(v1);
		g.cadastraVenda(v2);
	
		
		g.imprimiVenda(g.getVenda());
		
	}

}
