/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;



public class Cars extends Thread {
    String nombre;
    int limite;
    int aux;
    int azar;
    JLabel label;
    int win;
    Ganador ganador = new Ganador();

    public Cars(String nombre, int limite,JLabel label) {
        this.nombre = nombre;
        this.limite = limite;
        this.label = label;
    }
    

    
    
    public void azar(){
        
        azar = (int) (Math.random()*5 + 1);
        
    }

    @Override
    public void run(){
        
        azar();
        for (int i = azar; i < limite; i= i + azar ){
           
            try {
                if ((i>525)&&(aux==2)) {
                    System.out.println(nombre+" ha pasado por el tercer punto de control");
                    aux++;
                }else{
                    if ((i>350)&&(aux==1)) {
                        System.out.println(nombre+" ha pasado por el segundo punto de control");
                    aux++;
                    }else{
                        if ((i>175)&&(aux==0)) {
                            System.out.println(nombre+" ha pasado por el primer punto de control");
                    aux++;
                        }
                    }
                }
                label.setLocation(i,0);
                Thread.sleep(100);
                azar();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

           
        if (ganador.getGanador()==0) {
            System.out.println("HOLA");
            
            ganador.setGanador(100);
        }
        
       
   
        
        yield();
        
        

    }
    
   

   
}
