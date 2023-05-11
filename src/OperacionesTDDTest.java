import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    void OperacionesTDD1() {
        int resultadoEsperado = OperacionesTDD.suma("");
        assertEquals(0, resultadoEsperado);
    }
    @Test
    void OperacionesTDD2() {
        int resultadoEsperado = OperacionesTDD.suma("1");
        assertEquals(1, resultadoEsperado);
    }
    @Test
    void OperacionesTDD3() {
        int resultadoEsperado = OperacionesTDD.suma("1,2");
        assertEquals(3, resultadoEsperado);
    }
    @Test
    void OperacionesTDD4() {
        int resultadoEsperado = OperacionesTDD.suma("1,1,2");
        assertEquals(4, resultadoEsperado);
    }
    @Test
    void OperacionesTDD5() {
        int resultadoEsperado = OperacionesTDD.suma("1,2,");
        assertEquals(-1, resultadoEsperado);
    }
    @Test
    void OperacionesTDD6() {
        int resultadoEsperado = OperacionesTDD.suma("1,2,-2");
        assertEquals(-1, resultadoEsperado);
    }
    @Test
    void OperacionesTDD7() {
        int resultadoEsperado = OperacionesTDD.suma("5,1002");
        assertEquals(5, resultadoEsperado);
    }
}