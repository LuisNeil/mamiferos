package org.ltejeda.clasesabstractas.mamiferos;

public class Felino extends Mamifero{
    protected float tamanoGarras;
    protected int velocidad;

    public Felino(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }
}
