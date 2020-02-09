/**
 * Listagem 1. Recuperando as informações de um arquivo ou diretório.
 * https://www.devmedia.com.br/java-arquivos-e-fluxos-de-dados/22859
 */
package aula13.salaaula.persistencia.arquivos;

import java.io.File;
import java.util.Scanner;

public class InformacaoArquivoDiretorio {
    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome de um arquivo ou diretório: ");
        String nome = ler.nextLine();

        File objFile = new File(nome);
        if (objFile.exists()) {
            if (objFile.isFile()) {
                System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n",
                        objFile.getName(), objFile.length());
            }
            else {
                System.out.printf("\nConteúdo do diretório:\n");
                String diretorio[] = objFile.list();
                for (String item : diretorio) {
                    System.out.printf("%s\n", item);
                }
            }
        }else System.out.printf("Erro: arquivo ou diretório informado não existe!\n");
    }
}

