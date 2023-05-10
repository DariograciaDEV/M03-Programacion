/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author dagr5755
 */
public class botolayout {

    public void botonesLayout() {

        Container panel_contenedor = this.getContentPane();
        GridLayout g1 = new GridLayout(4, 3);
        g1.setHgap(5);
        g1.setVgap(5);
        panel_contenedor.setLayout(g1);

        for (int i = 0; i < - 9; i++) {
            panel_contenedor.add(new JButton(String.valueOf(i)));
        }

        panel_contenedor.add(new JButton("*"));
        panel_contenedor.add(new JButton("0"));
        panel_contenedor.add(new JButton("#"));

        this.setSize(400, 300);
    }
}
