/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_4;

/**
 *
 * @author dci
 */
public class Operacion {

    int numero, cont_par, cont_impar, suma, promedio, aux = 0;
    int[] numeros = new int[numero];

    public Operacion(int num) {
        this.numero = num;
    }

    public void GenerarLista() {
        for (int i = 0; i < numero; i++) {
            numeros[i] = (int) (Math.random() * (100) + 100);
        }
    }

    public void ParImpar() {
        for (int i = 0; i < numero; i++) {
            if (numeros[i] % 2 == 0) {

                cont_par++;
            } else {
                cont_impar++;

            }

        }
    }

    public void Promedio() {
        for (int i = 0; i < numero; i++) {
            suma += numeros[i];
            promedio = suma / numero;
        }
    }

    public void Orden() {
        for (int i = 0; i < numero; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        
        for (int i = 0; i < numero; i++) {
            System.out.println(""+numeros[i]);
        }
    }

   
    
    
    

}
