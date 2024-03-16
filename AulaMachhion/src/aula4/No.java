package aula4;

public class No {
	
	private int info;
	private No proximo;
	public No (int info) {
		setInfo(info);
		this.info=info; //this previne a ambiguidade
		proximo = null; //redundancia só para exemplificar, ele ja zera com o null por padrao do ponteiro 
	}

	public int getInfo() {
		return info;
	}
	
	public No getProximo() {
		return proximo;
		
	}
	
	public void setInfo (int info) {
		this.info= info;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	@Override 
	public String toString() {
		return "|" + info + "|->";
				
	}
	
	
}
