package principal;

public class Pilha {

	private class Nodo {
		int valor;
		Nodo anterior;
	}

	private Nodo topo;
	private int total = 0;

	protected void inserirValor(int valor) {
		Nodo anterior = topo;
		topo = new Nodo();
		
		topo.valor = valor;
		topo.anterior = anterior;
		total++;
		
		System.out.println("\n\t" + valor + " inserido na pilha!");
	}

	protected void imprimir() {
		Nodo nodo = topo;
		System.out.println("\n\tPILHA");
		System.out.print("\t");
		
		while (nodo != null) {
			System.out.print(nodo.valor + " ");
			nodo = nodo.anterior;
		}
		System.out.print("\n\tTotal de nodos: " + total);
		System.out.println();
	}
	
	protected void pesquisarValor(int valor) {
		Nodo nodo = topo;
		int count = total;
		
		while (nodo != null) {
			if (nodo.valor == valor) {
				System.out.println("\n\t" + valor + " encontrado na posicao " + count + "!");
				return;
			}
			nodo = nodo.anterior;
			count--;
		}
		System.out.println("\n\t" + valor + " nao encontrado na pilha!");
	}
	
	protected void remover() {
		if (topo != null) {
			topo = topo.anterior;
			System.out.println("\n\tUltimo elemento removido da pilha!");
			total--;
		} else {
			System.out.println("\n\tPilha vazia!");
		}
	}
	
}