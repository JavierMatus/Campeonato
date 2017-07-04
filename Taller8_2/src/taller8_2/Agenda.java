/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public final class Agenda {

    private String texto;
    private Path archivo;

    public Agenda(String txt, Path archivo) {
        this.texto = txt;
        this.archivo=archivo;
        Menu();

    }

    

    public void setArchivo(Path archivo) {
        this.archivo = archivo;
    }

    public Path getArchivo() {
        return archivo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void Menu() {
        int contacto;

        Scanner intro = new Scanner(System.in);
        int opc;
        do {

            System.out.println("Eliga opción a realizar");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar todos");
            System.out.println("3. Buscar");
            System.out.println("4. Salir");
            opc = intro.nextInt();
            switch (opc) {

                case 1:
                    Agregar();
                    break;

                case 2:
                    MostrarTodo();
                    break;

                case 3:
                    Buscar();
                    break;

                case 4:
                    System.exit(0);
                    ;
                    break;

                default:
                    System.out.println("Ingrese una opción válida");

            }

        } while (opc != 4);

    }

    public void Agregar() {
        Scanner intro = new Scanner(System.in);
        System.out.println("===================================================");
        int cont = 0,contactos = 0;
        boolean coincidencia = false,valido = true;
        String rut,direc,telef,nombre;
        
        
        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '\n') {
                contactos++;
            }
        }
        
        
        
        
       
        
        
        
        if (contactos<100) {
            do{
            System.out.print("Ingrese RUT: ");
        rut = intro.nextLine();
        
        
            
        for (int i = 0; i < texto.length(); i++) {
            if (rut.charAt(cont) == texto.charAt(i)) {
                cont++;
                if (cont == rut.length()) {
                    System.out.println("Éste rut ya está registrado en la agenda");
                    coincidencia = true;
                    break;
                }
            } else {
                cont = 0;

            }

        }
        
        }while(valido == false);

        if ((coincidencia == false)) {
            System.out.print("Ingrese nombre: ");
            nombre = intro.nextLine();
            System.out.print("Ingrese dirección: ");
            direc = intro.nextLine();
            System.out.print("Ingrese teléfono: ");
            telef = intro.nextLine();

            texto = texto + "\n" + rut + ";" + nombre + ";" + direc + ";" + telef; 
            try {
                Files.write(archivo, texto.getBytes());

                System.out.println("Se ha guardado el contacto");
                

            } catch (IOException e) {
                System.out.println("El archivo no pudo ser guardado");
            }
        }
        }else{
            System.out.println("Se ha ingresado el máximo ");
        }

        
        System.out.println("===================================================");

    }

    public void MostrarTodo() {
        char matriz[] = new char[texto.length()];
        char aux = '\t';

        System.out.println("===================================================");

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) == ';') {
                matriz[i] = '\t';
            } else {
                matriz[i] = texto.charAt(i);
            }
        }
        System.out.println("Rut\t\tNombre\tDirección\tTeléfono");
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(matriz[i]);
        }

        System.out.println("\n===================================================");

    }

    public void Buscar() {
        Scanner intro = new Scanner(System.in);
        char matriz[] = new char[texto.length()];

        System.out.println("===================================================");

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) == ';') {
                matriz[i] = '\t';
            } else {
                matriz[i] = texto.charAt(i);
            }
        }

        int cont = 0;
        boolean coincidencia = false;
        System.out.print("Ingrese el rut: ");
        String buscar = intro.nextLine();
        int aux = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (buscar.charAt(cont) == texto.charAt(i)) {
                cont++;
                if (cont == buscar.length()) {
                    System.out.println("Se encontró");
                    aux = i;
                    coincidencia = true;
                    break;
                }
            } else {
                cont = 0;

            }

        }

        if (coincidencia == true) {
            System.out.println("Rut\t\tNombre\tDirección\tTeléfono");
            System.out.print(buscar);
            for (int i = aux; i < texto.length(); i++) {
                if (matriz[i] == '\n') {
                    break;
                } else {
                    System.out.print(matriz[(i)]);
                }

            }
        } else {
            System.out.println("No se encuentran coincidencias");
        }

        System.out.println("\n===================================================");

    }

}
