package aula4;

public class TesteLista {
	public static void main (String[] args) {
		Lista lista = new Lista();
		Lista l = new ListaComUltimo();//fazer insereFim
		
		System.out.println(lista);
		
		System.out.println("--------------------------------------");
		
		for (int i=1; i<10; i++) {
			lista.insereInicio(i*10);
			System.out.println(lista);
		}
		
		System.out.println("--------------------------------------");

		for (int i=1; i<6; i++) {
			l.insereInicio(i*20);
			System.out.println(l);
		}
		
		System.out.println("--------------------------------------");
		
		for (int i=1; i<10; i++) {
			lista.insereFim(i*10 + 6);
			System.out.println(lista);
		}
		
		System.out.println("--------------------------------------");

		for (int i=1; i<6; i++) {
			l.insereFim(i*20 + 5);
			System.out.println(l);
		}
		
		System.out.println("Inserção de inicio caracteriza o empilhamento e de fim o enfileramento");

}
}