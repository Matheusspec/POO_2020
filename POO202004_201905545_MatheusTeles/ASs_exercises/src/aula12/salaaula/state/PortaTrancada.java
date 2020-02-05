package aula12.salaaula.state;

public class PortaTrancada implements EstadosPorta {

	@Override
	public void abrir(Porta p) {
		System.out.println("Porta trancada, destranque-a ");
	}

	@Override
	public void fechar(Porta p) {
		System.out.println("Porta fechada e trancada ");

	}

	@Override
	public void trancar(Porta p) {
		System.out.println("Porta trancada ");

	}

	@Override
	public void destrancar(Porta p) {
		p.setEstadoAtual(new PortaDestrancada());

	}

}
