package Exercicio2;

import java.util.LinkedList;

public class teste {
	public static void main(String[] args) {

		// teste exemplo 1 enunciado do problema
		LinkedList<String> listaVertices = new LinkedList<>();
		// vertices recebidos
		listaVertices.add("A");
		listaVertices.add("B");
		listaVertices.add("C");
		listaVertices.add("D");
		listaVertices.add("E");
		listaVertices.add("F");
		listaVertices.add("G");
		listaVertices.add("H");
		listaVertices.add("I");
		listaVertices.add("J");
		listaVertices.add("K");
		listaVertices.add("L");
		listaVertices.add("M");
		listaVertices.add("Saida");
		listaVertices.add("Entrada");
		listaVertices.add("*");

		// cria busca que eh filha da classe Grafo, que recebe como parametro o tamanho
		// da lista (quantidade de vertices)
		BuscaEmLargura busca = new BuscaEmLargura(listaVertices.size());

		// arrestas recebidas
		// para criar cada arresta, ele pega a posicao do vertice na lista de vertices
		// addArresta recebe como parametro dois inteiros
		busca.addArresta(listaVertices.indexOf("Entrada"), listaVertices.indexOf("A"));
		busca.addArresta(listaVertices.indexOf("A"), listaVertices.indexOf("F"));
		busca.addArresta(listaVertices.indexOf("F"), listaVertices.indexOf("C"));
		busca.addArresta(listaVertices.indexOf("C"), listaVertices.indexOf("B"));
		busca.addArresta(listaVertices.indexOf("B"), listaVertices.indexOf("D"));
		busca.addArresta(listaVertices.indexOf("C"), listaVertices.indexOf("D"));
		busca.addArresta(listaVertices.indexOf("F"), listaVertices.indexOf("J"));
		busca.addArresta(listaVertices.indexOf("J"), listaVertices.indexOf("H"));
		busca.addArresta(listaVertices.indexOf("H"), listaVertices.indexOf("G"));
		busca.addArresta(listaVertices.indexOf("J"), listaVertices.indexOf("G"));
		busca.addArresta(listaVertices.indexOf("J"), listaVertices.indexOf("*"));
		busca.addArresta(listaVertices.indexOf("*"), listaVertices.indexOf("I"));
		busca.addArresta(listaVertices.indexOf("I"), listaVertices.indexOf("L"));
		busca.addArresta(listaVertices.indexOf("L"), listaVertices.indexOf("M"));
		busca.addArresta(listaVertices.indexOf("M"), listaVertices.indexOf("K"));
		busca.addArresta(listaVertices.indexOf("K"), listaVertices.indexOf("Saida"));
		busca.addArresta(listaVertices.indexOf("A"), listaVertices.indexOf("K"));
		busca.addArresta(listaVertices.indexOf("C"), listaVertices.indexOf("E"));
		busca.addArresta(listaVertices.indexOf("E"), listaVertices.indexOf("I"));
		busca.addArresta(listaVertices.indexOf("I"), listaVertices.indexOf("M"));

		// imprime quantidade de salas percorridas
		System.out
				.println("Saída exemplo 1: " + (busca.retornaQtdSalasPercorridas(listaVertices.indexOf("Entrada"), listaVertices.indexOf("*"))
						+ busca.retornaQtdSalasPercorridas(listaVertices.indexOf("*"), listaVertices.indexOf("Saida"))));
		
	
		// teste exemplo 2 enunciado do problema
		LinkedList<String> listaVertices2 = new LinkedList<>();
		listaVertices2.add("A");
		listaVertices2.add("B");
		listaVertices2.add("C");
		listaVertices2.add("D");
		listaVertices2.add("I");
		listaVertices2.add("H");
		listaVertices2.add("GT");
		listaVertices2.add("Saida");
		listaVertices2.add("Entrada");
		listaVertices2.add("*");
		
		BuscaEmLargura busca2 = new BuscaEmLargura(listaVertices2.size());
		
		busca2.addArresta(listaVertices2.indexOf("B"), listaVertices2.indexOf("A"));
		busca2.addArresta(listaVertices2.indexOf("Entrada"), listaVertices2.indexOf("A"));
		busca2.addArresta(listaVertices2.indexOf("B"), listaVertices2.indexOf("GT"));
		busca2.addArresta(listaVertices2.indexOf("GT"), listaVertices2.indexOf("H"));
		busca2.addArresta(listaVertices2.indexOf("H"), listaVertices2.indexOf("*"));
		busca2.addArresta(listaVertices2.indexOf("B"), listaVertices2.indexOf("*"));
		busca2.addArresta(listaVertices2.indexOf("*"), listaVertices2.indexOf("C"));
		busca2.addArresta(listaVertices2.indexOf("C"), listaVertices2.indexOf("I"));
		busca2.addArresta(listaVertices2.indexOf("I"), listaVertices2.indexOf("D"));
		busca2.addArresta(listaVertices2.indexOf("C"), listaVertices2.indexOf("D"));
		busca2.addArresta(listaVertices2.indexOf("D"), listaVertices2.indexOf("Saida"));
		
		System.out
		.println("Saída exemplo 2: " + (busca2.retornaQtdSalasPercorridas(listaVertices2.indexOf("Entrada"), listaVertices2.indexOf("*"))
				+ busca2.retornaQtdSalasPercorridas(listaVertices2.indexOf("*"), listaVertices2.indexOf("Saida"))));
	}
}
