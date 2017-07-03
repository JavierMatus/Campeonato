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
public class Producto {
    
    private String FechaEnvasado;
    private String Pais;
    private String FechaCaducidad;
    private int Lote;

    public Producto(String FechaEnvasado,String Pais,String FechaVencimiento, int Lote) {
        this.FechaEnvasado = FechaEnvasado;
        this.Pais = Pais;
        this.FechaCaducidad=FechaVencimiento;
        this.Lote = Lote;
    }

    public String getFechaEnvasado() {
        return FechaEnvasado;
    }

    public String getPais() {
        return Pais;
    }

    public String getFechaCaducidad() {
        return FechaCaducidad;
    }

    public int getLote() {
        return Lote;
    }

    public void setFechaEnvasado(String FechaEnvasado) {
        this.FechaEnvasado = FechaEnvasado;
    }

    public void setPais(String pais) {
        this.Pais = pais;
    }

    public void setFechaCaducidad(String FechaCaducidad) {
        this.FechaCaducidad = FechaCaducidad;
    }

    public void setNroLote(int Lote) {
        this.Lote = Lote;
    }
    
    
    
}
