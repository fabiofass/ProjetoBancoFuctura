package BancoFuctura;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaFuctura extends Conta {
	
	public AgenciaFuctura(String numero_conta, String nome_titular, Double saldo_disponivel) {
		super(numero_conta, nome_titular, saldo_disponivel);
		// TODO Auto-generated constructor stub
	}

	static ArrayList<Conta> contasBancarias;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		contasBancarias = new ArrayList<Conta>();
		
		
		
		boolean stop = true; 
do {
		System.out.println("------------------------------------------------------");
		System.out.println("-------------Bem vindos a nossa Agência---------------");
		System.out.println("------------------------------------------------------");
		System.out.println("***** Selecione uma operação que deseja realizar *****");
		System.out.println("------------------------------------------------------");
		System.out.println("|   Opção 1 - Criar conta   |");
		System.out.println("|   Opção 2 - Depositar     |");
		System.out.println("|   Opção 3 - Sacar         |");
		System.out.println("|   Opção 4 - Transferir    |");
		System.out.println("|   Opção 5 - Listar        |");
		System.out.println("|   Opção 6 - Sair          |");
		int opcao = input.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Digite seu nome: ");
		  
			
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			System.out.println("Obrigado!!");
			stop = false;
			break;

		default:
			System.out.println("Opção Inválida!!");
			break;

		}
         }while(stop);

	}

}
