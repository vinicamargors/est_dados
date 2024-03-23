package aula4;

public class ListaComUltimo extends Lista {
	private No ultimo;
	//construtor padrao
	@Override 
	public void insereInicio(int i) {
		No novo = new No(i, null);
		if (estaVazia()) {
			ultimo = novo;
		}
		else {
			novo.setProximo(super.getPrimeiro());
		}
		super.setPrimeiro(novo);
	}
	@Override
	public void insereFim(int i) {
		No novo = new No(i, null);
		if (estaVazia()) {
			super.setPrimeiro(novo);
		} else {
			ultimo.setProximo(novo);
		}
		ultimo = novo;
	}
	
	@Override
	public int removeInicio() {
		int temp = super.getPrimeiro().getInfo();
		super.setPrimeiro(super.getPrimeiro().getProximo());
		if (estaVazia()) {//esvaziou a lista
			ultimo = null;
		}
		return temp;
	}
}
