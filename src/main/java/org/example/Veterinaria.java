package org.example;

import java.util.LinkedList;
import java.util.List;

public class Veterinaria {
    static List<Mascota> listaAnimales = new LinkedList<>();

    public static void main(String[] args) {
        Mamifero perro = new Mamifero();
        perro.setPeso(20);
        perro.setNombre("Milaneso");
        perro.setTamano(50);
        perro.setPatas(4);
        listaAnimales.add(perro);
        Peces pez = new Peces();
        pez.setNombre("Nemo");
        pez.setPeso(20);
        pez.setTamano(2);
        pez.setColor("Amarillo");
        listaAnimales.add(pez);
        Arbol arbol = new Arbol();
        listaAnimales.add(arbol);

        for (Mascota masc: listaAnimales){
            masc.getNombreMascota();
            masc.hazSonido();
        }
    }
}
