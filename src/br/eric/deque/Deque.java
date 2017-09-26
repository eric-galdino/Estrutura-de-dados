package br.eric.deque;

public class Deque {

	private Capsula primeira;
	private Capsula ultima;
	private int totalDeElementos;
	
	public void adiciona(Object elemento){
		if(this.totalDeElementos == 0){
			this.adicionaNoComeco(elemento);
		}else{
			Capsula novaCapsula = new Capsula(elemento);
			this.ultima.setProxima(novaCapsula);
			this.ultima = novaCapsula;
			this.totalDeElementos++;
		}
	}
	
	public void adicionaNoComeco(Object elemento){
		Capsula novaCapsula = new Capsula(this.primeira, elemento);
		this.primeira = novaCapsula;
		
		if(this.totalDeElementos == 0){
			//Caso a lista esteja vazia
			this.ultima = this.primeira;
		}
		this.totalDeElementos++;
	}
	
	
	public void adiciona(int posicao, Object elemento){}
	public Object pega(int posicao){return null;}
	public void remove(int posicao){}
	public int tamanho(){return 0;}
	public boolean contem(Object o){return false;}
	
	public void removeDoComeco(){}
	public void removeDofim(){}
	
	@Override
	public String toString(){

		  // Verificando se a Lista está vazia
		  if(this.totalDeElementos == 0){
		    return "[]";
		  }
		  
		  StringBuilder builder = new StringBuilder("[");
		  Capsula atual = this.primeira;
		  
		  // Percorrendo até o penúltimo elemento.
		  for (int i = 0; i < this.totalDeElementos-1; i++) {
		    builder.append(atual.getElemento());
		    builder.append(", ");
		    atual = atual.getProxima();
		  }
		  
		  // último elemento
		  builder.append(atual.getElemento());
		  builder.append("]");
		  
		  return builder.toString();
	}
	
	public static void main(String[] args) {

		Deque d = new Deque();
		d.adiciona("Sicrano");
		d.adiciona("Beltrano");
		d.adicionaNoComeco("Fulano");
		
		System.out.println(d);
	}
}
