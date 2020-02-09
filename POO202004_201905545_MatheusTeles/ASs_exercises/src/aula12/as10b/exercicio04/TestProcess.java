package aula12.as10b.exercicio04;

public class TestProcess {
	public static void main(String[] args) {
		Processo pr = new Processo();
		
		// Processo protocolado -> deferido ou indeferido -> arquivado
		pr.protocolar();
		System.out.println(pr.getStatus().getClass().getSimpleName());
		pr.deferir();
		System.out.println(pr.getStatus().getClass().getSimpleName());
		pr.arquivar();
		System.out.println(pr.getStatus().getClass().getSimpleName());
	}
}
