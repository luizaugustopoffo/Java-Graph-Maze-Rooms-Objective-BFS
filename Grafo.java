package Exercicio2;

public class Grafo {
	private Vertice[] ListaVertices;
	
	public Grafo(int v) {
		setListaVertices(new Vertice[v]);
		for (int i = 0; i < v; i++) {
			getListaVertices()[i] = new Vertice(i);
		}
	}
	
	protected Vertice[] getListaVertices() {
		return ListaVertices;
	}

	protected void setListaVertices(Vertice[] listaVertices) {
		ListaVertices = listaVertices;
	}

	//metodo que cria as arrestas
	protected void addArresta(int a, int b) {
		getListaVertices()[a].getAdjacente().add(getListaVertices()[b]);
		if (a != b)
			getListaVertices()[b].getAdjacente().add(getListaVertices()[a]); 
	}
}
