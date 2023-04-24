package principal;

public class ListaCircular {
	private Nodo inicio;
	private Nodo fim;
	private int tamanho;

	private class Nodo {
		int dado;
		Nodo proximo;

		Nodo(int dado) {
			this.dado = dado;
			this.proximo = null;
		}
	}

	public ListaCircular() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}

	public void inserirValor(int valor) {
		Nodo nodo = new Nodo(valor);

		if (inicio == null) {
			inicio = nodo;
			inicio.proximo = inicio;
			fim = inicio;
		} else {
			fim.proximo = nodo;
			nodo.proximo = inicio;
			fim = nodo;
		}

		tamanho++;
		System.out.println("\n\t" + valor + " inserido na lista circular!");
	}

	public void imprimir() {
		Nodo atual = inicio;

		System.out.println("\n\tLISTA CIRCULAR");
		System.out.print("\t");

		do {
			if (atual != null) {
				System.out.print(atual.dado + " ");
				atual = atual.proximo;
			}
		} while (atual != inicio);

		System.out.println("\n\tTotal de nodos: " + tamanho);
		System.out.println();
	}

	public boolean pesquisarValor(int valor) {
		Nodo atual = inicio;

		int contador = 1;
		if (inicio == null) {
			System.out.println("Esta lista está vazia!");
			return false;
		} else {
			do {
				if (atual.dado == valor) {
					System.out.println("\n\t" + valor + " encontrado na posicao " + contador + "!");
					return true;
				}

				atual = atual.proximo;
				contador++;

			} while (atual != inicio);

			System.out.println("\n\t" + valor + " nao encontrado na lista circular!");
			return false;
		}
	}

	public void remover(int valor) {
		if (inicio == null) {
			System.out.println("A lista está vazia!");
			return;
		}

		// Inicialização dos nodos
		Nodo atual = inicio;
		Nodo anterior = fim;

		// Percorre a lista
		while (atual.dado != valor) {
			// Se terminou de percorrer a lista e não encontrou o valor
			if (atual.proximo == inicio) {
				System.out.println("Valor não encontrado para remoção!");
				return;
			}

			anterior = atual;
			atual = atual.proximo;
		}

		/*
		 * O próximo valor do nodo anterior precisa apontar para o próximo valor do nodo
		 * atual => remoção
		 */
		anterior.proximo = atual.proximo;

		if (anterior == atual) {
			inicio = null;
			fim = null;
		} else if (atual == inicio) {
			inicio = atual.proximo;
			fim.proximo = inicio;
		} else if (atual == fim) {
			fim = anterior;
		}

		tamanho--;
		System.out.println("\n\t" + valor + " removido da lista circular!");
	}
}