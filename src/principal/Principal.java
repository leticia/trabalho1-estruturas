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
			ListaCircular lista = new ListaCircular();
			lista.inserirValor(1);
			lista.inserirValor(2);
			lista.inserirValor(3);
			lista.inserirValor(4);
			lista.inserirValor(5);
			lista.removerValor(3);
			lista.pesquisarValor(3);
			lista.pesquisarValor(2);
			lista.imprimirLista();
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
