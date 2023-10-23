public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Eduardo";
        System.out.println("nombre = " + nombre);
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.equals(\"Eduardo\") = " + nombre.equals("Eduardo"));
        System.out.println("nombre.equalsIgnoreCase(\"eduardo\") = " + nombre.equalsIgnoreCase("eduardo"));
        System.out.println("nombre.compareTo(\"Eduardo\") = " + nombre.compareTo("Eduardo"));//compara por orden lexicografico
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));// retorna la E
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1, ) = " + nombre.substring(1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("lenguas","lengua"));
        System.out.println("trabalenguas.indexOf(\"len\") = " + trabalenguas.indexOf("len"));//2
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));//10
        System.out.println("trabalenguas.contains(\"traba\") = " + trabalenguas.contains("traba"));//true
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));//true
        System.out.println("trabalenguas.endsWith(\"a\") = " + trabalenguas.endsWith("s"));//true
        System.out.println("  trabalenguas ".trim());//quita espacios en blanco
        
    }
}
