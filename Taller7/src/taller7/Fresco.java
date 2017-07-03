/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller7;

/**
 *
 * @author Javier
 */
public class Fresco extends Producto{
    
    public Fresco(String FechaEnvasado, String Pais, String FechaVencimiento, int Lote) {
        super(FechaEnvasado, Pais, FechaVencimiento, Lote);
    }
    
    public void mostrar(){
        System.out.println("=====================Producto Fresco===================");
        System.out.println("Fecha envasado: "+getFechaEnvasado());
        System.out.println("Fecha de Caducidad: "+ getFechaCaducidad());
        System.out.println("País de origen: "+getPais());
        System.out.println("Número de lote: "+getLote());
    }
    
}
