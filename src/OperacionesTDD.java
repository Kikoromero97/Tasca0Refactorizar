public class OperacionesTDD {
    public static int suma (String numeros) {
        String[] numerosSeparados = numeros.split(",");
        int cantidadNumeros = 0;
        boolean contieneNegativo = false;
        boolean contieneNumeroAlto = false;
        if (numeros.endsWith(",") || numeros.startsWith(",")) {
            cantidadNumeros = -1;
        } else if (!numeros.equals("")) {
            for (String numerosSeparado : numerosSeparados) {
                int numero = Integer.parseInt(numerosSeparado);
                if (numero < 0) {
                    contieneNegativo = true;
                    break;
                } else if (numero > 1000) {
                    contieneNumeroAlto = true;
                    break;
                }
                cantidadNumeros += numero;
            }
        }

        if (contieneNegativo) {
            cantidadNumeros = -1;
            System.err.println("Número negativo no permitido.");
        }
        if (contieneNumeroAlto) {
            System.err.println("Numero superior a 1000 ignorado.");
        }
        return cantidadNumeros;
    }
}
