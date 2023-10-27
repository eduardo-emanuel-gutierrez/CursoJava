import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {
        String[] nombres =  {"Andres", "Pepe", "Maria", "Juan", "Pablo","Pedro"};
        int count = nombres.length;//realizamos esto ya que es mas optimo que invocar el atributo
        //length en cada iteracion
        for (int i = 0; i < count; i++) {

            if (nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("pepe")) {
                continue;
            }
            System.out.println(nombres[i]);
        }

        String buscado = JOptionPane.showInputDialog("Ingrese el nombre buscado");
        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscado)){
                encontrado =  true;
                break;
            }
        }
        if (encontrado) {

            JOptionPane.showMessageDialog(null,buscado+" fue encontrado");
        }else JOptionPane.showMessageDialog(null,buscado+" no existe en el sistema");
    }
}
