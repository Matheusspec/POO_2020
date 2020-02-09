package aula12.as10b.exercicio04;

public class ProcessoDeferido implements StatusProcess{

	@Override
	public void protocolar(Processo pr) {
		System.out.println("Processo já está protocolado");
		
	}

	@Override
	public void arquivar(Processo pr) {
		pr.EstadoAtual(new ProcessoArquivado());
	}

	@Override
	public void deferir(Processo pr) {
		System.out.println("Processo já está deferido");
	}

	@Override
	public void indeferir(Processo pr) {
		System.out.println("O processo está deferido, não pode ser indeferido");
		
	}

	@Override
	public void cancelar(Processo pr) {
		pr.EstadoAtual(new ProcessoCancelado());
		
	}

}
