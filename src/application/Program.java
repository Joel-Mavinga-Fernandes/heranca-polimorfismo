package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioSubcontratado;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Digite o número de funcionários");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do #"+i+" Empregado");
			System.out.println("Subcontratado (y/n)?");
			char a = sc.next().charAt(0);
			if( a == 'n') {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				sc.next();
				System.out.print("Hora: ");
				int hora = sc.nextInt();
				System.out.print("Valor por hora");
				double valorPorHora = sc.nextDouble();
				Funcionario funcionario = new Funcionario (nome, hora, valorPorHora);
				list.add(funcionario);
				
			}
			if(a =='y') {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				sc.next();
				System.out.print("Hora: ");
				int hora = sc.nextInt();
				System.out.print("Valor por hora");
				double valorPorHora = sc.nextDouble();
				System.out.print ("Percentagem Adicional");
				double pagamentoAdicional = sc.nextDouble();
				Funcionario funcionario = new FuncionarioSubcontratado(nome, hora, valorPorHora, pagamentoAdicional);
				list.add(funcionario);
			}
			
			}
			
		System.out.println();
		
		System.out.println("PAGAMENTO");
		for (Funcionario func: list) {
			System.out.println(func.getNome() +" - $"+ func.pagamento());
		
	}
		sc.close();
	}
}
