/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio3dimensiones;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Desafio3dimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner intro = new Scanner(System.in);

        int alumnos, notas, asignaturas;
        float promedionotas, notamaxima, notaminima;
        float suma = 0;
        System.out.print("Ingrese cantidad de asignaturas: ");
        asignaturas = intro.nextInt();
        
        System.out.print("Ingrese cantidad de alumnos: ");
        alumnos = intro.nextInt();

        System.out.print("Ingrese cantidad de notas: ");
        notas = intro.nextInt();

        float[][][] promedio = new float[asignaturas][alumnos + 3][notas + 3];

        for (int k =0; k < asignaturas; k++){
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < notas; j++) {

                System.out.print("Ingrese nota " + (j + 1) + " del alumno " + (i + 1)+" de la asignatura "+(k+1)+ ": ");
                promedio[k][i][j] = intro.nextInt();

            }

        }
        }

        System.out.println("\n============================================");
        
        for (int k =0; k < asignaturas; k++){
            
            System.out.println("\n Asignatura: "+(k+1)+"\n");
   
        for (int i = 0; i < alumnos; i++) {

            notamaxima = promedio[k][i][0];
            notaminima = promedio[k][i][0];

            for (int j = 0; j < notas; j++) {

                suma += promedio[k][i][j];

                if (promedio[k][i][j] > notamaxima) {
                    notamaxima = promedio[k][i][j];

                }

                if (promedio[k][i][j] < notaminima) {
                    notaminima = promedio[k][i][j];
                }

            }
            promedionotas = suma / notas;

            promedio[k][i][notas] = promedionotas;
            promedio[k][i][notas + 1] = notamaxima;
            promedio[k][i][notas + 2] = notaminima;

            suma = 0;
            
        }

        for (int j = 0; j < notas; j++) {
            System.out.print("   \tN" + (j + 1));
        }

        System.out.println("\tProm\tMax\tmin");

        for (int i = 0; i < (alumnos); i++) {

            System.out.print("\nAlumno " + (i + 1) + " | ");

            for (int j = 0; j < (notas + 3); j++) {

                System.out.print(promedio[k][i][j] + "\t");
            }
            System.out.print("");
        }

        for (int i = 0; i < notas; i++) {

            notamaxima = promedio[k][0][i];
            notaminima = promedio[k][0][i];
            for (int j = 0; j < alumnos; j++) {

                suma += promedio[k][j][i];

                if (promedio[k][j][i] > notamaxima) {
                    notamaxima = promedio[k][j][i];

                }

                if (promedio[k][j][i] < notaminima) {
                    notaminima = promedio[k][j][i];
                }

            }
            promedionotas = suma / alumnos;
            promedio[k][alumnos][i] = promedionotas;
            promedio[k][alumnos + 1][i] = notamaxima;
            promedio[k][alumnos + 2][i] = notaminima;
            suma = 0;
        }

        System.out.print("\nPromedio | ");
        for (int i = 0; i < (notas); i++) {
            System.out.print(promedio[k][alumnos][i] + "\t");
        }

        System.out.print("\nMin      | ");
        for (int i = 0; i < (notas); i++) {

            System.out.print(promedio[k][alumnos + 2][i] + "\t");
        }

        System.out.print("\nMax      | ");
        for (int i = 0; i < (notas); i++) {

            System.out.print(promedio[k][alumnos + 1][i] + "\t");
        }

        System.out.println("\n============================================");
        }
    }
}
        
       