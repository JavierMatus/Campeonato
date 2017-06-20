/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_4;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Taller5_4 {

    
    public static void main(String[] args) {
        
        
        Scanner intro = new Scanner(System.in);
        int num;
        
        
                
        System.out.println("Elegir un nùmero entre 100 y 200");
        num = intro.nextInt();
        
        int [] numeros = new int [num];
        
       
        
        if ((num<100)||(num>200)) {
            System.out.println("Nùmero ingresado fuera de rango");
            System.exit(0); 
        }
        
        Operacion n = new Operacion(num);
        
        n.MostrarTodo(numeros);
        

        
    }
    
}
