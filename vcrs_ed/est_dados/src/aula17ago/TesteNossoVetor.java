package aula17ago;

public class TesteNossoVetor {
    public static void main(String[] args) {
        int a = 5;
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(100);

        System.out.println("Valor antes:" + v1.getDados()[4]);

        v1.setPosicao(4, 80);

        System.out.println("Valor depois:" + v1.getDados()[4]);

        System.out.println(v2.getDados()[4]);
        NossoVetor v3= v1;
        v1 = new NossoVetor(5);

        v1 = new NossoVetor(4);
        v2 = new NossoVetor(4);

        v1.somaUmVetor(v2);
        v3 = NossoVetor.somaDoisVetores(v1,v2);

        System.out.println(NossoVetor.count);



        
    }
}
