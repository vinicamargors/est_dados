//Ler uma temperatura em graus Celsius, convertê-la para Fahrenheit e exibir o resultado
// f = 9/5 * c + 32
import java.util.Scanner;
public class Temperaturas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double F, C;
        system.out.println("Digite a temperatura em Celsius: ");
        C = sc.nextDouble();

        F = 9/5 * C + 32; 
        system.out.println("Essa temperatura em Fahrenheit é: " + F);

        sc.close();
    }
}
