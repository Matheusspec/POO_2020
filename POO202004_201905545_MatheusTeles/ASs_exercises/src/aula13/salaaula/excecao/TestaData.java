package aula13.salaaula.excecao;

public class TestaData {
	public static void main(String[] args) {
		FormataData fd = new FormataData();
		String hoje = "05/02d/2020";
		try {
			System.out.println(fd.converStringToDate(hoje));
			
		}
		catch(Exception e) {
			System.out.println("Erro data incorreta"); 
		}finally{
			System.out.println("Execução obrigatória!");
		}
	}
}
