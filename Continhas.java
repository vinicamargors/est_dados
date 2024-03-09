public class Continhas
{
    public static void main(String[] args)
    {
        int a = 17, b = 3;
        double x = 1.5, y;

        y = 3 * x;

        System.out.println("O y vale: " + y);
        System.out.println("A expressao vale: " + 3 * x);


        int divisionInteger = a / b;
        double divisionDouble = (double)a / b; //Casting a

        System.out.println("Divisao inteira: " + divisionInteger);
        System.out.println("Divisao double, so que nao: " + a / b);
        System.out.println("Divisao double: " + divisionDouble);
    }
}