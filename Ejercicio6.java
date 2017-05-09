/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Ejercicio6 {



	public static void main (String []args){
		
		
		Scanner teclado = new Scanner (System.in);
                
                int saldo_mayor = 0;
		int posicion = 0;
                int meses;
                int suma = 0;
                
                
                do{
                
		System.out.print("Ingrese la cantidad de meses que desea evaluar : ");
		meses = teclado.nextInt();
                
                if (meses <1 || meses >12){
                    System.out.print("Cantidad invalida, ingrese nuevamente");
	
                }
                
                }while ((meses < 1)||(meses>12));
			
		

		int []ingresos = new int [meses];

		
		for(int i = 0; i < meses; i++){
			System.out.print("Ingrese saldo del mes "+(i+1)+" $:");
			ingresos[i] = teclado.nextInt();
		}

		for(int i = 0; i < meses; i++){
			if(ingresos[i] < 0){
				System.out.println("Se encontró saldo negativo en el mes "+(i+1));
			}
			else{
				System.out.println("No se encontraron saldos negativos en el mes "+(i+1));
			}
		}
		
		
		
		for(int i = 0; i < meses; i++){
			if(ingresos[i] > saldo_mayor){
				saldo_mayor = ingresos[i];
				posicion = i;
			}
		}
		System.out.println("El saldo mayor fue de: $"+saldo_mayor+" en el mes :"+(posicion+1));

		
		
		for(int i = 0; i < meses; i++){
			suma += ingresos[i];
		}
		int promedio = suma/meses;
		System.out.println("El promedio es "+promedio);


        
        
        
        
    }
    
}
