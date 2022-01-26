package org.ltejeda.clasesabstractas.mamiferos;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad, String especieFelino) {
        super(habitat, altura, largo, peso, tamanoGarras, velocidad);
        this.especieTigre = especieFelino;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre " + especieTigre + " caza solitario en las selvas de " +habitat;
    }

    @Override
    public String dormir() {
        return "El tigre " + especieTigre +" duerme en la selvas de " + habitat;
    }

    @Override
    public String correr() {
        return "El tigre " + especieTigre + " corre a " +velocidad + "km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge";
    }
}
