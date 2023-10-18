import javax.swing.*;

public class HolaMundo {
    public static void main(String[] args) {
        //comentario de una linea
        /*comentario
        multilineal
         */

        //Los nombres de variables comienzan con $ _ o letra
        // se recomienda usar letras
        //se usa camelCase
        //no podemos usar palabras reservadas del lenguaje para nombrar variables

        //DEFINIENDO VARIABLES
        String cadena = "cadena";//valor por defecto null como todos los objetos
        byte numeroDe1Byte=-128;//a 127 valor por defecto:0
        short numeroDe2Bytes= -32768;//a 32767 valor por defecto:0
        int numeroDe4Bytes = -2147483648; // a 2147483647 valor por defecto:0
        long numeroDe8Bytes=-9223372036854775808L; //a 9223372036854775807 valor por defecto:0L
        float numeroFlotanteDe4Bytes = -1.4E-45f; // a 3.4028235E38f aprox valor por defecto:0.0f
        double numeroFlotanteDe8Bytes=-4.9E-324d;//a 1.7976931348623157E308 aprox valor por defecto:0.0d, no es necesaria la d
        //parte numerica es mantisa, e es el exponente, y el numero la potencia
        boolean valorDeVerdad = true;// o false valor por defecto:false
        char caracter16Bits = 'a';//Unicode \u0000 hasta \uffff valor por defecto:\u0000
        //los valores por defecto solo se aplican a atributos de una clase y no a variables locales de un metodo

        //Contexto variables

        String nombreAleatorio = "Raul";
        if (3>2){
            System.out.println("nombreAleatorio = " + nombreAleatorio);
            nombreAleatorio = "Maria";
            String nombreAleatorio2 = "Mariana";
        }

        //System.out.println("nombreAleatorio2 = " + nombreAleatorio2); NO FUNCIONA

        System.out.println("numeroDe2Bytes = " + numeroDe2Bytes);
        //LECTURA DE DATOS INGRESADOS POR CONSOLA
        for (String arg : args) {
            System.out.println("arg = " + arg);
        }

        //INGRESO DE DATOS POR PANTALLA
        String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre");

        //MUESTRA DE DATOS POR PANTALLA
        JOptionPane.showMessageDialog(null,"Hola "+nombre.toUpperCase());

        //NUEVA FORMA DE DEFINIR UNA VARIABLE
        //el tipo de dato se asigna de manera dinamica
     //   var variable;
    }
}
