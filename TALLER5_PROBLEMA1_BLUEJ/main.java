import java.util.Scanner; 
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    
    
    public static void main(String[] args) {
        
        int preguntas = 10;
        String opc;
        Scanner intro = new Scanner(System.in);
        int [] resp = new int [preguntas];

        for (int i = 0; i < preguntas; i++) {
            System.out.print("Ingrese respuesta a la pregunta "+(i+1)+"(a.b ó c): ");
            opc = intro.nextLine();
            
            
            if ("a".equals(opc)){
                resp[i] = 1;
            }
            if ("b".equals(opc)) {
                resp[i] = 2;
            }
            if ("c".equals(opc)) {
                resp[i] = 3;
            }
            
        }
        
        
        
        prueba eval = new prueba(resp);
        eval.altercorrectas();
        eval.resultado();
        
        
    }
}
