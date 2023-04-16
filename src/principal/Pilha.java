package principal;

import java.util.LinkedList;

public class Pilha {
	private LinkedList<Integer> pilha;

	public Pilha() {
		pilha = new LinkedList<>();
	}

	protected void inserirValor(int valor) {
		pilha.addFirst(valor);
	}

	protected void remover() {
		pilha.removeFirst();
	}

	protected void imprimir() {
		for (int valor : pilha) {
			System.out.print(valor + " ");
		}

		System.out.println();
	}

	protected void pesquisarValor(int valor) {
		for (int dado : pilha) {
			if (dado == valor) {
				System.out.println("Encontrei o valor " + valor);
				return;
			}
		}

		System.out.println("Não encontrei o valor " + valor);
	}
}
