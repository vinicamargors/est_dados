//ler 2 inteiros, exibir a sequência entre eles de forma crescente

import java.util.Scanner;

public class TesteDoWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("digite um valor inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("digite outro valor: ");
        int num2 =  scanner.nextInt();
        int cont;
        System.out.print("Sequencia de valores na ordem crescente: ");
        if (num1 <= num2) {
            cont = num1;
            do {
                System.out.print(cont + " ");
                cont++;
            } while (cont <= num2);
        }
        else {
            cont = num2;
            do {
                System.out.print(cont + " ");
                cont++;
            } while (cont <= num1);
        }

        scanner.close();
    }
}
