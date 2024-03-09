// fazer a leitura de 3 valores quaisquer e multiplicar primeiro pela soma dos outros dois

public class MaisContinhas {

    public static void main (String [] args) {

        double x1 = Double.parseDouble(JOptionPane.showInputDialog ("digite o primeiro número"));
        double x2 = Double.parseDouble (JOptionPane.showInputDialog ("digite o segundo número"));
        double x3 = Double.parseDouble (JOptionPane.showInputDialog ("digite o terceiro número"));


        double resutado = x1 * (x2 + x3);

        JOptionPane.showMessageDialog(null, "resultado = " + resultado, "valor calculado", 1);
    }
}