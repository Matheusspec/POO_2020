package aula09.as7b.exercicio02;

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
		
		Artista a1 = new Artista("Vicent Van Gogh",formata("30/03/1853"),"Países Baixos");
		Artista a2 = new Artista("Pablo Picasso",formata("25/08/1881"),"Espanha");
		Artista a3 = new Artista("Salvador Dalí",formata("11/05/1904"),"Espanha");
		
		Obra o1 = new Obra("Auto-Retrato",71500000,formata("12/09/1889"),"Vendida","Quadro","Óleo,tinta",a1);
		Obra o2 = new Obra("Le Rêve",155000000,formata("12/02/1932"),"Vendida","Quadro","Óleo,tinta",a2);
		Obra o3 = new Obra("A Persistência da Memória",0.0,formata("12/06/1931"),"disponível","Quadro","Bronze, Tinta a óleo",a3);
		
		g.setObras(o1);
		g.setObras(o2);
		g.setObras(o3);
		
		g.imprimiObra(g.getObras());
		
	}

}
