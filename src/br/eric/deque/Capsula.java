package br.eric.deque;

public class Capsula {
	
	private Capsula proxima;
	private Object elemento;
	
	public Capsula(Capsula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	public Capsula(Object elemento) {
		this.elemento = elemento;
	}

	public Capsula getProxima() {
		return proxima;
	}

	public void setProxima(Capsula proxima) {
		this.proxima = proxima;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
}
