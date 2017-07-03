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
public class Aire extends Congelado {
    
      
    
    private int nitrogeno,oxigeno,dioxido,vapor;
    
    public Aire(String FechaEnvasado, String Pais, String FechaVencimiento, int Lote, String Temp,int nitrogeno,int oxigeno,int dioxido,int vapor) {
        super(FechaEnvasado, Pais, FechaVencimiento, Lote, Temp);
        this.nitrogeno=nitrogeno;
        this.oxigeno=oxigeno;
        this.dioxido=dioxido;
        this.vapor=vapor;
    }

    public int getNitrogeno() {
        return nitrogeno;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public int getDioxido() {
        return dioxido;
    }

    public int getVapor() {
        return vapor;
    }

    public void setNitrogeno(int nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public void setDioxido(int dioxido) {
        this.dioxido = dioxido;
    }

    public void setVapor(int vapor) {
        this.vapor = vapor;
    }
    
    public void mostrar(){
        System.out.println("===============Producto Congelado por Aire================");
        System.out.println("Fecha envasado: "+getFechaEnvasado());
        System.out.println("Fecha de Caducidad: "+ getFechaCaducidad());
        System.out.println("País de origen: "+getPais());
        System.out.println("Número de lote: "+getLote());
        System.out.println("Temperatura de mantenimiento recomendada: "+getTemp());
        System.out.println("Nitrógeno: %"+getNitrogeno());
        System.out.println("Oxígeno: %"+getOxigeno());
        System.out.println("Dióxido: %"+getDioxido());
        System.out.println("Vapor de agua: %"+getVapor());
    }
    
    
}

    
    

