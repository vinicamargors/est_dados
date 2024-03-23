package aula4;


public class No {
	
	private int info;
	private No proximo;
	public No(int info, No proximo) {
		setInfo(info);
		setProximo(proximo);
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
