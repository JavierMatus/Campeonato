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
    

    public Operacion(int num) {
        
        this.numero = num;
        
    }

    public void GenerarLista(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100)+100;
        }
    }

    public void ParImpar(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {

                cont_par++;
                
            } else {
                cont_impar++;

            }

        }
        
        System.out.println("Hay "+cont_par+" numeros pares");
        System.out.println("Hay "+cont_impar+" numeros impares");
    }

    public void Promedio(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            promedio = suma / numero;
        }
        
        System.out.println("El proemdio es "+promedio);
    }

    public void Orden(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        System.out.println("====================Lista====================");
        for (int i = 0; i < numeros.length; i++) {
          
            System.out.println(numeros[i]);
        }
    }
    
    public void Nrorepetido(int numeros[]) {
         int aux = 0, cont = 0, repetido = -1; 
        
        for (int i=0; i < numeros.length-1; i++){
            aux = 1;
            for(int j = i+1 ; j< numeros.length; j++){
                if(numeros[i] == numeros[j])
                    aux ++;                
            }
            if(aux > cont){
                cont = aux;
                repetido = numeros[i];
            }
        }
        
        System.out.println("EL numero que más se repite es el "+repetido+" con una cantidad de "+ cont+" veces");

    }
    
    
    
    public void MostrarTodo(int matriz[]) {
        GenerarLista(matriz);
        ParImpar(matriz);
        Promedio(matriz);
        Nrorepetido(matriz);
        Orden(matriz);
       
        
    }

   
    
    
    

}
