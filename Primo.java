import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite um valor e descubra se ele e primo: ");
        int n = scanner.nextInt();
        int raiz = (int) Math.sqrt(n);
        int i = 2;
        boolean ePrimo = true;
        do {
            if (n % i++ == 0) {
                ePrimo = false;
            }
        } while (i <= raiz && ePrimo);
        if (ePrimo) {
            System.out.println(n + " e primo");
        }
        else {
            System.out.println(n + " nao e primo");
        }
        scanner.close();
    }
}
