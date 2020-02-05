package aula11.as9b.exercicio02;

public class ReaderFactory extends ReaderCreator {

	@Override
	public Visualizador criavisualizador(String tipo) {
		
		Visualizador v = null;
		
		if(tipo.equalsIgnoreCase("BPM"))
			v = new VisualizadorBPM();
		
		else if(tipo.equalsIgnoreCase("JPG"))
			v = new VisualizadorJPG();
		
		else 
			throw new IllegalArgumentException("Tipo de Pessoa inválido");
			
		return v;
	}

}
