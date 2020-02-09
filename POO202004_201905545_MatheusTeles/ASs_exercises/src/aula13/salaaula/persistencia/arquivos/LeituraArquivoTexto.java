/**
 * Listagem 5. . Lendo dados de um arquivo de texto.
 * https://www.devmedia.com.br/java-arquivos-e-fluxos-de-dados/22859
 */
package aula13.salaaula.persistencia.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivoTexto {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o nome do arquivo texto:\n");
        String nome = ler.nextLine();

        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while(linha != null){
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();
        }catch (IOException e){
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        System.out.println();
    }
}
