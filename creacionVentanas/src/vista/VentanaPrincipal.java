/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 *
 * @author dagr5755
 */
public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal(String titulo) {
        super(titulo);
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void anyadir_label() {
        JLabel etiqueta = new JLabel("Hello World");
        this.getContentPane().add(etiqueta);
    }

    public void afegirBoto() {
        JButton boto = new JButton("Presiona");
        boto.setSize(30, 30);
        this.getContentPane().add(boto);
    }
    public void etiquetasBorderLayout(){
        Container panel_contenedor = this.getContentPane();
        panel_contenedor.setLayout(new BorderLayout());
        
           JLabel [] etiquetas = new JLabel[5];
        etiquetas [0] = new JLabel("Superior");
        etiquetas [0].setBackground(Color.red);
        etiquetas [1] = new JLabel("Inferior");
        etiquetas [1].setBackground(Color.BLUE);
        etiquetas [2] = new JLabel("Centre");
        etiquetas [2].setBackground(Color.green);
        etiquetas [3] = new JLabel("Izquierda");
        etiquetas [3].setBackground(Color.yellow);
        etiquetas [4] = new JLabel("Derecha");
        etiquetas [4].setBackground(Color.PINK);
        
        for (int i = 0; i < etiquetas.length; i++) {
            
        }
        
    }
    
}
