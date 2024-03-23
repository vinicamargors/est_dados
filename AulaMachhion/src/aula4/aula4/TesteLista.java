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
		
		
		System.out.println("\nInserção de inicio caracteriza o empilhamento e de fim o enfileramento\n");

		if(lista.estaVazia()) {
			System.out.println("Não há o que remover");
		}
		else {
			System.out.println(lista.removeInicio() + " foi removido do ínicio");
			System.out.println(lista);
		}
}
}