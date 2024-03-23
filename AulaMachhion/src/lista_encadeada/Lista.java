package lista_encadeada;


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
		No novo = new No(i, null);
		if (!estaVazia()) {
			novo.setProximo(primeiro);
		}
		primeiro = novo;
	}
	
	public void insereFim(int i) {
		No novo = new No(i, null);
		if (estaVazia()) {
			primeiro = novo;
		} else {
			No aux = primeiro;
			while(aux.getProximo() != null) {//percorre até o ultimo
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}
	
	public int removeInicio() {
		int temp = primeiro.getInfo();
		primeiro = primeiro.getProximo();
		return temp;
	}
	
	public int removeFim() {
		int temp;
		if(primeiro.getProximo() == null) { //só tem um
			temp = primeiro.getInfo();
			primeiro = null; //esvaziou a lista
		}
		else {
			No aux = primeiro;
			while(aux.getProximo().getProximo() != null) { //percorre até o penultimo
				aux = aux.getProximo(); //move o aux
			}
			temp = aux.getProximo().getInfo();
			aux.setProximo(null);//torna o nó nulo
		}
		return temp;
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
}
