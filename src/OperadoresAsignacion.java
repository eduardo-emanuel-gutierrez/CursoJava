public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;//asignamos el valor 5 a la variable i
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2;//i = i + 7
        System.out.println("i = " + i);

        i -= 4;//i = i - 4
        System.out.println("i = " + i);

        j*=i;//j = j * i
        System.out.println("j = " + j);

        String sqlString = "SELECT * FROM clientes AS c";
        sqlString += "WHERE c.nombre = 'Andres'";
        sqlString += " AND c.activo=1;";
        System.out.println("sqlString = " + sqlString);

    }
}
