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
public class Taller7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Fresco producto1 = new Fresco("30-06-2017","Chile","30-7-2017",143);
        producto1.mostrar();
        
        Fresco producto2 = new Fresco("15-06-2017","Argentina","20-7-2017",144);
        producto2.mostrar();
        
        
        Refrigerado producto3 = new Refrigerado("15-05-2017","Argentina","15-12-2017",142,"UA70115","-10°C");
       producto3.mostrar();
        
       Refrigerado producto4 = new Refrigerado("05-05-2017","Perú","05-11-2017",134,"UA70184","-8°C");
       producto4.mostrar();
       
       Refrigerado producto5 = new Refrigerado("13-01-2017","Chile","13-10-2017",124,"UA70215","-7°C");
       producto5.mostrar();
       
       
       Aire producto6 = new Aire("12-05-2017","Brazil","12-12-2018",153,"-40C",23,50,7,20);
       producto6.mostrar();
       
       Aire producto7 = new Aire("02-07-2017","Chile","15-11-2018",148,"-50C",33,45,5,17);
       producto7.mostrar();
       
       Agua producto8 = new Agua("14-05-2017","China","25-10-2018",149,"-45C",15);
       producto8.mostrar();
       
       Agua producto9 = new Agua("12-04-2017","Japón","05-09-2018",120,"-55C",20);
       producto9.mostrar();
       
       Nitrogeno producto10 = new Nitrogeno("24-02-2017","Japón","28-12-2018",110,"-65C","Nitrógeno Líquido",30);
       producto10.mostrar();
       
        
        
    }
    
}
