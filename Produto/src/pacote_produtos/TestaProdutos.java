package pacote_produtos;

public class TestaProdutos {
	
	public static void main (String[] args) {
		Produtos p1 = new Produtos();
		Produtos p2 = new Produtos();
		
		p1.getCodProd();
		p1.getNomeProd();
		p1.getPrecoProd();
		p1.getQtdProd();
		
		p2.setCodProd(1234);
		p2.setNomeProd("Blusa de frio");
		p2.setPrecoProd(89.99);
		p2.setQtdProd(56);
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);

}
}