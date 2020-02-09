package aula12.as10b.exercicio04;

public class ProcessoProtocolado implements StatusProcess {

	@Override
	public void protocolar(Processo pr) {
		System.out.println("Processo já está protocolado");

	}

	@Override
	public void arquivar(Processo pr) {
		System.out.println("O processo precisa se deferido ou indeferido!");

	}

	@Override
	public void deferir(Processo pr) {
		pr.EstadoAtual(new ProcessoDeferido());

	}

	@Override
	public void indeferir(Processo pr) {
		pr.EstadoAtual(new ProcessoIndeferido());

	}

	@Override
	public void cancelar(Processo pr) {
		pr.EstadoAtual(new ProcessoCancelado());

	}

}
