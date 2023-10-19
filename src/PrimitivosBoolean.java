public class PrimitivosBoolean {
    public static void main(String[] args) {
        //Los booleanos nos sirven para flujos de control
        boolean datoLogico = true;//tambien podemos usar Boolean.TRUE.booleanValue()
        Boolean datoLogicoBoolean = true;

        double d = 98765.43e-3;//98.76543
        float f = 1.2345e2f;//123.45

        datoLogico = d>f;//el valor de datoLogico cambia a false
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2==1;
        System.out.println("esIgual = " + esIgual);


    }
}
