package aula4;

public class TesteNo {
	public static void main(String[] args) {
		No no1 = new No(10, null);
		No no2 = new No(20, null);
		
		System.out.println("No1:  " +no1);
		System.out.println("\nNo2:  " +no2);
		
		no1.setProximo(no2);
		System.out.println("Será que vai buscar?" + no1.getProximo());
	}
}
