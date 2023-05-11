public class FizzBuzz {
    public static String palabraFizzBuzz(int num) {
        String palabra = "";
        int end = 100;
        for (int i = num; i <= end; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                palabra = "FizzBuzz";
                break;
            } else if ((i % 3) == 0) {
                palabra = "Fizz";
                break;
            } else if ((i % 5) == 0) {
                palabra = "Buzz";
                break;
            } else {
                palabra = String.valueOf(i);
                break;
            }
        }
        return palabra;
    }
}
