/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner intro = new Scanner(System.in);

        int N, buscar, esta = 0, posicion = 0;

        System.out.println("Ingrese número de celdas");
        N = intro.nextInt();

        int[] numero = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese número para la celda " + i + ":");
            numero[i] = intro.nextInt();
        }

        System.out.println("Ingrese número a buscar");
        buscar = intro.nextInt();

        for (int i = 0; i < N; i++) {

            if (buscar == numero[i]) {
                esta = 1;
                posicion = i;
                break;
            }
        }

        if (esta == 1) {
            System.out.println("El numero " + buscar + " está en el arreglo, en la celda: " + posicion);
        }
        if (esta == 0) {
            System.out.println("El numero " + buscar + " no está en el arreglo");
        }

        


        
        
        
     
        
        
        
    }
    
}
