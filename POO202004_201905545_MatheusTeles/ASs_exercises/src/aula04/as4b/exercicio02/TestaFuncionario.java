package aula04.as4b.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaFuncionario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionario = new ArrayList<Funcionario>();
		
		int matricula = 0;
		int i = 0 ;
		
		Funcionario[] f = new Funcionario[10];
		Endereco[] e = new Endereco[10];
		System.out.println("Informe a Matricula do funcionário:");
		matricula = sc.nextInt();
		if(matricula == 0)
			System.out.println("\nNão há ninguém cadastrado!");
		else {	
			while(matricula!=0) {
				f[i] = new Funcionario();
				e[i] = new Endereco();
				f[i].setMatricula(matricula);
				System.out.println("Insira o cpf:");
				f[i].setCpf(sc.next());
				sc.nextLine();
				System.out.println("Insira o Nome:");
				f[i].setNome(sc.nextLine());
				System.out.println("Insira o cargo:");
				f[i].setCargo(sc.nextLine());
				System.out.print("Insira o salário: R$ ");
				f[i].setSalario(sc.nextDouble());
				sc.nextLine();
				System.out.println("\nInsira o departamento:");
				f[i].setDepartamento(sc.nextLine());
				System.out.println("\nPreencha com os dados de endereço:");
				System.out.print("Rua: ");
				e[i].setRua(sc.nextLine());
				System.out.print("Número: ");
				e[i].setNumero(sc.nextInt());
				System.out.print("Quadra: ");
				e[i].setQuadra(sc.nextInt());
				System.out.print("Lote: ");
				e[i].setLote(sc.nextInt());
				sc.nextLine();
				System.out.print("Complemento: ");
				e[i].setComplemento(sc.nextLine());
				System.out.print("Bairro: ");
				e[i].setBairro(sc.nextLine());
				System.out.print("Cidade: ");
				e[i].setCidade(sc.nextLine());
				System.out.print("Estado: ");
				e[i].setEstado(sc.nextLine());
				f[i].setEndereco(e[i]);
				funcionario.add(f[i]);
				i++;
				System.out.println("\nInsira a nova matricula ou digite 0 para sair");
				matricula = sc.nextInt();
			}
			System.out.println(funcionario.toString());
			for(int k = 0; k < i; k++) 
				f[k].aumenta(f[k].getSalario());
			System.out.println("\n\nSalário aumentado");
			System.out.println(funcionario.toString());
		}
		
	}
}
