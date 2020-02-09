package aula03.as3b.exercicio01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa1 {

    private String nome;
    private Date dataNascimento;
    private double altura;

    public Pessoa1(String nome, Date data, double alt){
        this.nome = nome;
        this.dataNascimento = data;
        this.altura = altura;
    } 
    public Pessoa1() {}

    //calcula somente o ano.
    public int calculaIdade(){
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        cal.setTime(dataNascimento);
        int anoNascimento = cal.get(Calendar.YEAR);
        return anoAtual - anoNascimento;
    }

    public String getNome() {
        return nome;
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
