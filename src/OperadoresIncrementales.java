public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento
        int i = 1;
        System.out.println("valor inicial de i = " + i);
        int j = ++i;
        System.out.println("i = " + i);//2
        System.out.println("j = " + j);//2

        //Post incremento
        i = 2;
        System.out.println("valor inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);//3
        System.out.println("j = " + j);//2

        //Pre decremento
        i = 4;
        System.out.println("valor inicial de i = " + i);
        j = --i;
        System.out.println("i = " + i);//3
        System.out.println("j = " + j);//3

        //Post decemento
        i = 3;
        System.out.println("valor inicial de i = " + i);
        j = i--;
        System.out.println("i = " + i);//2
        System.out.println("j = " + j);//3

        System.out.println("++j = " + (++j));//4
        System.out.println("j++ = " + (j++));//4
        System.out.println("j = " + j);//5

        i = 4;

        System.out.println("--i = " + (--i));//3
        System.out.println("i-- = " + (i--));//3
        System.out.println("i = " + i);//2

    }
}
