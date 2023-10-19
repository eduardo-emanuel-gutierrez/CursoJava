public class Primitivos {
    //esta variable flotante se puede usar dentro del metodo estatico main por ser estatica
    static float varFlotante;
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en bites a = " + Byte.SIZE);
        System.out.println("tipo byte corresponde en bytes a = " + Byte.BYTES);
        System.out.println("valor maximo de un byte = " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte = " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bites a = " + Short.SIZE);
        System.out.println("tipo short corresponde en bytes a = " + Short.BYTES);
        System.out.println("valor maximo de un short = " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short = " + Short.MIN_VALUE);

        int numeroInt = Integer.MAX_VALUE;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bites a = " + Integer.SIZE);
        System.out.println("tipo int corresponde en bytes a = " + Integer.BYTES);
        System.out.println("valor maximo de un int = " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un int = " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        //el numero es tomado literalmente como de tipo int, por lo que debemos agregar L al final
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bites a = " + Long.SIZE);
        System.out.println("tipo long corresponde en bytes a = " + Long.BYTES);
        System.out.println("valor maximo de un long = " + Long.MAX_VALUE);
        System.out.println("valor minimo de un long = " + Long.MIN_VALUE);

        //a float podemos asignar un numero como 1 pero no 1.0 , a este debemos agregarlo la letra f al final
        float numeroFloat = Float.MAX_VALUE;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en bites a = " + Float.SIZE);
        System.out.println("tipo float corresponde en bytes a = " + Float.BYTES);
        System.out.println("valor maximo de un float = " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float = " + Float.MIN_VALUE);
        
        double numeroDouble = Double.MAX_VALUE;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("tipo double corresponde en bites a = " + Double.SIZE);
        System.out.println("tipo double corresponde en bytes a = " + Double.BYTES);
        System.out.println("valor maximo de un double = " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double = " + Double.MIN_VALUE);
        
        //var entero = 3000000000; se toma como int, por lo que no se puede asignar, debemos asignar
        // de esta forma
        var entero = 2147483647;
        var entero2 = 2147483648L;

        //al asignar un numero de punto flotante, este es de tipo doble por defecto
        var flotanteDouble = 3.4;
        var flotanteFloat =3.4f;

        //imprimimos valor por defecto de una variable flotante
        System.out.println(varFlotante);

    }
}
