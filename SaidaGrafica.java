import javax.swing.JOptionPane;

public class SaidaGrafica {
    public static void main (String args[]) {
        double x = 17.5, y = 2.75;
        String a;
        JOptionPane.showMessageDialog(null, "Soma e igual a\n = " + (x+y));
        JOptionPane.showMessageDialog(null, "Subtracao e igual a = " + (x-y));
        JOptionPane.showMessageDialog(null, "Multiplicacao e igual a = " + (x*y));
        JOptionPane.showMessageDialog(null, "Divisao e igual a = " + (x/y));
        JOptionPane.showMessageDialog(null, "Resto Inteiro e igual a = " + (x%y));

        a = JOptionPane.showInputDialog("Digite um numero");
        int b = Integer.parseInt(a);
        System.out.println(b);
    }
}
