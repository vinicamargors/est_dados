import javax.swing.JOptionPane;

public class TesteSaida {
    public static void main (String args[]){
       int a = 15, b = 4, c = 25, d = 73;
       System.out.println("Soma = " + (a + b)); 
       System.out.println("Subtracao = " + (a - b)); 
       System.out.println("Multiplicacao = " + (a * b)); 
       System.out.println("Divisao = " + (a / b)); 
       System.out.println("Resto Inteiro = " + (a % b)); 
       System.out.println("Raiz de " + c + " = " + Math.sqrt(c));
       System.out.println("Raiz de " + d + " = " + Math.sqrt(d));
       System.out.println("Pi = " + Math.PI);
       JOptionPane.showMessageDialog(null, "D vale = "+d);
    }    
}
