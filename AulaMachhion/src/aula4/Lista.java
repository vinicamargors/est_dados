package aula4;

public class Lista {
	private No primeiro;

	//construtor padrao
	public No getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(No primeiro) {
		this.primeiro=primeiro;
	}

	public boolean estaVazia() {
		return primeiro == null;
	}	
	/* nem todos os atributos tem Set, deixa fechado
	public void setPrimeiro(No primeiro) {
	*/	
	public void insereInicio(int i) {
		No novo = new No(i);
		if (!estaVazia()) {
			novo.setProximo(primeiro);
		}
		primeiro = novo;
	}
	@Override 
	public String toString() {
		String s = "lista: ";
		if (estaVazia()) {
			s +="esta vazia";
			
		}else {
			No aux = primeiro;
			while (aux != null) { //percorre até o final da lista
				s += aux;
				aux = aux.getProximo();
			}
			s += "\\\\";
		}
		return s;
	}
	
	public void insereFim(int i) {
		No novo = new No(i);
		if (estaVazia()) {
			primeiro = novo; 
		}
		else {
			No aux = primeiro;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}
}
