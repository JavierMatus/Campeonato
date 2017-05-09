/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int dias = 30, promedio, suma = 0, posicionmayor = 0, posicionmenor = 0, saldomayor = 0;
        int[] ventas = new int[dias];

        for (int i = 0; i < dias; i++) {

            do {
                System.out.println("Total ventas diarias en el día " + (i + 1) + " :");
                ventas[i] = teclado.nextInt();

                if (ventas[i] < 0) {
                    System.out.print("Cantidad invalida, intente nuevamnete");
                }
            } while (ventas[i] < 0);

        }

        for (int i = 0; i < dias / 2; i++) {

            suma += ventas[i];
        }

        promedio = suma / dias / 2;
        System.out.print("El promedio de ventas de los primeros 15 días es :$" + promedio+"");
        

        for (int i = 0; i < dias; i++) {
            if (ventas[i] > 345000) {
                
                System.out.print("El día " + (i + 1) + " se registraron ventas mayores a 345000");
                
            }
            
        }
        

        int saldomenor = ventas[0];
        for (int i = 0; i < dias; i++) {
            if (ventas[i] < saldomenor) {
                saldomenor = ventas[i];
                posicionmenor = i;
            }
        }
        
        
        System.out.println("El saldo menor se registro en el dia " + (posicionmenor + 1) + " con ventas de $:" + saldomenor);

        for (int i = 0; i < dias; i++) {
            if (ventas[i] > saldomayor) {
                saldomayor = ventas[i];
                posicionmayor = i;
            }
        }
        
        System.out.println("El saldo mayor se registro en el dia " + (posicionmayor + 1) + " con ventas de $:" + saldomayor);

    }
}
