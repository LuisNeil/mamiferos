package org.ltejeda.clasesabstractas.mamiferos;

public class Perro extends Canino{

    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, int fuerzaMordida, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro africano caza en manada con una fuerte mordida de  " + fuerzaMordida + " PSI";
    }

    @Override
    public String dormir() {
        return "El perro africano duerme en " + habitat;
    }

    @Override
    public String correr() {
        return "El perro africano corre en " + habitat;
    }

    @Override
    public String comunicarse() {
        return "Los perros ladran de noche";
    }
}
