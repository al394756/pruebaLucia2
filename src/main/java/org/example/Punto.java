package org.example;

public class Punto {
    private int x;
    private int y;
    private boolean activo;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public Punto(){
        x = 0;
        y = 0;
        activo = true;
    }
    public Punto(int valor){
        x = valor;
        y = valor;
        activo = true;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                ", activo=" + activo +
                '}';
    }
}