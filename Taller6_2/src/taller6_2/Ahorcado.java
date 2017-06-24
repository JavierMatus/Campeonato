/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javier
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

        return palabras[(int) (Math.random()*10)];

    }

    public void Inicio() {
        ArrayList<String> LetrasIngresadas = new ArrayList<String>();

        Scanner intro = new Scanner(System.in);

        boolean achunte = false;
        int acceso = 0;
        int cont = 0;
        String letra;
        String palab = PalabraAleat();

        String[] palabra = new String[palab.length()];

        for (int i = 0; i < palab.length(); i++) {
            palabra[i] = "_";

            System.out.print("_ ");
        }
        System.out.println("\n");

        for (int i = 0; i < vidas; i = 0) {
            achunte = false;
            do {

                System.out.print("Ingrese una letra: ");
                letra = intro.nextLine();

                for (int j = 0; j < LetrasIngresadas.size(); j++) {
                    if (LetrasIngresadas.get(j).equals(letra)) {
                        System.out.println("Ya habías elegido esta letra, escoge otra");
                        acceso = 1;
                        break;
                    } else {
                        acceso = 0;
                    }
                }

                if (letra.length() != 1) {
                    System.out.println("Error, has ingresado más de una letra");

                }

            } while ((letra.length() != 1) || (acceso == 1));

            LetrasIngresadas.add(letra);

            for (int j = 0; j < palab.length(); j++) {

                if (letra.charAt(0) == palab.charAt(j)) {

                    palabra[j] = letra;
                    cont++;
                    achunte = true;

                }

            }

            if (achunte == false) {
                vidas = (vidas - 1);
            }

            for (int j = 0; j < palab.length(); j++) {
                System.out.print(palabra[j] + " ");

            }

            System.out.println("Tienes " + vidas + " vidas\n");

            for (int j = 0; j < palab.length(); j++) {

            }

            if (cont == palab.length()) {
                System.out.println("Felicidades, has ganado!");

                System.out.println("Tu puntaje fue: " + (vidas * 10) + " puntos");

                System.exit(0);
            }

        }

        if (vidas == 0) {
            System.out.println("Perdiste");

        }

        System.out.println("Tu puntaje fué: " + vidas + " puntos");

    }
}
