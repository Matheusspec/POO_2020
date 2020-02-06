package aula12.as10b.exercicio01;

public class TestaSoma {

	public static void main(String[] args) {
		
		Adapter p = new Adapter();
		Cliente m = new Cliente(p);
		m.executar();
	}

}
