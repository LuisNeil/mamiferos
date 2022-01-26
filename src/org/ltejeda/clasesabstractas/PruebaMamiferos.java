package org.ltejeda.clasesabstractas;

import org.ltejeda.clasesabstractas.mamiferos.*;

public class PruebaMamiferos {

    public static void main(String[] args) {
        Mamifero leon = new Leon("Sur de Africa",120, 220, 190, 7.5f, 58,5,120d);
        Mamifero tigre = new Tigre("Rusia", 130,330,300,7.9f,72,"Siberiano");
        Mamifero lobo = new Lobo("Europa", 80,120,70, "Gris",2.5f, 9,"Iberico");
        Mamifero tigreBengala = new Tigre("India",110,270,220, 7.9f, 74, "Bengala");
        Mamifero guepardo = new Guepardo("Africa", 94,140,72, 4.9f, 130);
        Mamifero perro = new Perro("Africa",43,92,35, 310,"Tricolor",2.9f);

        Mamifero[] mamiferos = {leon, tigre, lobo, tigreBengala, perro, guepardo};

        for (Mamifero mamifero: mamiferos) {
            System.out.println("===============" + mamifero.getClass().getSimpleName());
            System.out.println("Habitat: " + mamifero.getHabitat());
            System.out.println("Altura: " + mamifero.getAltura());
            System.out.println("Largo: " + mamifero.getLargo());
            System.out.println("Peso: " + mamifero.getPeso());

            if(mamifero instanceof Canino){
                System.out.println("Color: " + ((Canino) mamifero).getColor());
                System.out.println("Tamano colmillos: " + ((Canino) mamifero).getTamanoColmillos());

                if(mamifero instanceof Lobo){
                    System.out.println("Especie lobo: " + ((Lobo) mamifero).getEspecieLobo());
                    System.out.println("Numero camada: " + ((Lobo) mamifero).getNumCamada());
                }

                if(mamifero instanceof Perro){
                    System.out.println("Fuerza mordida: " + ((Perro) mamifero).getFuerzaMordida());
                }
            }

            if(mamifero instanceof Felino){
                System.out.println("Tamano garras: " + ((Felino) mamifero).getTamanoGarras());
                System.out.println("Velocidad: " + ((Felino) mamifero).getVelocidad());

                if(mamifero instanceof Leon){
                    System.out.println("Potencia rugido: " + ((Leon) mamifero).getPotenciaRugidoDecibel());
                    System.out.println("Numero manada: " + ((Leon) mamifero).getNumManada());
                }

                if(mamifero instanceof Tigre){
                    System.out.println("Especie tigre: " + ((Tigre) mamifero).getEspecieTigre());
                }
            }

            System.out.println(mamifero.comer());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
            System.out.println(mamifero.dormir());

        }
    }





}
