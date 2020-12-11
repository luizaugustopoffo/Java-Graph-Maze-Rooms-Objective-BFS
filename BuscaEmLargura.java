package Exercicio2;

import java.util.LinkedList;

public class BuscaEmLargura extends Grafo {
	public BuscaEmLargura(int v) {
		super(v);
	}

	//metodo que faz a busca em largura
	private void BFS(int comeco) {
		for (Vertice v : getListaVertices()) {
			v.setCor(0);
			v.setDistancia(-1);
			v.setParente(null);
		}

		LinkedList<Vertice> fila = new LinkedList<>();
		getListaVertices()[comeco].setCor(1);
		getListaVertices()[comeco].setDistancia(0);
		fila.add(getListaVertices()[comeco]);
		while (!fila.isEmpty()) {
			Vertice u = fila.removeFirst();
			for (Vertice v : u.getAdjacente()) {
				if (v.getCor() == 0) {
					v.setCor(1);
					v.setDistancia(u.getDistancia() + 1);
					v.setParente(u);
					fila.add(v);
				}
			}
			u.setCor(2);
		}
	}

	//metodo para imprimir quantidade de salas percorridas com a busca
	protected int retornaQtdSalasPercorridas(int comeco, int fim) {
		BFS(comeco);
		return getListaVertices()[fim].getDistancia();
	}
}
