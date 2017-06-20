/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6_1;

/**
 *
 * @author Javier
 */
public class Persona {
    //Atributos

    private String nombre;
    private int sueldo;
    private Tarjeta tarjeta;
    private int contraseña;

    //Metodos
    //Constructor(iniciara con nombre, sueldo y contraseña)
    public Persona(String nombre, int sueldo, int contraseña) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.contraseña = contraseña;
        System.out.println("Persona creada... ");
        this.tarjeta = new Tarjeta(this.nombre, 5, 10);
        this.tarjeta.mostrarTarjeta(tarjeta.getTarjeta());
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return this.sueldo;
    }

    public Tarjeta getTarjeta() {
        return this.tarjeta;
    }

    public int getContraseña() {
        return contraseña;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getCoordenada(int x, int y) {

        return tarjeta.CoordenadaSelec(tarjeta.getTarjeta(), x, y);
    }

    public void Tarjeta2() {

        tarjeta.mostrarTarjeta2(tarjeta.getTarjeta2());

    }

    public int getCoordenada2(int x, int y) {

        return tarjeta.CoordenadaSelec(tarjeta.getTarjeta2(), x, y);
    }

}
