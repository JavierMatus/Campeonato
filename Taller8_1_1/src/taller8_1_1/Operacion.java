/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8_1_1;


import java.util.StringTokenizer;

/**
 *
 * @author Javier
 */
public class Operacion {

    private String Texto;

    public Operacion(String text) {
        this.Texto = text;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public int ContPalab() {
        StringTokenizer a = new StringTokenizer(Texto);
        return a.countTokens();

    }

    public int ContCaract() {
        return Texto.length();

    }

    public int ContLin() {
        int cont = 1;

        for (int i = 0; i < Texto.length(); i++) {
            if (Texto.charAt(i) == '\n') {
                cont++;
            }
        }

        return cont;

    }

}
