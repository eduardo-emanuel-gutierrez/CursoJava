import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        byte num = 3;
        switch (num){
            case 0:
                System.out.println("El numero es 0");
                break;
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            default:
                System.out.println("El numero es mayor a 3");
        }

        //ejemplo uso break
        for (int i = 0; i <= num; i++) {
            if (i==2)break;
            System.out.println("i = " + i);
        }

        //ejemplo uso continue
        for (int i = 0; i <= num; i++) {
            if (i==2)continue;
            System.out.println("i = " + i);
        }

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero del mes");
        int mes = entrada.nextInt();

        switch (mes){
            case 1:
                System.out.println("El mes es Enero");
                break;
            case 2:
                System.out.println("El mes es Febrero");
                break;
            case 3:
                System.out.println("El mes es Marzo");
                break;
            case 4:
                System.out.println("El mes es Abril");
                break;
            case 5:
                System.out.println("El mes es Mayo");
                break;
            case 6:
                System.out.println("El mes es Junio");
                break;
            case 7:
                System.out.println("El mes es Julio");
                break;
            case 8:
                System.out.println("El mes es Agosto");
                break;
            case 9:
                System.out.println("El mes es Septiembre");
                break;
            case 10:
                System.out.println("El mes es Octubre");
                break;
            case 11:
                System.out.println("El mes es Noviembre");
                break;
            case 12:
                System.out.println("El mes es Diciembre");
                break;
            default:
                System.out.println("El numero introducido no se corresponde con un mes");
        }
    }
}
