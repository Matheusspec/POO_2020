package aula11.as9b.exercicio02;

public class VisualizadorBPM extends Visualizador {
	
	public void Visualizar() {
		ImagemBPM img = new ImagemBPM();

		img.carregar();

		img.exibir();

		img.fechar();
	}
}
