/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_2;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Javier
 */
public class Carrera extends JFrame{
    JPanel[]   paneles;
    JLabel[]    labels;
    String[]  nombre = new String[4];
    JButton   boton;
    int ancho = 700;
    

    

    public Carrera(){
        nombre[0]=("11");
        nombre[1]=("4");
        nombre[2]=("6");
        nombre[3]=("7");
        setLayout (new GridLayout(0,1));
        paneles = new JPanel[4];
        labels = new JLabel[4];
        for (int i = 0; i < 4; i++) {
            paneles[i]=new JPanel();
            add(paneles[i]);
            labels[i]= new JLabel(nombre[i]);
            labels[i].setIcon(new ImageIcon(getClass().getResource(nombre[i]+".png")));
            paneles[i].add(labels[i]);
            labels[i].setLocation(0,0);
        }
        boton=new JButton("Comenzar Carrera");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        Cars Auto1 = new Cars("Auto1",ancho-10,labels[0]);
        Cars Auto2 = new Cars("Auto2",ancho-10,labels[1]);
        Cars Auto3 = new Cars("Auto3",ancho-10,labels[2]);
        Cars Auto4 = new Cars("Auto4",ancho-10,labels[3]);
        
        Auto1.start();
       
        Auto2.start();
        Auto3.start();
        Auto4.start();
            }
        });
        add(boton);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200, 250);
        setSize(ancho,250);
        setVisible(true);
    }
    
    public static void main(String[] args){
        Carrera carrera = new Carrera();
    }
    
}
