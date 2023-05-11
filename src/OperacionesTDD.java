public class OperacionesTDD {
    public static int suma (String numeros) {
        String[] numerosSeparados = numeros.split(",");
        int cantidadNumeros = 0;
        if (!numeros.equals("")) {
            for (String numerosSeparado : numerosSeparados) {
                cantidadNumeros += Integer.parseInt(numerosSeparado);
            }
        }
        return cantidadNumeros;
    }
}
