package aula04.salaaula.funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Carlos","191",1000.d);
		
		Funcionario g = new Gerente("Antonio Carlos", "123",2000.0d);
		
		System.out.println(f.calcularBonificacao());
			
		System.out.println(g.calcularBonificacao());
		
		System.out.println(g.getSalario());
		

	}

}
