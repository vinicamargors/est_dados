import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        NossoVetor v1;
        System.out.println("Qual o tamanho do vetor desejado: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        v1 = new NossoVetor(t);

        NossoVetor v2 = new NossoVetor();

        int i = 1;
        while(!v1.estaCheio()){
            System.out.println("Tamanho:"+ i);
            v1.inserir(i++);
        }
        i=1;
        while(!v2.inserir(i)){
            System.out.println(i++);
        }

        sc.close();
    }
}
