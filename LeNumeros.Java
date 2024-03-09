import java.util.Scanner;

public class LeNumeros {
    public static void main (String[] args) {
        //Declaração de Variáveis
        Scanner sc = new Scanner(System.in);
        int int1, int2, int3;
        double db1, db2, db3;
        //Entrada de Dados
        System.out.print("Digite o primeiro inteiro: ");
        int1 = sc.nextInt();
        System.out.print("Digite o segundo inteiro: ");
        int2 = sc.nextInt();
        //Processamento
        int3 = int1 * int2;
        System.out.println("O resultado e: " + int3);

        System.out.print("Digite o primeiro double: ");
        db1 = sc.nextDouble();
        System.out.print("Digite o segundo double: ");
        db2 = sc.nextDouble();

        System.out.println(db1 + " + " + db2 + " = " + (db1 + db2));

        sc.close();
    }
}