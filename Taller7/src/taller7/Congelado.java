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


public class Congelado  extends Producto {
    
    private String Temp;
    
    public Congelado(String FechaEnvasado, String Pais, String FechaVencimiento, int Lote, String Temp) {
        super(FechaEnvasado, Pais, FechaVencimiento, Lote);
        this.Temp=Temp;
    }

    public String getTemp() {
        return Temp;
    }

    public void setTemp(String Temp) {
        this.Temp = Temp;
    }
    
    
    
}
