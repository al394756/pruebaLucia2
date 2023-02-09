package org.example;

public class Mamifero extends Animal implements Mascota{
    private int patas;

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public void hazSonido() {
        System.out.println("Guau Guau");
    }

    @Override
    public void getNombreMascota() {
        System.out.println(getNombre());
    }


}
