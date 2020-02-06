package aula12.salaaula.adpter;

public class TomadaTest {

	public static void main(String args[]) {
		TomadaTresPinos t3 = new TomadaTresPinos();
		
		TomadaAdapter a = new TomadaAdapter(t3);
		a.ligarNaTomadaDeDoisPinos();
	}

}
