package pacote_produtos;

public class Produtos {					
	
	private int codProd = 98;
	private String nomeProd = "Camisa";
	private double precoProd = 34.99; 
	private int qtdProd = 34;
	
	public int getCodProd() {
		return codProd;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public double getPrecoProd() {
		return precoProd;
	}
	public int getQtdProd() {
		return qtdProd;
	}
	
	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public void setPrecoProd(double precoProd) {
		this.precoProd = precoProd;
	}
	public void setQtdProd(int qtdProd) {
		this.qtdProd = qtdProd;
	}
	
	@Override
	public String toString() {
		return "Código Produto: " + this.codProd + "\nNome do Produto: " + this.nomeProd + "\nPreco do produto: R$" + this.precoProd + "\nQuantidade do produto: " + this.qtdProd;
	}
	
}
