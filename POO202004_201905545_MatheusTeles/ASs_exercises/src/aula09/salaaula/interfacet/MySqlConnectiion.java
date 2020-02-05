package aula09.salaaula.interfacet;

public class MySqlConnectiion implements DBConection {

	@Override
	public void getconnection(String url,String username,String password) {
		System.out.println("Conectado ao MySql: " + "\nUrl: " + url + "\nUser: " + username 
				+ "\nPassword: " + password);
	}

}
