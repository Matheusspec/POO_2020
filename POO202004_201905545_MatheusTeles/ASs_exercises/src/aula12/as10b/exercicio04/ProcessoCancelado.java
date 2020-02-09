package aula12.as10b.exercicio04;

public class ProcessoCancelado implements StatusProcess {

	@Override
	public void protocolar(Processo pr) {
		System.out.println("Processo foi cancelado, impossível protocolá-lo");

	}

	@Override
	public void arquivar(Processo pr) {
		System.out.println("Processo foi cancelado, impossível arquivá-lo");

	}

	@Override
	public void deferir(Processo pr) {
		System.out.println("Processo foi cancelado, impossível deferi-lo");

	}

	@Override
	public void indeferir(Processo pr) {
		System.out.println("Processo foi cancelado, impossível indeferi-lo");

	}

	@Override
	public void cancelar(Processo pr) {
		System.out.println("O processo já está cancelado");
	}

}
