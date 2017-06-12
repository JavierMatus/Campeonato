
/**
 * Write a description of class prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prueba
{
    public int preguntas = 10;
    public int [] respuesta = new int [preguntas];
    int [] correctas = new int [preguntas];
    private int alter_correctas;
    private int puntaje;

    public void setRespuesta(int[] respuesta) {
        this.respuesta = respuesta;
    }

    public int[] getRespuesta() {
        return respuesta;
    }
    
    

    public prueba(int[] resp) {
        for (int i = 0; i < preguntas; i++) {
            this.respuesta[i]=resp[i];
        }
    }
    
    public void altercorrectas(){
        for (int i = 0; i < 10; i++) {
            this.correctas[i] = (int) (Math.random() * 3)+1;
        }
    }
    
    public void resultado(){
        float notafinal = 0;
        
        for (int i = 0; i < 10; i++) {
            if (correctas[i]==respuesta[i]) {
                alter_correctas+=1;
                puntaje+=10;
            }
        }
        
        if (puntaje>=60) {
             notafinal = (float)(puntaje*0.06) +1;
        }
        if (puntaje<60) {
             notafinal = (float)(puntaje*0.05) +1;
        }
        
        System.out.println("\nNota Final: "+notafinal);
        System.out.println("CORRECTAS: "+alter_correctas);
    
    }

   
}
