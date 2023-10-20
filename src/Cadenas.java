public class Cadenas {
    public static void main(String[] args) {
        String str1 = "Hola Emanuel";
        String str2 = new String("Hola Emanuel");

        //Chequea si son el mismo objeto
        System.out.println("¿Son el mismo objeto? "+(str1==str2));

        //Cheque si tienen el mismo valor
        System.out.println("¿Tienen el mismo valor? "+str1.equals(str2));

        //METODOS DE LA CLASE STRING
        //int length():numero de caracteres
        //boolean equals(String b):compara si ambas son iguales por valor
        //boolean equalsIgnoreCase(String b): compara si ambas son iguales, independientemente de minusculas o mayusculas
        //int compareTo(String b): Compara contra la cadena del argumento, devolviendo
        //un valor negativo si la cadena es anterior a b
        //cero si la cadena es igual a b
        //un valor positivo si la cadena es posterior a b
        //String trim(): Crea un nuevo objeto eliiminando el espacio en blanco que pudiera haber al principio o al final
        //char charAt(int posicion): Extrae un caracter en la posicion indicada
        //String concat(String b): concatena dos cadenas, es mas eficiente que el +,str1.concat(str2).concat(str3)
        //transform() : utilizamos funciones lambda (funciones flecha)
        String mensaje = "El resultado es: ";
        int numeroA = 10;
        int numeroB = 5;
        System.out.println(mensaje + numeroB + numeroA);// El resultado es : 510
        System.out.println(mensaje + (numeroB + numeroA));// El resultado es : 15
        System.out.println(numeroB + numeroA +mensaje);// 15El resultado es :


        //las String son inmutables
        //cuando "modificamos" un string, lo que estamos haciendo es creando una nueva instancia String
        //a la que ahora hace referencia nuestra variable

    }
}
