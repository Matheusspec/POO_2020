package aula11.salaaula.factory_method;

public class TestApp {
	public static void main(String args[]) {
		FabricaPessoa factory = new FabricaPessoa();
		
		Pessoa pessoa = factory.criaPessoa("Carlos", "M");
		
	/*	String nome1 = "Maria";
		String sexo1 = "F";*/
		
		pessoa = factory.criaPessoa("Maria","F");
		
		
		try {
			String nome2 = "Erro";
			String sexo2 = "Z";
			factory.criaPessoa(nome2, sexo2);
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}

	}

}
