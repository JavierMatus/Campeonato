/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6_1;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Taller6_1 {

    public static int cord1, cord2;

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        String nombre;
        int sueldo, contra = 0;

        Persona Sarah = new Persona("Sarah", 28000, 3485);
        Persona Joel = new Persona("Joel", 310000, 9175);
        Persona Carolina = new Persona("Carolina", 780000, 1917);

        System.out.println("Ingrese su nombre:");
        nombre = intro.next();
        System.out.println("Digite su sueldo:");
        sueldo = intro.nextInt();
        int i = 0;

        System.out.println("Digite su contraseña de 4 dígitos");
        contra = contrasena();

        Persona persona1 = new Persona(nombre, sueldo, contra);
        System.out.println("=======================================================");
        do {
            System.out.println("Usuario " + Sarah.getNombre() + " ingrese contraseña: ");

            contra = contrasena();

            if (contra != Sarah.getContraseña()) {
                System.out.println("CONTRASEÑA INCORRECTA");
            }

        } while (contra != Sarah.getContraseña());

        cord2();
        cord1();
        System.out.println("Usuario " + Sarah.getNombre() + " ingrese el número de las coordenada en las posiciones: " + (cord2 + 1) + " numero(s) en horizontal(Derecha), " + (cord1 + 1) + " numero(s) en vertical(Abajo)");

        coordenadas(Sarah.getCoordenada(cord1, cord2));

        System.out.println("=======================================================");

        do {
            System.out.println("Usuario " + Joel.getNombre() + " ingrese contraseña: ");

            contra = contrasena();

            if (contra != Joel.getContraseña()) {
                System.out.println("CONTRASEÑA INCORRECTA");
            }

        } while (contra != Joel.getContraseña());

        cord2();
        cord1();
        System.out.println("Usuario " + Joel.getNombre() + " ingrese el número de las coordenada en las posiciones: " + (cord2 + 1) + " numero(s) en horizontal(Derecha), " + (cord1 + 1) + " numero(s) en vertical(Abajo)");

        coordenadas(Joel.getCoordenada(cord1, cord2));

        System.out.println("=======================================================");

        do {
            System.out.println("Usuario " + persona1.getNombre() + " ingrese contraseña: ");

            contra = contrasena();

            if (contra != persona1.getContraseña()) {
                System.out.println("CONTRASEÑA INCORRECTA");
            }

        } while (contra != persona1.getContraseña());

        cord2();
        cord1();
        System.out.println("Usuario " + persona1.getNombre() + " ingrese el número de las coordenada en las posiciones: " + (cord2 + 1) + " numero(s) en horizontal(Derecha), " + (cord1 + 1) + " numero(s) en vertical(Abajo)");

        coordenadas(persona1.getCoordenada(cord1, cord2));

        System.out.println("=======================================================");

        System.out.println("Al usuario " + persona1.getNombre() + " se le asignó una segunda tarjeta de coordenadas...");
        persona1.Tarjeta2();

        cord2();
        cord1();
        System.out.println("Usuario " + persona1.getNombre() + " ingrese el número de las coordenada en las posiciones de su SEGUNDA tarjeta: " + (cord2 + 1) + " numero(s) en horizontal(Derecha), " + (cord1 + 1) + " numero(s) en vertical(Abajo)");

        coordenadas(persona1.getCoordenada2(cord1, cord2));

    }

    static int entero() {
        Scanner entrada = new Scanner(System.in);
        int i = 0;

        try {
            return entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Ingresa un numero entero válido!");
            return -1;
        }
    }

    public static int contrasena() {
        Scanner intro = new Scanner(System.in);
        int i = 0;

        do {
            try {
                i = intro.nextInt();
            } catch (Exception e) {
                System.out.println("Ingresa una contraseña de 4 digitos válida!");
                i = 0;
            }
            if (i <= 999 || i >= 10000) {
                System.out.println("Ingresa una contraseña de 4 digitos válida!");
            }
        } while (i <= 999 || i >= 10000);
        return i;

    }

    public static void coordenadas(int coord) {
        Scanner intro = new Scanner(System.in);
        int resp;
        do {

            resp = intro.nextInt();
            if (coord == resp) {
                System.out.println("Correcto");

            } else {
                System.out.println("Error. Coordenada incorrecta. Ingrese nuevamenteingrese el número de las coordenada en las posiciones: " + (cord2 + 1) + " numero(s) en horizontal(Derecha), " + (cord1 + 1) + " numero(s) en vertical(Abajo)");
            }
        } while (coord != resp);

    }

    public static void cord2() {
        cord2 = (int) (Math.random() * 9 + 1);

    }

    public static void cord1() {
        cord1 = (int) (Math.random() * 4 + 1);

    }

}
