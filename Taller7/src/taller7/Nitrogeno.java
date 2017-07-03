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
public class Nitrogeno extends Congelado {
    
    private int tiempo;
    private String metodo;
    
    public Nitrogeno(String FechaEnvasado, String Pais, String FechaVencimiento, int Lote, String Temp, String metodo, int tiempo) {
        super(FechaEnvasado, Pais, FechaVencimiento, Lote, Temp);
        this.metodo=metodo;
        this.tiempo=tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    
    public void mostrar(){
        System.out.println("=============Producto Congelado por Nitrógeno=============");
        System.out.println("Fecha envasado: "+getFechaEnvasado());
        System.out.println("Fecha de Caducidad: "+ getFechaCaducidad());
        System.out.println("País de origen: "+getPais());
        System.out.println("Número de lote: "+getLote());
        System.out.println("Temperatura de mantenimiento recomendada: "+getTemp());
        System.out.println("El metodo de congelación fue: "+getMetodo());
        System.out.println("Tiempo de congelación: "+getTiempo()+" segundos");
    }
    
    
}
