package aula09.as7b.exercicio01_2;

public class Testmodelo {
	public static void main(String[] args) {
		Empregado e1 = new Empregado("0232239","Matheus",32);
		Veiculo v1 = new Veiculo(2308,e1);
		
		v1.setPlaca(3280);
		e1.setIdade(22);
		
		v1.imprimir();
		e1.imprimir();
	} 
}
