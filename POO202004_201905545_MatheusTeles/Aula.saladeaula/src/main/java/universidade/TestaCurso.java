package aula02.universidade;

import java.util.Scanner;
import javax.swing.JOptionPane;
        
public class TestaCurso {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Curso c1 = new Curso();
 
      System.out.println("Digite o nome do Curso");
      c1.nome = sc.nextLine();
      System.out.println("Digite a área  do Curso");
      c1.area = sc.nextLine();
      System.out.println("Digite a duração do Curso");
      c1.duracao = Integer.parseInt(sc.nextLine());
      System.out.println("Digite o tipo do Curso");
      c1.tipo = sc.nextLine();
      System.out.println("Curso 1 : " + c1.nome + " -  " + c1.area + " - " + c1.tipo + " - " + c1.duracao + " horas");
        
      
      Curso c2 = new Curso();
      
      System.out.println("Digite o nome do Curso");
      c2.nome = sc.nextLine();
      System.out.println("Digite a área  do Curso");
      c2.area = sc.nextLine();
      System.out.println("Digite a duração do Curso");
      c2.duracao = Integer.parseInt(sc.nextLine());
      System.out.println("Digite o tipo do Curso");
      c2.tipo = sc.nextLine();
      System.out.println("Curso 2 : " + c2.nome + " -  " + c2.area + " - " + c2.tipo + " - " + c2.duracao + " horas");
     
      //c1.nome = JOptioPane.showInputDialog
        
        /*
        //Curso 1
        Curso c1 = new Curso();
        c1.nome = "Ciência da Computação";
        c1.duracao = 3600;
        c1.area = "Exatas";
        c1.tipo = "Computação";
        System.out.println("Nome do curso c1 : " + c1.nome);
        System.out.println("Duração do curso c1 : " + c1.duracao);
        System.out.println("Area do curso c1 : " + c1.area);
        System.out.println("Tipo do curso c1 : " + c1.tipo);

       */
        /*
        System.out.println("Nome do curso c1 : " + c1.nome);
        Curso c2 = new Curso("Engenharia de Software");
        System.out.println("Nome do curso c2 : " + c2.nome);

        curso c3 = new Curso("Sistmeas de Informção", "Ciências Exatas","Computação",3500);
        
        System.out.println("Nome de curso c3 : " + c3.nome);
        System.out.println("Área do curso")
        */
    }
}
