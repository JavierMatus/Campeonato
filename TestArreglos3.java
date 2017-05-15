/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarreglos3;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class TestArreglos3 {

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        int alumnos, notas;
        float promedionotas,notamaxima,notaminima;
        float suma = 0;

        System.out.println("Ingrese cantidad de alumnos");
        alumnos = intro.nextInt();

        System.out.println("Ingrese cantidad de notas");
        notas = intro.nextInt();

        int[][] promedio = new int[alumnos][notas];

        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < notas; j++) {

                System.out.println("Ingrese nota " + (j + 1) + " del alumno " + (i + 1));
                promedio[i][j] = intro.nextInt();

            }

        }

        
        System.out.println("");
        
        for (int i = 0; i < alumnos; i++) {

            System.out.println("Nota de alumnos " + (i + 1));

            for (int j = 0; j < notas; j++) {

                System.out.print((float)promedio[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("");
        
        
        for (int i = 0; i < alumnos; i++) {
            
            notamaxima = promedio[i][0];
            notaminima = promedio[i][0];

            for (int j = 0; j < notas; j++) {

                suma += promedio[i][j];
                
                if (promedio[i][j] > notamaxima  ){
                    notamaxima = promedio[i][j];
                    
                    
                }
                
                if (promedio[i][j] < notaminima) {
                    notaminima = promedio[i][j];
                }
                
                
                
            }
            promedionotas = suma / notas;

            System.out.println("EL promedio del alumno "+(i+1)+" es " + promedionotas+". Su nota máxima es: "+notamaxima+" y su nota mínima es "+notaminima);
            System.out.println();
            
            suma = 0;
            promedionotas =0;
        }

       
        
        
        
        for (int i = 0; i < alumnos; i++) {
            
            System.out.println("Alumno "+ (i+1));
            notamaxima = promedio[i][0];
            notaminima = promedio[i][0];
            for (int j = 0; j < notas; j++) {
                
                suma += promedio[i][j];
                promedionotas = suma / (j+1);
                
                
                if (promedio[i][j] > notamaxima  ){
                    notamaxima = promedio[i][j];
                    
                    
                }
                
                if (promedio[i][j] < notaminima) {
                    notaminima = promedio[i][j];
                }
                
                
                
                
                System.out.println(" Nota "+(j+1)+": "+(float)promedio[i][j]+" promedio de notas "+promedionotas);
                System.out.println("");
                System.out.println(" Nota Màxima: "+notamaxima+" Nota mínima: "+notaminima);
                

            }
             
            suma = 0;
            System.out.println("");
            
        }
        
        for (int i = 0; i < alumnos; i++) {
            
                System.out.println("Notas azules del alumno "+(i+1));
             
            for (int j = 0; j < notas; j++) {

             if (promedio[i][j] >= 4){
                 System.out.println((float)promedio[i][j] + " ");
             }
             
             
             
            }
            System.out.println();
        }
        
        
        
        
        
        
    }

}
