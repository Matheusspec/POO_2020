package aula11.as9b.exercicio02;

public class VisualizadorJPG extends Visualizador {
	
	public void Visualizar() {
		ImagemJPG img = new ImagemJPG();

		img.carregar();

		img.exibir();

		img.fechar();
	}
}
