/**
 * Listagem 4. Gravando dados em um arquivo de texto.
 * https://www.devmedia.com.br/java-arquivos-e-fluxos-de-dados/22859
 */
package aula13.salaaula.persistencia.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GravacaoArquivoTexto {

    public static void main(String args[]) throws IOException {
        Scanner ler = new Scanner(System.in);
        int i, n;

        System.out.printf("Informe o número para a tabuada:\n");
        n = ler.nextInt();

        FileWriter arq = new FileWriter("tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("+--Resultado--+%n");
        for (i=1; i<=10; i++) {
            gravarArq.printf("| %2d * %d = %2d |n", i, n, (i*n));
        }
        gravarArq.printf("+-------------+%n");

        arq.close();

        System.out.printf("\nTabuada do %d foi gravada com sucesso em \"src/main/resources/tabuada.txt\".\n", n);
    }
}
