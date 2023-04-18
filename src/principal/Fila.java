package principal;

public class Fila {

	private class Nodo {
		int valor;
		Nodo proximo;
	}

	private Nodo primeiro;
	private Nodo ultimo;
	
	public void inserirValor(int valor) {
		Nodo nodo = new Nodo();
		nodo.valor = valor;
		if (primeiro == null) {
			primeiro = nodo;
			ultimo = nodo;
		} else {
			ultimo.proximo = nodo;
			ultimo = nodo;
		}
	}
	
	public void remover() {
		if (primeiro != null) {
			primeiro = primeiro.proximo;
			if (primeiro == null) {
				ultimo = null;
			}
		}
	}
	
	public void imprimir() {
		Nodo nodo = primeiro;
		while (nodo != null) {
			System.out.print(nodo.valor + " ");
			nodo = nodo.proximo;
		}
		System.out.println();
	}
	
	public void pesquisarValor(int valor) {
		Nodo nodo = primeiro;
		while (nodo != null) {
			if (nodo.valor == valor) {
				System.out.println("Encontrei o valor " + valor);
				return;
			}
			nodo = nodo.proximo;
		}
		System.out.println("Não encontrei o valor " + valor);
	}
}
