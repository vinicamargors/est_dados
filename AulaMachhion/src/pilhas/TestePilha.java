package pilhas;
import java.util.Random;
import javax.swing.JOptionPane;

public class TestePilha {
	public static void main(String[] args) {
		Random random = new Random();
		Pilha pilha = new Pilha();
		
		do {
			if(random.nextBoolean()) {
				pilha.empilha(random.nextInt(10));
			}
			else {
				JOptionPane.showMessageDialog(null, pilha.desempilha());
			}
			JOptionPane.showMessageDialog(null, pilha);
		}
		while(!pilha.estaVazia());
	}
}
