package org.ltejeda.clasesabstractas.mamiferos;

public abstract class Mamifero {

    protected String habitat;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

    public Mamifero() {
    }

    public Mamifero(String habitat, float altura, float largo, float peso) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    public Mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public Mamifero(String habitat, float altura, float largo, float peso, String color, float tamanoColmillos) {

    }

    public String getHabitat() {
        return habitat;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();
}
