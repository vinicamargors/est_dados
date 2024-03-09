
public class LeituraValores {

    public static void main (String [] args) {

        String auxiliar ;
        int numero;

        auxiliar = JOptionPane.showInputDialog("digite um numero");
        numero = Integer.pareInt (auxiliar);

        int outroNumero = Integer.parseInt (JOptionPane.showInputDialog ("digite outro número")); 
        JOptionPane.showMessageDialog (null, "soma = " + numero + outroNumero);

        double x = Double.parseDouble (JOptionPane.showInputDialog ("digite um valor decimal"));

    JOptionPane.showMessageDialog (null, "triple x:" + 3 * x );

    }
}