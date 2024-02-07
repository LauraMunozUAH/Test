package es.uah.matycomp.edu.ejemplos;
import static org.junit.jupiter.api.Assertions.*;

class JugandoTest {
    @org.junit.jupiter.api.Test
    void tocaVariables(){
        Jugando j = new Jugando();
        assertDoesNotThrow(()->j.tocaVariables());
    }
    @org.junit.jupiter.api.Test
    void estructurasDeControl(){
        Jugando j = new Jugando();
        assertDoesNotThrow(()->j.estructurasDeControl());
    }
    @org.junit.jupiter.api.Test
    void getSegundos(){
        Jugando j = new Jugando();
        long rdo = j.getSegundos();
        assertNotEquals(rdo,  0L);
        assertTrue((rdo>0), "Error, es menor o igual a 0");
    }
}