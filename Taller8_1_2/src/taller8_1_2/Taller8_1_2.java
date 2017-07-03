/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8_1_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Taller8_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);
        boolean Error;
        do {
            Error = false;
            System.out.println("Ingrese la ruta completa del archivo");
            String ruta = intro.next();
            Path archivo = Paths.get(ruta);
            String texto;
            try {

                texto = new String(Files.readAllBytes(archivo));
                Buscar(texto);
                

            } catch (IOException e) {
                Error = true;
                System.out.println("El archivo no pudo ser leído ó no se encuentra en la ruta entregada\n");

            }

        } while (Error == true);
        
        
        

    }
    
    public static void Buscar(String txt){
        Scanner intro = new Scanner(System.in);
        int cont = 0;
        System.out.println("¿Qué palabra desea buscar?");
        String TextoBuscado = intro.nextLine();
        
        
        
        while (txt.indexOf(TextoBuscado) > -1) {
	      txt = txt.substring(txt.indexOf(
	        TextoBuscado)+TextoBuscado.length(),txt.length());
	      cont++; 
	    }
        
        System.out.println("La palabra ´"+TextoBuscado+"´ se repite: "+cont+" veces.");
        
        
        
    }

}
