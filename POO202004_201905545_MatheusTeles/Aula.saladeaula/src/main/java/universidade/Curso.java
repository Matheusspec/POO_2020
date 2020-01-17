
package aula02.universidade;

class Curso {
    String nome;
    String area;
    int duracao;
    String tipo;
    
  public Curso(){}    
  
  public Curso(String nome){
        this.nome = nome;
    }
  public Curso(String nome, String area, String tipo, int duracao){
        this.nome = nome;
        this.area = area;
        this.tipo = tipo;
        this.duracao = duracao;
    }
}
