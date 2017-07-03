package taller8_1_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Taller8_1_1 {

    private String texto;

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        boolean Error;

        do{
        Error=false;
        System.out.println("Ingrese la ruta completa del archivo");
        String ruta = intro.next();
        Path archivo = Paths.get(ruta);
        String texto;
        try {
            
            texto = new String(Files.readAllBytes(archivo));
            System.out.println("El texto dice:\n");
            System.out.println(texto);
            Operacion txt = new Operacion(texto);

            System.out.println("\nNúmero de caracteres del archivo: " + txt.ContCaract());
            System.out.println("Número de palabras: " + txt.ContPalab());
            System.out.println("Número de lineas: " + txt.ContLin());

        } catch (IOException e) {
            Error =true;
            System.out.println("El archivo no pudo ser leído ó no se encuentra en la ruta entregada\n");
           
        }
        
        

    
        }while(Error==true);
        
    }

}
