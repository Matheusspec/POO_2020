package aula09.salaaula.interfacet;

public class OracleConection implements DBConection {

	@Override
	public void getconnection(String url,String username,String password) {
		System.out.println("Conectado ao Oracle: " + "\nUrl: " + url + "\nUser: " + username 
				+ "\nPassword: " + password);
	}

}
