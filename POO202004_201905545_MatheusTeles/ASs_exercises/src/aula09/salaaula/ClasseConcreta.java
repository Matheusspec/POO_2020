package aula09.salaaula;

public class ClasseConcreta extends ClasseAbstrata {

	@Override
	public void metodoAbstrato() {
		System.out.println("Implementação do método abstrato na classe: " + this.getClass().getSimpleName());
		
	}
	
	public static void main(String[] args) {
		ClasseConcreta cc = new ClasseConcreta();
		cc.metodoAbstrato();
		cc.metodoConcreto();
	}
}
