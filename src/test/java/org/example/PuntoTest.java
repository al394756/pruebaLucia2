package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PuntoTest {

    @Test
    public void test(){
        Punto punto = new Punto();
        assertTrue(punto.isActivo());
        punto.setActivo(false);
        assertFalse(punto.isActivo());
        punto.setX(2);
        assertEquals(2,punto.getX());
    }

}