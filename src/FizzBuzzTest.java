import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void palabraFizzBuzz1() {
        String resultadoEsperado = FizzBuzz.palabraFizzBuzz(1);
        assertEquals("1", resultadoEsperado);
    }

    @org.junit.jupiter.api.Test
    void palabraFizzBuzz2() {
        String resultadoEsperado = FizzBuzz.palabraFizzBuzz(2);
        assertEquals("2", resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void palabraFizzBuzz3() {
        String resultadoEsperado = FizzBuzz.palabraFizzBuzz(3);
        assertEquals("Fizz", resultadoEsperado);
    }
}