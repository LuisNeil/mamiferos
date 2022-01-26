package org.ltejeda.clasesabstractas.mamiferos;

public class Lobo extends Canino{
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + especieLobo + " caza junto a su grupo de " + numCamada + " individuos en los bosques de "
                + habitat;
    }

    @Override
    public String dormir() {
        return "El lobo duerme en las cuevas de " + habitat;
    }

    @Override
    public String correr() {
        return "El lobo " + especieLobo + " corre en los bosques de " + habitat;
    }

    @Override
    public String comunicarse() {
        return "El lobo " + especieLobo + " " + color + " aulla en luna llena" ;
    }
}
