package aula13.salaaula.persistencia.arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {
	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("arq.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader bf = new BufferedReader(isr);

		String s = bf.readLine();

		while (s != null) {
			System.out.println(s);
			s = bf.readLine();
		}
		bf.close();

	}
}
