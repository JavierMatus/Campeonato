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
public class Refrigerado  extends Producto {
    
    private String Codigo;
    private String Temp;
    
    public Refrigerado(String FechaEnvasado, String Pais, String FechaVencimiento, int Lote, String Codigo, String Temp) {
        super(FechaEnvasado, Pais, FechaVencimiento, Lote);
        this.Codigo=Codigo;
        this.Temp=Temp;
    }
    
    public String getCodigo(){
        return Codigo;
        
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTemp() {
        return Temp;
    }

    public void setTemp(String Temp) {
        this.Temp = Temp;
    }
    
    
    public void mostrar(){
        System.out.println("================Producto Rrefrigerado==================");
        System.out.println("Fecha envasado: "+getFechaEnvasado());
        System.out.println("Fecha de Caducidad: "+ getFechaCaducidad());
        System.out.println("País de origen: "+getPais());
        System.out.println("Número de lote: "+getLote());
        System.out.println("Código del organismo de supervisión alimentaria: "+getCodigo());
        System.out.println("Temperatura de mantenimiento recomendada: "+getTemp());
    }
}
