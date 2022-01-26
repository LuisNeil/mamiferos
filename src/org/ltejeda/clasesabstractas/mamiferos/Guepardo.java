package org.ltejeda.clasesabstractas.mamiferos;

public class Guepardo extends Felino{

    public Guepardo(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo caza en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El guepardo es el felino mas rapido del mundo y corre a " + velocidad +" km/h";
    }

    @Override
    public String comunicarse() {
        return "El guepardo ruge";
    }
}
