package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PuntoTest {
    Punto punto;
    @BeforeEach
    public void principio(){
        punto = new Punto();
    }
    @Test
    public void test(){
        assertTrue(punto.isActivo());
        punto.setActivo(false);
        assertFalse(punto.isActivo());
        punto.setX(2);
        assertEquals(2,punto.getX());
    }

    @Test
    public void test2(){
        punto.prueba(6);
        assertFalse(punto.isActivo());
        assertEquals(5,punto.getX());
        assertEquals(12,punto.getY());
    }

}