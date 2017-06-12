/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_2;

public class Carrera {

    int tramo, veloc1, veloc2, veloc3, veloc4, posc1 = 1, posc2 = 2, posc3 = 3, posc4 = 4, rec1, rec2, rec3, rec4;
    int[] recorrido = new int[4];

    Carrera(int largo) {
        this.tramo = largo;
    }

    public void setTramo(int tramo) {
        this.tramo = tramo;
    }

    public int getTramo() {
        return tramo;
    }

    public void Recorrido() {

    }

    public void velocidades() {

        veloc1 = (int) (Math.random() * 5) + 1;

    }

    public void RecMayor() {

        for (int i = 0; i < 4; i++) {
            int aux = i + 1;
            veloc1 = (int) (Math.random() * 5) + 1;
            recorrido[i] += veloc1;
            if (recorrido[i] >= rec1) {
                
                
                
                if (aux == posc4) {

                    posc4 = posc3;
                    posc3 = posc2;
                    posc2 = posc1;

                }
                if (aux == posc3) {

                    posc2 = posc1;
                    posc3 = posc2;

                }

                if (aux == posc2) {
                    posc2 = posc1;
                }

                posc1 = aux;
                rec1 = recorrido[i];

            } else {
                if (recorrido[i] >= rec2) {

                    if (aux == posc4) {

                        posc3 = posc2;
                        posc2 = posc1;

                    }
                    if (aux == posc3) {

                        posc3 = posc2;

                    }

                    posc2 = aux;
                    rec2 = recorrido[i];

                } else {
                    if (recorrido[i] >= rec3) {
                        if (aux == posc4) {

                            posc4 = posc3;

                        }

                        posc3 = aux;
                        rec3 = recorrido[i];

                    } else {
                        
                            posc4 = aux;
                            rec4 = recorrido[i];
                        
                    }

                }

            }

        }

        System.out.println("posicion 1, auto:" + posc1);
        System.out.println("posicion 2, auto:" + posc2);
        System.out.println("posicion 3, auto:" + posc3);
        System.out.println("posicion 4, auto:" + posc4);
    }

}
