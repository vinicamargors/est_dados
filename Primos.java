import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int limite;
        do {
            System.out.print("digite um limite maior que 1 para o intervalo: ");
            limite = scanner.nextInt();
        } while (limite < 2);
        System.out.print("todos os primos entre 2 e o limite:\n2 ");
        for (int n=2; n <= limite; n++) {
            int raiz = (int) Math.sqrt(n); //casting
            int i = 2;
            boolean ePrimo = true;
            do {
                if (n % i++ == 0) {
                    ePrimo = false;
                }
            } while (i <= raiz && ePrimo);
            if (ePrimo) {
                System.out.print(n + " ");
            }
        }

    }
}
