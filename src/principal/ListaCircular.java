package principal;

public class ListaCircular {
	private Nodo inicio;
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
		tamanho = 0;
	}

	public void inserirValor(int valor) {
		Nodo nodo = new Nodo(valor);

		if (inicio == null) {
			inicio = nodo;
			inicio.proximo = inicio;
		} else {
			Nodo atual = inicio;
			
			while (atual.proximo != inicio) {
				atual = atual.proximo;
			}
			atual.proximo = nodo;
			nodo.proximo = inicio;
		}
		tamanho++;
		System.out.println("\n\t" + valor + " inserido na lista circular!");
	}
	
	public void imprimir() {
		Nodo atual = inicio;
		
		System.out.println("\n\tLISTA CIRCULAR");
		System.out.print("\t");
		
		do {
			System.out.print(atual.dado + " ");
			atual = atual.proximo;
		} while (atual != inicio);

		System.out.println("\n\tTotal de nodos: " + tamanho);
		System.out.println();
	}

	public boolean pesquisarValor(int valor) {
	    Nodo atual = inicio;
	    int count = 1;

	    if (inicio == null) {
	    	System.out.println("Esta lista está vazia!");
	        return false;
	    } else {
	        do {
	            if (atual.dado == valor) {
	            	System.out.println("\n\t" + valor + " encontrado na posicao " + count + "!");
	                return true;
	            }

	            atual = atual.proximo;
	            count++;
	            
	        } while (atual != inicio);
	        
	        System.out.println("\n\t" + valor + " nao encontrado na lista circular!");
	        return false;
	    }
	}
	
	public void remover(int valor) {
		if (inicio == null) {
			return;
		}

		Nodo atual = inicio;
		Nodo anterior = null;

		while (atual.dado != valor) {
			if (atual.proximo == inicio) {
				return;
			}
			anterior = atual;
			atual = atual.proximo;
		}

		if (atual == inicio && atual.proximo == inicio) {
			inicio = null;
			return;
		}

		if (atual == inicio) {
			Nodo fim = inicio;
			while (fim.proximo != inicio) {
				fim = fim.proximo;
			}
			inicio = inicio.proximo;
			fim.proximo = inicio;
			tamanho--;
		} else if (atual.proximo == inicio) {
			anterior.proximo = inicio;
		} else {
			anterior.proximo = atual.proximo;
		}
		tamanho--;
		System.out.print("\n\t" + valor + " removido da lista circular!");
	}

	public int getTamanho() {
		return tamanho;
	}
}