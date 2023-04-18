package principal;

public class Pilha {

	private class Nodo {
		int valor;
		Nodo anterior;
	}

	private Nodo topo;

	protected void inserirValor(int valor) {
		Nodo anterior = topo;
		topo = new Nodo();
		topo.valor = valor;
		topo.anterior = anterior;
	}

	protected void remover() {
		if (topo != null) {
			topo = topo.anterior;
		}
	}

	protected void imprimir() {
		Nodo nodo = topo;
		while (nodo != null) {
			System.out.print(nodo.valor + " ");
			nodo = nodo.anterior;
		}
		System.out.println();
	}

	protected void pesquisarValor(int valor) {
		Nodo nodo = topo;
		while (nodo != null) {
			if (nodo.valor == valor) {
				System.out.println("Encontrei o valor " + valor);
				return;
			}
			nodo = nodo.anterior;
		}
		System.out.println("Não encontrei o valor " + valor);
	}
}
