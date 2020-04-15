package taller;

import java.awt.Color;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Taller extends JFrame {
    public JPanel panel;
    public JButton boton;
    public Taller(){
        setSize(300,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Peliculas del dia");
        setLocationRelativeTo(null);
        iniciarComponentes();
        //this.getContentPane().setBackground(Color.blue);
    }
    private void iniciarComponentes(){
        
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
    }
    private void colocarPaneles(){
        panel= new JPanel();
        panel.setLayout(null);
        //panel.setBackground(Color.GREEN);
        this.getContentPane().add(panel);
    }
    private void colocarEtiquetas(){
        JLabel etiqueta= new JLabel("Peliculas:");
        JLabel etiqueta1= new JLabel("Entradas:");
        JLabel etiqueta2= new JLabel("Total costo entrada:");
        panel.add(etiqueta);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        etiqueta.setBounds(5, 0, 200, 100);
        etiqueta1.setBounds(5, 5, 800, 500);
        etiqueta2.setBounds(5, 5, 1000, 700);
    }
    public void  colocarBotones(){
        JButton boton1= new JButton("1. Pelicula");
        boton1.setBounds(5, 70, 100, 20);
        panel.add(boton1);
        JButton boton2= new JButton("2. Pelicula");
        boton2.setBounds(5, 100, 100, 20);
        panel.add(boton2);
        JButton boton3= new JButton("3. Pelicula");
        boton3.setBounds(5, 130, 100, 20);
        panel.add(boton3);
        JButton boton4= new JButton("4. Pelicula");
        boton4.setBounds(5, 160, 100, 20);
        panel.add(boton4);
        JButton boton5= new JButton("5. Pelicula");
        boton5.setBounds(5, 190, 100, 20);
        panel.add(boton5);
        JButton boton6= new JButton("6. Pelicula");
        boton6.setBounds(150, 70, 100, 20);
        panel.add(boton6);
        JButton boton7= new JButton("7. Pelicula");
        boton7.setBounds(150, 100, 100, 20);
        panel.add(boton7);
        JButton boton8= new JButton("8. Pelicula");
        boton8.setBounds(150, 130, 100, 20);
        panel.add(boton8);
        JButton boton9= new JButton("9. Pelicula");
        boton9.setBounds(150, 160, 100, 20);
        panel.add(boton9);
        JButton boton10= new JButton("10. Pelicula");
        boton10.setBounds(150, 190, 100, 20);
        panel.add(boton10);
        JButton boton11= new JButton("Conoce el costo");
        boton11.setBounds(40, 400, 200, 20);
        panel.add(boton11);  
    }
           
               
           
        
                                                                                  
        
    }            

