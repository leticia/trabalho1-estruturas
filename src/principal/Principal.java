package principal;

import java.util.Scanner;

/**
 * 
 * @author Jessica Figueira e Mell Matsuda 
 *
 */

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Por favor, escolha uma opção:\n");
		System.out.println("1) Inserir valores na pilha, fila e lista circular;\n");
		System.out.println("2) Remover valores da pilha, fila e lista circular;\n");
		System.out.println("3) Imprimir valores da pilha, fila e lista circular;\n");
		System.out.println("4) Pesquisar valores na pilha, fila e lista circular.\n->");
		
		Scanner sc = new Scanner(System.in);
		String opcao = sc.next();
		
		escolhaOpcao(opcao);
	}

	private static void escolhaOpcao(String opcao) {
		switch(opcao) {
		case "1":
			System.out.println("oi");
			break;
		case "2":
			System.out.println("olá");
			break;
		case "3":
			break;
		case "4":
			break;
		}
	}
	
	

}
