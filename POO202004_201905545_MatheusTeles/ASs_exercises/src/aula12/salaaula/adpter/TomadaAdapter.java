package aula12.salaaula.adpter;

public class TomadaAdapter extends Tomada2pinos{
	 private TomadaTresPinos tomadaDeTresPinos;
	 
	    public TomadaAdapter(TomadaTresPinos tomadaDeTresPinos) {
	        this.tomadaDeTresPinos = tomadaDeTresPinos;
	    }
	 
	    public void ligarNaTomadaDeDoisPinos() {
	        tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
	    }
}
