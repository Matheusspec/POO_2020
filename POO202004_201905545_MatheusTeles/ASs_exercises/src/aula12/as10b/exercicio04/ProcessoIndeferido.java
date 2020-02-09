package aula12.as10b.exercicio04;

public class ProcessoIndeferido implements StatusProcess {

	@Override
	public void protocolar(Processo pr) {
		System.out.println("Processo já foi protocolado e está indeferido");

	}

	@Override
	public void arquivar(Processo pr) {
		pr.EstadoAtual(new ProcessoArquivado());

	}

	@Override
	public void deferir(Processo pr) {
		pr.EstadoAtual(new ProcessoDeferido());

	}

	@Override
	public void indeferir(Processo pr) {
		System.out.println("Processo já foi indeferido");
	}

	@Override
	public void cancelar(Processo pr) {
		pr.EstadoAtual(new ProcessoCancelado());

	}

}
