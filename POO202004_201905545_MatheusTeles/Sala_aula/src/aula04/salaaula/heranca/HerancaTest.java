package aula04.salaaula.heranca;

public class HerancaTest {

	public static void main(String[] args) {
		Pessoa pessoa = new Cliente("Carlos","goianai","32432432", "119","solteiro", "masculino",54564, 5600.00,"professor", 9655, "Developer");
		
		System.out.println("Dados do Cliente: " + pessoa.toString());
		
		if(pessoa instanceof Cliente) {
			Cliente c =(Cliente) pessoa;
			c.adicionaInteresses("futebol");
			c.adicionaInteresses("literatura");
			String algumInteresse = c.consultaInteresse("futebol");
			if(algumInteresse != null) {
				System.out.println(algumInteresse);
			}else
				System.out.println("Interesse não encontrado!");
		}
		
	}

}
