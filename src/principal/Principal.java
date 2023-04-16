package principal;

import java.util.Scanner;

/**
 * 
 * @author Jessica Figueira e Mell Matsuda
 *
 */

public class Principal {
	private static ListaCircular lista;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		lista = new ListaCircular();
		String opcao;

		do {
			System.out.println("\n Por favor, escolha uma opção:\n");
			System.out.println("1) Inserir valores na pilha, fila e lista circular;\n");
			System.out.println("2) Remover valores da pilha, fila e lista circular;\n");
			System.out.println("3) Imprimir valores da pilha, fila e lista circular;\n");
			System.out.println("4) Pesquisar valores na pilha, fila e lista circular.\n");
			System.out.println("5) Sair\n => ");

			opcao = sc.next();
			escolhaOpcao(opcao);

		} while (!opcao.equals("5"));

		System.out.println("Fim do programa!");
		sc.close();
	}

	private static void escolhaOpcao(String opcao) {
		switch (opcao) {
		case "1":
			lista.inserirValor(1);
			lista.inserirValor(2);
			lista.inserirValor(3);
			break;
		case "2":
			lista.removerValor(2);
			break;
		case "3":
			lista.imprimirLista();
			break;
		case "4":
			lista.pesquisarValor(2);
			break;
		default:
			break;
		}
	}
}
