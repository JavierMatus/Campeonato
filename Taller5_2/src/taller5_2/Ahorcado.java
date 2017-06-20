/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5_2;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Ahorcado {

    String[] palabras = new String[10];
    int vidas = 5;

    public String PalabraAleat() {
        String palab;

        palabras[0] = "macbook";
        palabras[1] = "locomotora";
        palabras[2] = "refrigerador";
        palabras[3] = "edificio";
        palabras[4] = "escribir";
        palabras[5] = "secuencial";
        palabras[6] = "trascendente";
        palabras[7] = "empatia";
        palabras[8] = "libertad";
        palabras[9] = "deambular";

        return palabras[(int) (Math.random() * 10)];

    }

    public void Juego() {
        int aux=0;
        int cont = 0, puntaje = 0;
        Scanner intro = new Scanner(System.in);
        String palab = PalabraAleat();
        String largo = "";
        String[] palabra = new String[palab.length()];

        for (int i = 0; i < palab.length(); i++) {
            palabra[i] = "_";

            System.out.print("_ ");
        }
        System.out.println("\n");

        for (int i = 0; i < vidas; i = 0) {
            

            System.out.print("Ingrese una letra: ");
            String letra = intro.next();

            for (int j = 0; j < palab.length(); j++) {

                if (letra.charAt(0) == palab.charAt(j)) {

                    palabra[j] = letra;
                    cont++;

                } else {
                    aux++;

                }

            }

            for (int j = 0; j < palab.length(); j++) {
                System.out.print(palabra[j] + " ");

            }
            System.out.println("\n");

            if (cont == palab.length()) {
                System.out.println("Felicidades, has ganado!");
                System.out.println("Tu puntaje fué: " + puntaje + " puntos");

                System.exit(0);
            }

        }
        
        puntaje = 10 * aux;
        if (puntaje == 0) {
            System.out.println("Perdiste");

        }

        System.out.println("Tu puntaje fué: " + puntaje + " puntos");

    }

}
