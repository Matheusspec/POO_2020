package aula10.salaaula;

public class MundoAnimal {
	public static void main(String[] args) {
		 Animal[] reino = new Animal[3];
		 
		 reino[0] = new Amfibio("Salamandra");
		 reino[1] = new Ave("Quero-quero");
		 reino[2] = new Peixe("Dourado");
		 
		 
		 int tamanho = reino.length;
		 
		 for(int i = 0; i < 3; i++) {
			 if(reino[i] instanceof Peixe) {
				 ((Peixe) reino[i]).nada();
			 }
			 else
				 reino[i].mover(10,10);
		 }
		 
		/* for(Animal a : reino) {
			 a.mover(10, 10);
		 }*/		 
	}
}
