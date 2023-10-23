public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.png";
        System.out.println("archivo = " + archivo.length());
        System.out.println("archivo = " + archivo.substring(archivo.lastIndexOf(".")+1));

    }
}
