import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int rec1=0,rec2=0,rec3=0,rec4=0,vel1,vel2,vel3,vel4,recmax=100,limite=1000,cont=0;
        String ganador="";
       
        
        Square pista1 = new Square(100,50,500,"gray");
        pista1.draw();
        Square pista2 = new Square(600,50,500,"gray");
        pista2.draw();
        
        Señal control1 = new Señal(350);
        control1.draw();
        Señal control2 = new Señal(600);
        control2.draw();
        Señal control3 = new Señal(850);
        control3.draw();
      
        
        Square auto1 = new Square(100,100,50,"red");
        auto1.draw();
        Square auto2 = new Square(100,200,50,"blue");
        auto2.draw();
        Square auto3 = new Square(100,300,50,"white");
        auto3.draw();
        Square auto4 = new Square(100,400,50,"dark");
        auto4.draw();
        
        for(int i=0;recmax<limite;i++){
        vel1=(int) (Math.random()*5 + 1);    
        rec1+=vel1;
        auto1.slowMoveHorizontal(vel1);
        
        vel2=(int) (Math.random()*5 + 1);   
        rec2+=vel2;
        auto2.slowMoveHorizontal(vel2);
        
        vel3=(int) (Math.random()*5 + 1);   
        rec3+=vel3;
        auto3.slowMoveHorizontal(vel3);
        
        vel4=(int) (Math.random()*5 + 1);   
        rec4+=vel4;
        auto4.slowMoveHorizontal(vel4);
        
        if(rec1>recmax){
            recmax=rec1;
            ganador="ROJO";
            
        }
        if(rec2>recmax){
            recmax=rec2;
            ganador="AZUL";
            
        }
        if(rec3>recmax){
            recmax=rec3;
            ganador="BLANCO";
            
        }
        if(rec4>recmax){
            recmax=rec4;
            ganador="NEGRO";
            
        }
        if((recmax>750)&&(cont==2)){
            System.out.println("El Auto "+ganador+" va ganando");
            cont++;
        }else{
           if((recmax>500)&&(cont==1)){
               System.out.println("El Auto "+ganador+" va ganando");
               cont++;
        }else{
            if((recmax>250)&&(cont==0)){
                System.out.println("El Auto "+ganador+" va ganando");
                cont++;
            }
        }
        }

        
        
    
    
    }
    
    System.out.println("El ganador de la carrera es el auto "+ganador);
}
}