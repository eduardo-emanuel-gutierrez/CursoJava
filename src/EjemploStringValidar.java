public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        //queremos evitar los NullPointerException
        boolean esNulo = curso==null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            //System.out.println("curso = " + curso.toUpperCase());//arroja un error del tipo NullPointerException
            curso = "Programacion Java";
        }

        int esVacio =  curso.length();// para saber si es distinto de vacio (contiene algo)
        System.out.println("Bienvenido al curso "+curso);
        //Imprime Bienvenido el curso null, en caso de ser nulo
        //esto no sera asi con el metodo concat
        if (esVacio>0) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

        boolean esVacio2 = curso.isEmpty();

        if (!esVacio2) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

        boolean esBlanco = curso.isBlank();//retorna true si la cadena esta vacia, es nula o esta en blanco

        if (!esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
