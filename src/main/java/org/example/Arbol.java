package org.example;

public class Arbol implements Mascota{
    @Override
    public void hazSonido() {
        System.out.println("UUUUUUU");
    }

    @Override
    public void getNombreMascota() {
        System.out.println("Soy un arbol, no tengo nombre");
    }


}
