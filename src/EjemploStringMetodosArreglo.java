public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();//arreglo de caracteres
        int tamaño = arreglo.length;//en este caso length es un atributo, en un string es un metodo
        for (char letra: arreglo) {
            System.out.println("letra = " + letra);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        String arreglo2[] = trabalenguas.split("a");//arreglo de strings
        for (String corte : arreglo2) {
            System.out.println("corte = " + corte);
        }

        String archivo = "una.imagen.jpg";
        String[] arregloArchivo = archivo.split("\\.");//el punto debe ser escapado, ya que es un caracter
        //reservado para expresiones regulares, tambien en ves de \\. podriamos poner [.]
        for (String termino : arregloArchivo) {
            System.out.println("termino = " + termino);
        }

        System.out.println("La extension del archivo es = " + arregloArchivo[arregloArchivo.length-1]);



    }
}
