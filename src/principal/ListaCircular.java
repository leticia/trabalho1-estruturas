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
	
	private void inserirValor(int valor) {
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
	}
	
	private void removerValor(int valor) {
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
            tamanho--;
            return;
        }

        if (atual == inicio) {
            Nodo fim = inicio;
            while (fim.proximo != inicio) {
                fim = fim.proximo;
            }
            inicio = inicio.proximo;
            fim.proximo = inicio;
        } else if (atual.proximo == inicio) {
            anterior.proximo = inicio;
        } else {
            anterior.proximo = atual.proximo;
        }

        tamanho--;
	}
	
	private void imprimirLista() {
        if (inicio == null) {
            return;
        }

        Nodo atual = inicio;
        
        do {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        } while (atual != inicio);
        
        System.out.println();
	}
	
	private boolean pesquisarValor(int valor) {
        if (inicio == null) {
            return false;
        }

        Nodo atual = inicio;
        while (atual.dado != valor) {
            if (atual.proximo == inicio) {
                return false;
            }
            atual = atual.proximo;
        }

        return true;
	}

    public int getTamanho() {
        return tamanho;
    }
}
