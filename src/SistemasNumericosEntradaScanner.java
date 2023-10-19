import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        //String numeroString = entrada.nextLine(); podemos prescindir de esta linea
        int numeroDecimal = 0;
        //manejo de errores con try catch
        try {
            //converteimos directamente
            numeroDecimal = entrada.nextInt();//Integer.parseInt(numeroString);
        }catch(InputMismatchException e){//cambia tipo de error
            System.out.println("Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultaodBinario = "Numero binario de " + numeroDecimal + " es = " +Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "Numero octal de " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal);
        String resultadoHexadecimal = "Numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal);
        String mensaje =  resultaodBinario + System.lineSeparator() + resultadoOctal + System.lineSeparator() + resultadoHexadecimal;

        System.out.println(mensaje);


        //de binario a entero
        int numeroBinario = 0b111110100;//500 en binario
        // se antepone 0b al numero
        System.out.println("numeroBinario = 111110100 en decimal es " + numeroBinario);

        int numeroOctal = 0764;//500 en octal
        // se antepone 0 al numero
        System.out.println("numeroOctal = 764 en decimal es " + numeroOctal);

        int numeroHex = 0x1f4;//500 en hexadecimal
        // se antepone 0x al numero
        System.out.println("numeroHex = 1f4 en decimal es " + numeroHex);


    }
}
