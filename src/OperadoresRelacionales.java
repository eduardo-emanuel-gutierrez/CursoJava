public class OperadoresRelacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        System.out.println("(m==true) = " + (m==true));
        System.out.println("(k>=l) = " + (k>=l));
        System.out.println("(k<=l) = " + (k<=l));
        System.out.println("(i!=j) = " + (i!=j));//true
        boolean b1 = 1 == j;//false
        System.out.println("b1 = " + b1);

        
        boolean b2 = i > j;//false
        System.out.println("b2 = " + b2);
        System.out.println("!b2 = " + !b2);
        
        
        boolean b3 = j > i;//true
        System.out.println("b3 = " + b3);

        System.out.println("(b3==true) = " + (b3==true));

        System.out.println("(3<=4) = " + (3<=4));
        System.out.println("(4>=4) = " + (4>=4));
        
        
        
    }
}
