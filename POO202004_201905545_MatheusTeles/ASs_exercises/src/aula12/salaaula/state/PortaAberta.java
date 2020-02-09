package aula12.salaaula.state;

public class PortaAberta implements EstadosPorta {

	@Override
	public void abrir(Porta p) {
		System.out.println("A porta já está aberta");

	}

	@Override
	public void fechar(Porta p) {
		p.setEstadoAtual(new PortaFechada());

	}

	@Override
	public void trancar(Porta p) {
		System.out.println("Porta aberta, fechar primeiro ");
		
	}

	@Override
	public void destrancar(Porta p) {
		System.out.println("Porta está aberta ");
		
	}

}
