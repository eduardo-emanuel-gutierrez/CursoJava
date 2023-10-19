import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null,"Ingresa un numero decimal");
        int numeroDecimal = 0;
        //manejo de errores con try catch
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultaodBinario = "Numero binario de " + numeroDecimal + " es = " +Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "Numero octal de " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal);
        String resultadoHexadecimal = "Numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal);
        String mensaje =  resultaodBinario + System.lineSeparator() + resultadoOctal + System.lineSeparator() + resultadoHexadecimal;

        JOptionPane.showMessageDialog(null,mensaje);


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
