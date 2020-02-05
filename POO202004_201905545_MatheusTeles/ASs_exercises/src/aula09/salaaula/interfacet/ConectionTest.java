package aula09.salaaula.interfacet;

public class ConectionTest {

	public static void main(String[] args) {
	
		String url = "http://Localhost:1521/pooDb";
		String username = "usuarioAluno";
		String password = "aluno123";
		
		DBConection connection;
		connection = new OracleConection();
		connection.getconnection( url, username,password);
		
		connection = new MySqlConnectiion();
		connection.getconnection( url, username,password);

		connection = new SqlServerConection();
		connection.getconnection( url, username,password);


	}

}
