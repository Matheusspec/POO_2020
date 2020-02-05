package aula11.as9b.exercicio02;

public class TestVisualizador {

	public static void main(String[] args) {
		
		ReaderFactory f = new ReaderFactory();
		
		Visualizador v = f.criavisualizador("jpg");
		
		v.Visualizar();
		
		v = f.criavisualizador("bpm");
		
		v.Visualizar();
	
	}

}
