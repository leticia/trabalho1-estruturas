package principal;

public class Fila {
	
	private class Nodo {
		int valor;
		Nodo proximo;
	}
	
	private Nodo primeiro;
	private Nodo ultimo;
	private int total = 0;
	
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
		total++;
		System.out.println("\n\t" + valor + " inserido na fila!");
	}
	
	public void imprimir() {
		Nodo nodo = primeiro;
		System.out.println("\n\tFILA");
		System.out.print("\t");
		
		while (nodo != null) {
			System.out.print(nodo.valor + " ");
			nodo = nodo.proximo;
		}
		System.out.print("\n\tTotal de nodos: " + total);
		System.out.println();
	}
	
	public void pesquisarValor(int valor) {
		Nodo nodo = primeiro;
		int count = 1;
		
		while (nodo != null) {
			if (nodo.valor == valor) {
				System.out.println("\n\t" + valor + " encontrado na posicao " + count + "!");
				return;
			}
			
			nodo = nodo.proximo;
			count++;
		}
		System.out.println("\n\t" + valor + " nao encontrado na fila!");
	}
	
	public void remover() {
		if (primeiro != null) {
			primeiro = primeiro.proximo;
			
			if (primeiro == null) {
				ultimo = null;
			}
			System.out.println("\n\tPrimeiro elemento removido da fila!");
			total--;
		} else {
			System.out.println("\n\tFila vazia!");
		}
	}
	
}

























