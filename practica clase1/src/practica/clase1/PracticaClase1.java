/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.clase1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dagr5755
 */
public class PracticaClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*try {
            int a = 4, b = 0;
            double div = a / b;
            System.out.println("resultat" + div);
        } catch (Exception e) {
            System.out.println("Exception generado en main " + e.getMessage());
            e.printStackTrace();//Muestra el volcat que ens mostra per defecte java
        }*/

 /*declareu un array de int de 1 posicio
        Recorreo l'array des de la posicio 0
        fins que la posicio menor 10
        mostrar el array [posicio]*/
 /*int [] valor = new int [3];
        for (int i = 0; i < 10; i++) {
            System.out.println(valor[i]);
        }*/
        try {
            metodoPedirEntero();
        } catch (InputMismatchException ex) {
            System.out.println("No has puesto un entero.");
        }
        //pausa1segundo();
        System.out.println("Final programa");
    }

    private static void pausa1segundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Pausa interrumpida");
        }
    }

    private static void metodoPedirEntero() {
        Scanner sc = new Scanner(System.in);
        int entero;
        entero = 9;
        System.out.println("Introduce un entero.");
        entero = sc.nextInt();
    }
}
