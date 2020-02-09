package aula12.as10b.exercicio04;

public class Processo{
	StatusProcess status;
	
	public Processo() {
		status = new ProcessoProtocolado();
	}

	
	public void protocolar() {
		status.protocolar(this);
		
	}

	
	public void arquivar() {
		status.arquivar(this);
		
	}

	
	public void deferir() {
		status.deferir(this);
		
	}

	
	public void indeferir() {
		status.indeferir(this);
		
	}


	public void cancelar() {
		status.cancelar(this);
		
	}
	
	public StatusProcess getStatus() {
		return status;
	}
	
	public void EstadoAtual(StatusProcess status) {
		this.status = status;
	}
	
}
