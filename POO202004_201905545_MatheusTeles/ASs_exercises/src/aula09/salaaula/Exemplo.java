package aula09.salaaula;

public class Exemplo implements IExemplo,IExemplo2 {
	public void metodo1() {
		System.out.println("Implemetando o metodo1");
	}
	
	public String metodo2() {
		return "implementando o metodo 2";
	}
	
	@Override
	public void metodo3() {
		
		System.out.println("Implemetando o metodo3");
	}
	
	public static void main(String[] args) {
		IExemplo ex = new Exemplo();
		ex.metodo1();
		System.out.println(ex.metodo2());
		
	}

}
