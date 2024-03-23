package ordenacao;

import java.util.Date;
import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        NossoVetor v;
        System.out.print("Digite o tamanho do vetor, 0 encerra: ");
        int n = sc.nextInt();
        while (n > 0) {
            v = new NossoVetor(n);
            v.preencheVetor();
            //System.out.println("vetor gerado: " + v);
            //int iteracoes = v.selectionSort();
            //System.out.println("vetor ordenado pelo Selection: " + v);
            //System.out.println("n: " + n + ", iteracoes: " + iteracoes);

            long inicio = new Date().getTime();
            v.selectionSort();
            long fim = new Date().getTime();
            System.out.println("n: " + n + ", Selection demorou " + (fim - inicio) + "ms");
            System.out.print("Digite o tamanho do vetor, 0 encerra: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}