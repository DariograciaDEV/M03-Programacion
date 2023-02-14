/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exuf1nf2;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class ExUF1NF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] llistaBoles = new int[10];

        inicialitzarLlistaBoles(llistaBoles);
        mostrarLlistaBoles(llistaBoles);
        introduirBolaLlista(llistaBoles);
    }

    public static int[] inicialitzarLlistaBoles(int[] llistaBoles) {
        //En aquesta funció inicialitzem la posició a -1
        for (int i = 0; i < llistaBoles.length; i++) {
            llistaBoles[i] = -1;
        }
        return llistaBoles;
    }

    public static void mostrarLlistaBoles(int[] llistaBoles) {
        //mostrem la llista de les boles.
        for (int i = 0; i < llistaBoles.length; i++) {
            System.out.print(llistaBoles[i]);
            System.out.print(" * ");
        }
        System.out.println("");
    }

    public static boolean introduirBolaLlista(int[] llistaBoles) {
        //S'ha d'anar omplint les posición que el valor sigui -1, si posa un altre valor voldrà dir que ja hi ha una bola
        int bola = 0;
        boolean valor = true;
        for (int i = 0; i < llistaBoles.length; i++) {
            if (bola != -1) {
                return false;
            }
        }
        return true;
    }
}
