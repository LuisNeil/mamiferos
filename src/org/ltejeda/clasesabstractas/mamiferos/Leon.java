package org.ltejeda.clasesabstractas.mamiferos;

public class Leon extends Felino{

    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad, int numManada,
                double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String correr(){
        return "El leon corre a velocidad " + velocidad + "km/h";
    }

    @Override
    public String comunicarse(){
        return "El leon ruge fuerte a " + potenciaRugidoDecibel + " decibeles";
    }
}
