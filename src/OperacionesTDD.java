public class OperacionesTDD {
    public static int suma (String numeros) {
        String[] numerosSeparados = numeros.split(",");
        int cantidadNumeros = 0;
        boolean contieneNegativo = false;
        if (numeros.endsWith(",") || numeros.startsWith(",")) {
            cantidadNumeros = -1;
        } else if (!numeros.equals("")) {
            for (String numerosSeparado : numerosSeparados) {
                int numero = Integer.parseInt(numerosSeparado);
                if (numero < 0) {
                    contieneNegativo = true;
                    break;
                }
                cantidadNumeros += numero;
            }
        }

        if (contieneNegativo) {
            cantidadNumeros = -1;
            System.err.println("Número negativo no permitido");
        }
        return cantidadNumeros;
    }
}
