package aula12.salaaula.state;

public class PortaTest {
	public static void main(String[] args) {
		Porta p = new Porta();
		
		p.abrir();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.abrir();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.trancar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.destrancar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.fechar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.trancar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		
		
	}
}
