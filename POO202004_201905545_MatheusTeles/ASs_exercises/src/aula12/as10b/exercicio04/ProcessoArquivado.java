package aula12.as10b.exercicio04;

public class ProcessoArquivado implements StatusProcess {

	@Override
	public void protocolar(Processo pr) {
		System.out.println("O processo já foi protocolado");
		
	}

	@Override
	public void arquivar(Processo pr) {
		System.out.println("O processo já foi arquivado");
		
	}

	@Override
	public void deferir(Processo pr) {
		System.out.println("Processo arquivado, impossível deferi-lo");
		
	}

	@Override
	public void indeferir(Processo pr) {
		System.out.println("Processo arquivado, impossível indeferi-lo");
		
	}

	@Override
	public void cancelar(Processo pr) {
		pr.EstadoAtual(new ProcessoCancelado());
	}

}
