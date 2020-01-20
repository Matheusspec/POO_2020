package As1_Ex3_vetor;

public class Vet {
	void buble(int[] content, boolean controle) {
		int i = 0;
		int j = 0;
		for(i = 0; i < content.length; i++) {
			for(j = 0; j < content.length - 1; j++) {
				if(controle == true) {
					if(content[j] > content[j+1] ) {
						int aux = content[j];
						content[j] = content[j+1];
						content[j+1] = aux;
					}
				}else {
					if(content[j] < content[j+1] ) {
						int aux = content[j];
						content[j] = content[j+1];
						content[j+1] = aux;
					}
				}
			}
		}
		
	}
}
