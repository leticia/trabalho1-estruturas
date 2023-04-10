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
		
		escolheOpcao();
	}
	
	private static void escolheOpcao() {
		Scanner sc = new Scanner(System.in);
		String opcao = sc.next();
		
		if (opcao == null) {
			System.out.println("Escolha uma opção!");
		}
		
		System.out.println(opcao);
	}

}
