package aula10.salaaula;

public class Teste {

	public static void apresentar(Animal a) {
		System.out.println(a.getNome());
		a.mover(10,10);
	}
	public static void main(String[] args) {
		
		Object[] Lista  = new Object[3];
		
		Lista[0] = new Amfibio("Salamandra");
		Lista[1] = new Ave("Quero-quero");
		Lista[2] = new Peixe("Dourado");
		
		for(int i = 0; i < 3; i++) {
			apresentar((Animal) Lista[i]);
		}
		
		for(int i = 0; i < 3; i++) {
			if(Lista[i] instanceof Peixe)
				((Peixe) Lista[i]).nada();
		}
	}

}
