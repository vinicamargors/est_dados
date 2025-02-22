public class TesteModelo {
    public static void main(String[] args) {
        Modelo m = new Modelo();
        System.out.println("inteiros: " +m.inteiro);
        System.out.println("double: "+m.quebrado);
        System.out.println("String: "+m.str);
        System.out.println("boolean: "+m.bool);
        System.out.println("char: "+m.ch);

        System.out.println("m = " +m);
    }
}
