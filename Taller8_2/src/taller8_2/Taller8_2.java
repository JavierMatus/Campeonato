/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Taller8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner intro = new Scanner(System.in);
        boolean Error;
        
        do {
            Error = false;
            System.out.println("Ingrese la ruta completa del archivo");
            String ruta = intro.nextLine();
            Path archivo = Paths.get(ruta);
            String texto;
            try {

                texto = new String(Files.readAllBytes(archivo));
                Agenda telef = new Agenda(texto,archivo);

            } catch (IOException e) {
                Error = true;
                System.out.println("El archivo no pudo ser leído ó no se encuentra en la ruta entregada\n");

            }

        } while (Error == true);
    }
    
}
