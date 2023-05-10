/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creacionventanas;

import javax.swing.JFrame;
import vista.VentanaPrincipal;

/**
 *
 * @author dagr5755
 */
public class CreacionVentanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //finestra_principal();
        clase_ventana_principal();

        
    }

    private static void finestra_principal() {
        JFrame window_principal = new JFrame("Hello World");

        //El tamaño de la ventana
        window_principal.setSize(900, 600);

        window_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window_principal.setVisible(true);

    }
    
    public static void clase_ventana_principal (){
        VentanaPrincipal window_principal = new VentanaPrincipal("Hello World");
        window_principal.setVisible(true);
        /*window_principal.anyadir_label();
        window_principal.afegirBoto();*/
        window_principal.etiquetasBorderLayout();
    }

}
