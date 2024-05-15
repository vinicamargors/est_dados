package pacote_produtos;

public class Clientes {					
	
	private int codCli = 01;
	private String nomeCli = "Vinicius Camargo";
	private String enderecoCli = "Rua Doutor Elcio Cezar Piteli 450";
	
	
	public int getCodCli() {
		return codCli;
	}
	public String getNomeCli() {
		return nomeCli;
	}
	public String getEnderecoCli() {
		return enderecoCli;
	}
	
	public void setCodCli(int codCli) {
		this.codCli = codCli;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeCli = nomeProd;
	}
	
	@Override
	public String toString() {
		return "Código Produto: " + this.codCli + "\nNome do Produto: " + this.nomeCli + "\nPreco do produto: R$" + this.precoProd + "\nQuantidade do produto: " + this.qtdProd;
	}
	
}
