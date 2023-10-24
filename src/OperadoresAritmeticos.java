public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j=4, suma = i +j;
        System.out.println("suma = " + suma);

        int resta = i - j;
        System.out.println("resta = " + resta);

        int multi = i* j;
        System.out.println("multi = " + multi);

        int div = i/j;
        float div2 = (float)i/j;
        System.out.println("div = " + div);//division entera
        System.out.println("div2 = " + div2);//division exacta

        int resto = i % j;
        System.out.println("resto = " + resto);



    }
}
