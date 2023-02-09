package org.example;

import org.example.Animal;

public class Peces extends Animal implements Mascota{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hazSonido() {
        System.out.println("BluBluBlu");
    }

    @Override
    public void getNombreMascota() {
        System.out.println(getNombre());

    }

}
