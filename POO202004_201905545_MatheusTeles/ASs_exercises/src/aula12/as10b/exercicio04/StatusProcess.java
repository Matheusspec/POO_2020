package aula12.as10b.exercicio04;

public interface StatusProcess {
	void protocolar(Processo pr);
	void arquivar(Processo pr);
	void deferir(Processo pr);
	void indeferir(Processo pr);
	void cancelar(Processo pr);
}	
