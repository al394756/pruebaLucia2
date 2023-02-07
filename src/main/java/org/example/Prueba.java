package org.example;

public class Prueba {
    public static void main(String[] args) {
        Punto punto = new Punto();
        System.out.println(punto.isActivo());
        punto.setActivo(false);
        System.out.println(punto.isActivo());
    }
}
