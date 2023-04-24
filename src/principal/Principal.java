package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @author Jessica Figueira e Mell Matsuda */

public class Principal {
	private static Fila fila;
	private static Pilha pilha;
	private static ListaCircular lista;
	private static Scanner sc;
	private static String tipo = null;
	private static int opcaoLista;
	private static int opcaoAcao;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		fila = new Fila();
		pilha = new Pilha();
		lista = new ListaCircular();
		
		do {
			// Trata erros de entrada
			try {
				escolhaLista();

				if (tipo != null) {
					do {
						escolhaAcao();
					} while (opcaoAcao != 0);
				}
			} catch (InputMismatchException e) {
				System.out.println("\nEntrada inválida!");
			}
			
		} while (opcaoLista != 0);
		
		System.out.println("\nFim do programa!");
	}
	
	private static int escolhaLista() {
		opcaoLista = 0;
		tipo = null;
		
		System.out.print("\nSelecione o tipo de lista:"
					+ "\n[1] Fila"
					+ "\n[2] Pilha"
					+ "\n[3] Lista Circular"
					+ "\n[0] Sair"
					+ "\nOpcao: ");
		opcaoLista = sc.nextInt();

		switch (opcaoLista) {
		case 1:
			tipo = "fila";
			break;
		case 2:
			tipo = "pilha";	
			break;
		case 3:
			tipo = "lista circular";	
			break;
		}
		
		return opcaoLista;
	}
	
	private static int escolhaAcao() {
		int n;	
		System.out.print("\nSelecione a acao da " + tipo + ":"
					+ "\n[1] Inserir"
					+ "\n[2] Imprimir"
					+ "\n[3] Pesquisar"
					+ "\n[4] Remover"	
					+ "\n[0] Voltar"
					+ "\nOpcao: ");	
		opcaoAcao = sc.nextInt();
		
		switch (opcaoAcao) {
		case 1:
			System.out.print("\nInsira um valor: ");
			n = sc.nextInt();
			
			switch(tipo) {
			case "fila":
				fila.inserirValor(n);
				break;
			case "pilha":
				pilha.inserirValor(n);
				break;
			case "lista circular":
				lista.inserirValor(n);
				break;
			}
			break;
		
		case 2:
			switch(tipo) {
			case "fila":
				fila.imprimir();
				break;
			case "pilha":
				pilha.imprimir();
				break;
			case "lista circular":
				lista.imprimir();
				break;
			}
			break;
			
		case 3:
			System.out.print("\nInsira um valor: ");
			n = sc.nextInt();
		
			switch(tipo) {
			case "fila":
				fila.pesquisarValor(n);
				break;
			case "pilha":
				pilha.pesquisarValor(n);
				break;
			case "lista circular":
				lista.pesquisarValor(n);
				break;
			}
			
			break;
		case 4:
			switch(tipo) {
			case "fila":
				fila.remover();
				break;
			case "pilha":
				pilha.remover();
				break;
			case "lista circular":
				System.out.print("\nInsira um valor: ");
				n = sc.nextInt();
				
				lista.remover(n);
				break;
			}
			
			break;
		}
		
		return opcaoAcao;
		}
	}






















