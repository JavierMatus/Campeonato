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
public class Agua extends Congelado {
    private int gramos;

    public Agua(String FechaEnvasado, String Pais, String FechaVencimiento, int Lote, String Temp, int gramos) {
        super(FechaEnvasado, Pais, FechaVencimiento, Lote, Temp);
        this.gramos=gramos;
    }
    
    

    public int getGramos() {
        return gramos;
    }

    public void setGramos(int gramos) {
        this.gramos = gramos;
    }
    
    public void mostrar(){
        System.out.println("===============Producto Congelado por Agua================");
        System.out.println("Fecha envasado: "+getFechaEnvasado());
        System.out.println("Fecha de Caducidad: "+ getFechaCaducidad());
        System.out.println("País de origen: "+getPais());
        System.out.println("Número de lote: "+getLote());
        System.out.println("Temperatura de mantenimiento recomendada: "+getTemp());
        System.out.println("Salinidad del agua: "+getGramos()+" grs/l");
    }
}
    
    
  