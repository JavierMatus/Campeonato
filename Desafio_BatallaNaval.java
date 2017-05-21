/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio_batallanaval;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Desafio_BatallaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        int pos_x = 5, pos_y = 5, jugadores = 2, barcox, barcoy, barcox_j1, barcoy_j1, barcox_cpu, barcoy_cpu;
        int barco1_1x = 0, barco1_2x = 0, barco1_3x = 0, barco1_4x = 0, barco1_5x = 0, barco2_1x = 0, barco2_2x = 0, barco2_3x = 0, barco2_4x = 0, barco2_5x = 0;
        int barco1_1y = 0, barco1_2y = 0, barco1_3y = 0, barco1_4y = 0, barco1_5y = 0, barco2_1y = 0, barco2_2y = 0, barco2_3y = 0, barco2_4y = 0, barco2_5y = 0;
        int aciertosj1 = 0, aciertoscpu = 0;

        int[][][] batalla = new int[jugadores][pos_x][pos_y];

        for (int i = 0; i < jugadores; i++) {
            for (int j = 0; j < pos_x; j++) {
                for (int k = 0; k < pos_y; k++) {
                    batalla[i][j][k] = 0;
                }
            }
        }
        System.out.println("    ================MAPA=================");
        System.out.println("    =====================================");

        System.out.println("   (X)->1\t2\t3\t4\t5");
        System.out.println("   (Y)===================================");
        for (int j = 0; j < pos_x; j++) {
            if (j == 0) {
                System.out.print("");
            }
            System.out.print("    " + (j + 1) + "|");
            for (int k = 0; k < pos_y; k++) {

                System.out.print("\t" + batalla[0][j][k]);
            }
            System.out.println("");
        }
        System.out.println("    ======================================");

        for (int j = 0; j < 5; j++) {
            do {
                do {
                    System.out.print("Elegir coordenadas en X(número horizontal) para asignar una posición al barco " + (j + 1) + ": ");
                    barcox = intro.nextInt();
                    if ((barcox < 1) || (barcox > 5)) {
                        System.out.println("Elegir coordenada entre 1 y 5");
                    }
                } while ((barcox < 1) || (barcox > 5));

                do {
                    System.out.print("Elegir coordenadas en Y(número vertical) para asignar una posición al barco " + (j + 1) + ": ");
                    barcoy = intro.nextInt();
                    if ((barcoy < 1) || (barcoy > 5)) {
                        System.out.println("Elegir coordenada entre 1 y 5");
                    }
                } while ((barcoy < 1) || (barcoy > 5));

                if (batalla[0][barcoy - 1][barcox - 1] == 4) {
                    System.out.println("Ingrese otra coordenada, ya hay un barco en esta posición ");
                }

            } while ((batalla[0][barcoy - 1][barcox - 1] == 4));

            batalla[0][barcoy - 1][barcox - 1] = 4;
            if (j == 0) {
                barco1_1x = barcox;
                barco1_1y = barcoy;
            }
            if (j == 1) {
                barco1_2x = barcox;
                barco1_2y = barcoy;
            }
            if (j == 2) {
                barco1_3x = barcox;
                barco1_3y = barcoy;
            }
            if (j == 3) {
                barco1_4x = barcox;
                barco1_4y = barcoy;
            }
            if (j == 4) {
                barco1_5x = barcox;
                barco1_5y = barcoy;
            }
        }

        for (int j = 0; j < 5; j++) {
            do {
                barcox = (int) (Math.random() * (6 - 1) + 1);

                barcoy = (int) (Math.random() * (6 - 1) + 1);

            } while ((batalla[1][barcoy - 1][barcox - 1] == 4));

            batalla[1][barcoy - 1][barcox - 1] = 4;

            if (j == 0) {
                barco2_1x = barcox;
                barco2_1y = barcoy;
            }
            if (j == 1) {
                barco2_2x = barcox;
                barco2_2y = barcoy;
            }
            if (j == 2) {
                barco2_3x = barcox;
                barco2_3y = barcoy;
            }
            if (j == 3) {
                barco2_4x = barcox;
                barco2_4y = barcoy;
            }
            if (j == 4) {
                barco2_5x = barcox;
                barco2_5y = barcoy;
            }
        }

        System.out.println("----------------------------------------");

        System.out.println("\n\n    ============JUGADOR  (1)=============              ================(CPU)==============");
        System.out.print("   (X)→ 1\t2\t3\t4\t5            ");
        System.out.println(" (X)→ 1\t2\t3\t4\t5");
        System.out.println("   (Y)===================================             (Y)=================================");
        System.out.println("    ↡ ===================================              ↡ =================================");
        for (int j = 0; j < pos_x; j++) {

            System.out.print("   |" + (j + 1) + "|");
            for (int k = 0; k < pos_y; k++) {

                System.out.print("\t" + batalla[0][j][k]);
            }
            System.out.print("             |" + (j + 1) + "|  ");

            for (int k = 0; k < pos_y; k++) {
                System.out.print(+batalla[1][j][k] + "\t");
            }
            System.out.println("      ");
        }
        System.out.println("    ======================================             ====================================");
        System.out.println("     NOTA: 0=AGUA(ESPACIO SIN ASIGNAR); 1=DISPARO ACERTADO; 4=BARCO; 8=DISPARO NO ACERTADO");
        for (int i = 0; i < 25; i++) {
            System.out.println("DISPARO: " + (i + 1));
            do {
                do {
                    System.out.print("Elegir coordenadas de X a la que disparará: ");
                    barcox_j1 = intro.nextInt();
                    if ((barcox_j1 < 1) || (barcox_j1 > 5)) {
                        System.out.println("Elegir coordenada entre 1 y 5");
                    }
                } while ((barcox_j1 < 1) || (barcox_j1 > 5));

                do {

                    System.out.print("Elegir coordenadas de Y a la que disparará: ");
                    barcoy_j1 = intro.nextInt();

                    if ((barcoy_j1 < 1) || (barcoy_j1 > 5)) {
                        System.out.println("Elegir coordenada entre 1 y 5");
                    }

                } while ((barcoy_j1 < 1) || (barcoy_j1 > 5));

                if (((batalla[1][barcoy_j1 - 1][barcox_j1 - 1]) != 0) || ((batalla[1][barcoy_j1 - 1][barcox_j1 - 1]) != 4)) {
                    System.out.println("Ingrese otro dispara, disparo ya realizado");
                }

            } while ((batalla[1][barcoy_j1 - 1][barcox_j1 - 1] != 0) && (batalla[1][barcoy_j1 - 1][barcox_j1 - 1]) != 4);

            batalla[1][barcoy_j1 - 1][barcox_j1 - 1] = 8;

            do {

                barcox_cpu = (int) (Math.random() * (6 - 1) + 1);

                barcoy_cpu = (int) (Math.random() * (6 - 1) + 1);

            } while ((batalla[0][barcoy_cpu - 1][barcox_cpu - 1] != 0) && (batalla[0][barcoy_cpu - 1][barcox_cpu - 1] != 4));

            batalla[0][barcoy_cpu - 1][barcox_cpu - 1] = 8;

            if ((barco2_1x == barcox_j1) && (barco2_1y == barcoy_j1)) {
                aciertosj1 += 1;
                batalla[1][barcoy_j1 - 1][barcox_j1 - 1] = 1;
            }
            if ((barco2_2x == barcox_j1) && (barco2_2y == barcoy_j1)) {
                aciertosj1 += 1;
                batalla[1][barcoy_j1 - 1][barcox_j1 - 1] = 1;
            }
            if ((barco2_3x == barcox_j1) && (barco2_3y == barcoy_j1)) {
                aciertosj1 += 1;
                batalla[1][barcoy_j1 - 1][barcox_j1 - 1] = 1;
            }
            if ((barco2_4x == barcox_j1) && (barco2_4y == barcoy_j1)) {
                aciertosj1 += 1;
                batalla[1][barcoy_j1 - 1][barcox_j1 - 1] = 1;
            }
            if ((barco2_5x == barcox_j1) && (barco2_5y == barcoy_j1)) {
                aciertosj1 += 1;
                batalla[1][barcoy_j1 - 1][barcox_j1 - 1] = 1;
            }

            if ((barco1_1x == barcox_cpu) && (barco1_1y == barcoy_cpu)) {
                aciertoscpu += 1;
                batalla[0][barcoy_cpu - 1][barcox_cpu - 1] = 1;
            }
            if ((barco1_2x == barcox_cpu) && (barco1_2y == barcoy_cpu)) {
                aciertoscpu += 1;
                batalla[0][barcoy_cpu - 1][barcox_cpu - 1] = 1;
            }
            if ((barco1_3x == barcox_cpu) && (barco1_3y == barcoy_cpu)) {
                aciertoscpu += 1;
                batalla[0][barcoy_cpu - 1][barcox_cpu - 1] = 1;
            }
            if ((barco1_4x == barcox_cpu) && (barco1_4y == barcoy_cpu)) {
                aciertoscpu += 1;
                batalla[0][barcoy_cpu - 1][barcox_cpu - 1] = 1;
            }
            if ((barco1_5x == barcox_cpu) && (barco1_5y == barcoy_cpu)) {
                aciertoscpu += 1;
                batalla[0][barcoy_cpu - 1][barcox_cpu - 1] = 1;
            }

            System.out.println("     ====================================");

            System.out.println("\n\n    ============JUGADOR  (1)=============              ================(CPU)==============");
            System.out.print("   (X)→ 1\t2\t3\t4\t5            ");
            System.out.println(" (X)→ 1\t2\t3\t4\t5");
            System.out.println("   (Y)===================================             (Y)=================================");
            System.out.println("    ↡ ===================================              ↡ =================================");
            for (int j = 0; j < pos_x; j++) {

                System.out.print("   |" + (j + 1) + "|");
                for (int k = 0; k < pos_y; k++) {

                    System.out.print("\t" + batalla[0][j][k]);
                }
                System.out.print("             |" + (j + 1) + "|  ");

                for (int k = 0; k < pos_y; k++) {
                    System.out.print(+batalla[1][j][k] + "\t");
                }
                System.out.println("      ");
            }
            System.out.println("    ======================================             ====================================");
            System.out.println("     NOTA: 0=AGUA(ESPACIO SIN ASIGNAR); 1=DISPARO ACERTADO; 4=BARCO; 8=DISPARO NO ACERTADO");

            System.out.println("Número de aciertos Jugador 1: " + aciertosj1 + "\t Número de aciertos CPU: " + aciertoscpu);

            if (aciertoscpu == 5) {
                System.out.println("Gana el CPU. Perdiste:(");
                break;
            }
            if (aciertosj1 == 5) {
                System.out.println("Gana el Jugador 1. Felicidades :D");
                break;
            }

        }

    }

}
