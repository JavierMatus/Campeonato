/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_2;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Problema_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int largo;
        System.out.println("¿Cuál es el largo de la carrera?");
        largo = intro.nextInt();
        
        Carrera race = new Carrera(largo);
        
        for (int i = 0; i < 10; i++) {
            
            
            
            System.out.println("==================");
            race.RecMayor();
            System.out.println("==================");
        }
    
    
    }
    
}
