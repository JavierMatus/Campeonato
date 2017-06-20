/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6_1;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Javier
 */
public class Tarjeta {

    //Atributos
    private int[][] tarjeta;
    private int[][] tarjeta2;
    private int alto = 5;
    private int ancho = 10;
    private String nombre;

    //Metodos
    //Constructor
    public Tarjeta(String nombre, int a, int b) { //Iniciara con nombre, alto y ancho
        this.nombre = nombre;
        this.alto = a;
        this.ancho = b;
        int[] lista = crearLista();
        this.tarjeta = crearTarjeta(lista);
        this.tarjeta2 = crearTarjeta2(lista);
    }

    //Getters  //No reciben parametros
    public int[][] getTarjeta() {
        return this.tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setTarjeta(int[][] tarjeta) { //Recibe int[][]
        this.tarjeta = tarjeta;
    }

    public void setNombre(String nombre) { //Recibe String
        this.nombre = nombre;
    }

    //Funciones(Metodos adicionales)
    //Crear una lista, num aleatorios entre 99 y 1000
    public int[] crearLista() {

        Date semilla = new Date();
        Random rnum = new Random(semilla.getTime());

        int largo = this.ancho * this.alto;
        int[] lista = new int[largo];

        for (int i = 0; i < largo; i++) {
            lista[i] = (int) (100 + rnum.nextInt(900));
        }

        return lista;
    }

    //Ordenar la lista de mayor a menor
    public int[] ordenarLista(int[] lista) {

        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - 1; j++) {

                if (lista[j] > lista[j + 1]) {

                    int aux = lista[j + 1];

                    lista[j + 1] = lista[j];
                    lista[j] = aux;
                }
            }
        }

        return lista;
    }

    //Crear tarjeta: toma la lista ORDENADA y le asigna una pos en matriz de enteros
    public int[][] crearTarjeta(int[] lista) {

        int[][] matriz = new int[this.alto][this.ancho];
        int contador = 0;

        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                matriz[i][j] = lista[contador];
                contador++;
            }
        }

        return matriz;
    }

    //Mostrar tarjeta: mostrar por consola la estructura de la tarjeta de coord que se le asigno a una persona
    public void mostrarTarjeta(int[][] matriz) {

        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }
    }

    public int CoordenadaSelec(int[][] matriz, int x, int y) {

        return matriz[x][y];

    }

    public int[][] getTarjeta2() {
        return this.tarjeta2;
    }

    public void mostrarTarjeta2(int[][] matriz) {

        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }
    }

    public int[][] crearTarjeta2(int[] lista) {

        int[][] matriz = new int[this.alto][this.ancho];
        int contador = 0;

        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                matriz[i][j] = lista[contador];
                contador++;
            }
        }

        return matriz;
    }

}
