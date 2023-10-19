public class Caracteres {
    public static void main(String[] args) {

        //char caracter = "@";
        //la linea anterior da error por que los caracteres van en comillas simple
        char caracter = 'a';
        var caracterConVar = 'b';
        char caracterSimbolo = '@';
        char caracterUnicode = '\u0040';//representa el @
        char caracterDecimal = 64; // representa el @ tambien

        System.out.println("caracterUnicode = caracterDecimal "+(caracterUnicode==caracterDecimal));

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("tipo char corresponde en bites a = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

        //CARACTERES ESPECIALES
        //los caracteres se pueden concatenar con strings
        char espacio = ' ';
        System.out.println("espacio = " + espacio);
        char retroceso = '\b';//retrocede un espacio
        char tabulador = '\t';//realiza una tabulacion
        char nuevaLinea = '\n';//realiza un salto de linea
        char retornoCarro = '\r';//realiza un retorno de carro(realiza un salto de linea y borra lo anterior)
        System.out.println("retornoCarro = " + retornoCarro + "mas texto");
        System.out.println("hola");

        //podemos reemplazar \n y \r por System.lineSeparator()



    }
}
