package aula04.as4b.exercicio03;

import java.text.DecimalFormat;

public class Cadastro {

	public static void main(String[] args) {
		DecimalFormat dc = new DecimalFormat("#,###.00");
		Funcionario f1 = new Funcionario();
		
		f1.setSalario(2500);
		f1.setHorario("09:00 - 18:00");
		f1.setTelefone("9330-6945");
		f1.aumento(10);
		double recebimento = f1.receb(f1.getSalario());
		System.out.print("Funcionário: " + "\nHorário: " + f1.getHorario());
		System.out.println("\nSalário: " + f1.getSalario() + "\nTelefone: " + f1.getTelefone());
		System.out.println("Recebimento anual: " + dc.format(recebimento));
	
		Gerente g1 = new Gerente();
		
		g1.setSalario(6000);
		g1.setTipo("PF");
		g1.setTelefone("9244-3864");
		g1.setBonificacao(200);
		g1.aumento(20);
		recebimento = g1.receb(g1.getSalario());
		
		System.out.print("\n\nGerente: " + "\nTipo: " + g1.getTipo());
		System.out.println("\nSalário: " + g1.getSalario1() + "\nTelefone: " + g1.getTelefone());
		System.out.println("Bonificação: " + g1.getBonificacao() + "\nRecebimento anual: " + dc.format(recebimento)+"\n");
		
		Cliente c1 = new Cliente();
		
		c1.setNome("José");
		c1.setTelefone("3622-0436");
		c1.setIdade(32);
		c1.setCpf("891-9012-33393-01");
		c1.setStatus("A");
		
		Cliente c2 = new Cliente();
		
		c2.setNome("Anna");
		c2.setTelefone("3622-0551");
		c2.setIdade(26);
		c2.setCpf("980-9012-3223-02");
		c2.setStatus("I");
		
		Cliente c3 = new Cliente();
		
		c3.setNome("Matheus");
		c3.setTelefone("3612-0106");
		c3.setIdade(22);
		c3.setCpf("987-9012-3293-11");
		c3.setStatus("I");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString() + "\n");
		
		c2.desativa(c2.getStatus());
		System.out.println(c2.toString());
	}

}
