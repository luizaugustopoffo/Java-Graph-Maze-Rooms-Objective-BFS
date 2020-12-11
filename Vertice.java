package Exercicio2;

import java.util.LinkedList;

public class Vertice {
	private int nome;
	private int cor;
	private int distancia;
	private Vertice parente;
	private LinkedList<Vertice> adjacente;

	public Vertice(int nome) {
		setNome(nome);
		setCor(0);
		setDistancia(-1);
		setParente(null);
		setAdjacente(new LinkedList<>());
	}

	protected int getNome() {
		return nome;
	}

	protected void setNome(int nome) {
		this.nome = nome;
	}

	protected int getCor() {
		return cor;
	}

	protected void setCor(int cor) {
		this.cor = cor;
	}

	protected int getDistancia() {
		return distancia;
	}

	protected void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	protected Vertice getParente() {
		return parente;
	}

	protected void setParente(Vertice parente) {
		this.parente = parente;
	}
	
	protected LinkedList<Vertice> getAdjacente() {
		return adjacente;
	}

	protected void setAdjacente(LinkedList<Vertice> adjacente) {
		this.adjacente = adjacente;
	}
}
