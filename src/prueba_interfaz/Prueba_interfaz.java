/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba_interfaz;

import eu.hansolo.steelseries.extras.Led;
import eu.hansolo.steelseries.gauges.DisplayMulti;
import eu.hansolo.steelseries.tools.LcdColor;
import eu.hansolo.steelseries.tools.LedColor;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;


/**
 *
 * @author User
 */
public class Prueba_interfaz {
 private JFrame frame;   
 private JPanel panel; 
 private JLabel label;
 private Led ledprueba;
 private DisplayMulti display;
    /**
     * @param args the command line arguments
     */
 
 public void iniciacomponentes(){
     frame= new JFrame(); 
     label= new JLabel("PRUEBA");
     panel=new JPanel();
     ledprueba = new Led();
     display= new DisplayMulti();
     frame.setVisible(true);
     frame.setSize(500, 300);
     frame.setLocationRelativeTo(null);
     //frame.add(label);
    // frame.add(panel);
   //  frame.add(ledTempAmb);
     frame.add(display);
     
     
    }      
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba_interfaz prueba ;
        prueba= new Prueba_interfaz();
        prueba.iniciacomponentes();
        
        
    }
    
}
